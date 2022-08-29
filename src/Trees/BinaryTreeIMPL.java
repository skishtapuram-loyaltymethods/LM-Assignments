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

        public Node() {

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


    //    static  void mirrorOfBT(Node nodeL,Node nodeR){
//        if(nodeL.left.value == nodeR.right.value)
//
//    }
//    static void topView(Node n) {
//        hashSet.add(n.value);
//        if (n != null) {
//
//            if (n.right == null && n.left == null) return;
//            if (n.left != null) {
//                Node N1 = n.left;
//                hashSet.add(n.left.value);
//                topView(N1);
//            }  if (n.right != null) {
//                Node N1 = n.right;
//                hashSet.add(n.right.value);
//                topView(N1);
//            }
//
//        } else return;
//    }

    static void topView(Node n) {
        hashSet.add(n.value);
        if (n != null) {

            if (n.right == null || n.left == null) return;


            if (n.left != null) {
                Node N1 = n.left;
                hashSet.add(n.left.value);
                topView(N1);
            }
            if (n.right != null) {
                Node N1 = n.right;
                hashSet.add(n.right.value);
                topView(N1);
            }

        } else return;
    }

    static void left1(Node node) {
        if (node == null) return;
        hashSet.add(node.value);
        left1(node.left);
    }

    static void right1(Node node) {
        if (node == null) return;
        hashSet.add(node.value);
        right1(node.right);
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

     void remove(Node node) {
node = null;
//
    }

    static void insertInBST(Node node, int val) {
        if (node.value == val) System.out.println("Already exits");
        if (node == null) return;


        if (node.value > val) {
            if (node.left == null) {
                node.left = new Node(val);
                return;
            }

            insertInBST(node.left, val);

        } else if (node.value < val) {
            if (node.right == null) {
                node.right = new Node(val);
                return;
            }


            insertInBST(node.right, val);

        }

    }


    static HashSet<Integer> hashSet = new HashSet<>();


    public static void main(String[] args) {
        int[] nodes = new int[]{50, 49, 46, 17, -1, 19, -1, -1, 47, -1, -1, -1, 55, -1, 60, -1, -1};

        Node node = binaryTree(nodes);
        BinaryTreeIMPL binaryTreeIMPL = new BinaryTreeIMPL();
        binaryTreeIMPL.remove(node);
//        insertInBST(node, 35);
//        rightView(node);
//        leftView(node);
//        topView(node);
        // top-view second way of doing
//        left1(node);
//        right1(node);
//        preorder(node);
        levelOrder(node);

    }



//    if (node.value == val) {
//            if(node.left != null && node.right != null) node.right = new Node(70);
//        }
////        else {
////            remove(node.left, val);
////            remove(node.right, val);
////        }
//        return;
}
