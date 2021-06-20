import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeLevelOrder {

    // Using PreOrder Traversal


    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;


        TreeNode(int data){
            this.data= data;
        }
    }

    public void addNodeToBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
    
        root =first;
        root.left=second;
        root.right=third;

        second.left=fourth;
        second.right=fifth;
    }

    public void levelOrder(TreeNode root){
        if (root==null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            System.out.print(temp.data + " ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
    }
    

    public static void main(String[] args) {
        BinaryTreeLevelOrder bt = new BinaryTreeLevelOrder();

        bt.addNodeToBinaryTree();
        bt.levelOrder(bt.root);
    }
}
