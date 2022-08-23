package Trees;

import java.util.HashSet;
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

    static void leftView(Node n) {
        hashSet.add(n.value);
        if (n != null) {

            if (n.right == null && n.left == null) return;
            if (n.left != null) {
                Node N1 = n.left;
                hashSet.add(n.left.value);
                leftView(N1);
            } else if (n.right != null) {
                Node N1 = n.right;
                hashSet.add(n.right.value);
                leftView(N1);
            }

        } else return;
    }

    static void rightView(Node n) {
        hashSet.add(n.value);
        if (n != null) {

            if (n.right == null && n.left == null) return;
            if (n.right != null) {
                Node N1 = n.right;
                hashSet.add(n.right.value);
                rightView(N1);
            } else if (n.left != null) {
                Node N1 = n.left;
                hashSet.add(n.left.value);
                rightView(N1);
            }

        } else return;
    }


    static HashSet<Integer> hashSet = new HashSet<>();


    public static void main(String[] args) {
        int[] nodes = new int[]{1, 2, 3, -1, -1, 6, -1, -1, 3, 4, -1, 6, -1, -1, -1};
//{1, 2, 3, -1, 4, -1, -1, -1, 5, -1, -1};
//

        Node node = binaryTree(nodes);
        rightView(node);
        leftView(node);
        System.out.println(hashSet);
//        preorder(node);
//        levelOrder(node);
//        System.out.println(node.left.value);
//        System.out.println(node.left.left.left);

    }
}
