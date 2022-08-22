package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeIMPL {


    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

    }

    static int index = -1;

    static Node binaryTree(int[] arr) {
        index++;
        if (arr[index] == -1) return null;


        Node node = new Node(arr[index]);
        node.left = binaryTree(arr);
        node.right = binaryTree(arr);
        return node;

    }
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
//                if(q.isEmpty()==false)
//                System.out.println(curr.data);
            if (curr == null) {
                System.out.println();
                //queue empty
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.value + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    static void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.value + "  ");
        preorder(node.left);
        preorder(node.right);

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, -1, -1, 5, -1, -1};

        Node node = binaryTree(nodes);
//
//        preorder(node);
        levelOrder(node);
//        System.out.println(node.left.value);
//        System.out.println(node.left.left.left);


    }
}
