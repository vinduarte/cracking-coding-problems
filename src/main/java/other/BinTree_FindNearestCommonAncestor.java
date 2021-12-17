package other;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BinTree_FindNearestCommonAncestor {

    public static Node findNearestCommonAncestorMuchBetter(Node root, Node a, Node b) {
        if (a.value < root.value && b.value > root.value) {
            return root;
        }

        if (a.value < root.value) {
            return findNearestCommonAncestorMuchBetter(root.left, a, b);
        }

        return findNearestCommonAncestorMuchBetter(root.right, a, b);
    }

    public static Node findNearestCommonAncestor(Node root, Node a, Node b) {
        Queue<Node> qA = binSearch(root, a);
        if (qA == null)
            return null;

        Queue<Node> qB = binSearch(root, b);
        if (qB == null)
            return null;

        Node ancestor = null;
        Node auxA, auxB;

        while (!qA.isEmpty() && !qB.isEmpty()) {
            auxA = qA.poll();
            auxB = qB.poll();

            if (auxA.value != auxB.value)
                return ancestor;

            ancestor = auxA;
        }

        return ancestor;
    }

    private static Queue<Node> binSearch(Node root, Node node) {
        return _binSearch(root, node, new LinkedBlockingQueue<Node>());
    }

    private static Queue<Node> _binSearch(Node root, Node node, Queue<Node> queue) {
        if (root == null)
            return null;
        if (root.value == node.value)
            return queue;
        queue.add(root);
        if (root.value > node.value)
            return _binSearch(root.left, node, queue);
        else
            return _binSearch(root.right, node, queue);
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n10 = new Node(10);
        Node n13 = new Node(13);
        Node n14 = new Node(14);

        n8.left = n3;
        n8.right = n10;
        n3.left = n1;
        n3.right = n6;
        n6.left = n4;
        n6.right = n7;
        n10.right = n14;
        n14.left = n13;

        Node x = findNearestCommonAncestor(n8, n1, n6);
        System.out.println("1 and 6 = " + x.value);

        x = findNearestCommonAncestor(n8, n3, n13);
        System.out.println("3 and 13 = " + x.value);

        x = findNearestCommonAncestorMuchBetter(n8, n1, n6);
        System.out.println("1 and 6 = " + x.value);

        x = findNearestCommonAncestorMuchBetter(n8, n3, n13);
        System.out.println("3 and 13 = " + x.value);
    }
}