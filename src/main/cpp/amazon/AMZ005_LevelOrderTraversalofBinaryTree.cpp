#include <queue>
#include <iostream>

using namespace std;

template <typename T> 
class Node
{
    public:
        T value;
        Node<T> * left;
        Node<T> * right;
};

template <typename T>
void level_order_traversal(Node<T> * root){
    queue<Node<T>*> nodes_queue;
    queue<int> levels_queue;
    int current_level;
    Node<T> * p = root;

    nodes_queue.push(p);
    levels_queue.push(0);

    while(true){
        p = nodes_queue.front();
        nodes_queue.pop();
        current_level = levels_queue.front();
        levels_queue.pop();

        cout << p->value;

        if(p->left != 0){
            nodes_queue.push(p->left);
            levels_queue.push(current_level+1);
        }

        if(p->right != 0){
            nodes_queue.push(p->right);
            levels_queue.push(current_level+1);
        }

        if(nodes_queue.empty()){
            cout << endl;
            break;
        }

        if(current_level == levels_queue.front()){
            cout << ", ";
        } else {
            cout << endl;
        }
    }
}

Node<int>* create_node(int value, Node<int>* left, Node<int>* right){
    Node<int> * p = new Node<int>();
    p->left = left;
    p->right = right;
    p->value = value;
    return p;
}

int main() {
    /*
    Example:
        100
       /   \
      50   200
     /  \    \
    25  75   350
    */

    Node<int> * p;
    p = create_node(25,0,0);
    Node<int> * q;
    q = create_node(75,0,0);
    Node<int> * r;
    r = create_node(50,p,q);
    p = create_node(350,0,0);
    q = create_node(200,0,p);
    p = create_node(100,r,q);
    level_order_traversal(p);
}