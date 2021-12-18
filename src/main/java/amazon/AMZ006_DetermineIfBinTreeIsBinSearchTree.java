package amazon;

import other.Node;

public class AMZ006_DetermineIfBinTreeIsBinSearchTree {

    public static boolean isBinarySearchTree(Node root) {
        return _isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean _isBinarySearchTree(Node root, int minValue, int maxValue) {
        if (root == null)
            return true;

        if (root.value < minValue || root.value > maxValue)
            return false;

        return _isBinarySearchTree(root.left, minValue, root.value) &&
                _isBinarySearchTree(root.right, root.value, maxValue);
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

        System.out.println(isBinarySearchTree(n8));

        Node n100 = new Node(100);
        Node n50 = new Node(50);
        Node n25 = new Node(25);
        Node n75 = new Node(75);
        Node n200 = new Node(200);
        Node n90 = new Node(90);

        n100.left = n50;
        n100.right = n200;
        n50.left = n25;
        n50.right = n75;
        n200.left = n90;

        System.out.println(isBinarySearchTree(n100));
    }
}
