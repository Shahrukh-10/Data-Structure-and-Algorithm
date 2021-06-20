import java.util.Stack;

public class BinaryTreeUsingInOrder {

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

    public void inOrder(TreeNode root){  //RECURSION
         if (root == null) {
             return;
         }
         inOrder(root.left);
         System.out.print(root.data+" ");
         inOrder(root.right);
    }

    public void iterativeinOrder(TreeNode root){
        if (root==null) {
            return;
        }
        System.out.println();
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;

        while (!st.isEmpty() || temp != null) {
            if (temp!=null) {
                st.push(temp);
                temp = temp.left;
            }
            else{
                temp = st.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeUsingInOrder bt = new BinaryTreeUsingInOrder();

        bt.addNodeToBinaryTree();
        bt.inOrder(bt.root);
        bt.iterativeinOrder(bt.root);
    }
}
