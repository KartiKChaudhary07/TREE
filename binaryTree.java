public class binaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binary {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, -1, -1, 4, 5}; // Example array representing the binary tree
        Node root = Binary.buildTree(nodes);
        System.out.println("Root data: " + root.data); // Print the data of the root node
    }
}
