package dsa.tree;

public class BinaryTree {

    private TreeNode root;

    private static class TreeNode{
        private final int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }
    }



    public  void createBinaryTree() {
        root= new TreeNode(1);
        TreeNode first= new TreeNode(2);
        TreeNode second= new TreeNode(3);
        TreeNode third= new TreeNode(4);
        TreeNode fourth= new TreeNode(5);
        TreeNode five= new TreeNode(6);

        root=first;
        first.left=second;
        first.right=third;

        second.left=fourth;
        second.right=five;

    }

    public static void main(String[] args) {
          BinaryTree bt=new BinaryTree();
          bt.createBinaryTree();
          bt.preOrder(bt.root);
          bt.inOrder(bt.root);
          bt.postOrder(bt.root);
    }


    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        preOrder(root.left);
        System.out.println(root.data+" ");
        preOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.data+" ");
    }
}
