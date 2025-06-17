package xyz;
class Node{
	String data;
	Node left,right;
	Node (String data){
		this.data=data;
		}
}

public class BinaryTree {

	public static void main(String[] args) {
		Node root = new Node("Mom");
        root.left = new Node("Dad");
        root.right = new Node("You");

        System.out.println("Root: " + root.data);
        System.out.println("Left child: " + root.left.data);
        System.out.println("Right child: " + root.right.data);

        System.out.println("Top to bottom:");
        printTopToBottom(root);

        System.out.println("Total nodes: " + countNodes(root));
        System.out.println("Leaf nodes: " + countLeaves(root));

        System.out.print("In-order: ");
        printInOrder(root);
        System.out.println();

        mirror(root);
        System.out.print("Mirrored In-order: ");
        printInOrder(root);
        System.out.println();

        System.out.println("Paths:");
        printPaths(root, "");

        System.out.println("Is tree empty? " + (root == null));
    }

    static void printTopToBottom(Node node) {
        if (node != null) {
            System.out.println(node.data);
            printTopToBottom(node.left);
            printTopToBottom(node.right);
        }
    }

    static int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    static int countLeaves(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }

    static void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }

    static void mirror(Node node) {
        if (node == null) return;
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirror(node.left);
        mirror(node.right);
    }

    static void printPaths(Node node, String path) {
        if (node == null) return;
        path += node.data + " ";
        if (node.left == null && node.right == null) {
            System.out.println(path);
        }
        printPaths(node.left, path);
        printPaths(node.right, path);
    }
}
