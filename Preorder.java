public class Preorder{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+"");
        preorder(root.left);
        preorder(root.left);
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        preorder(root);

    }
}