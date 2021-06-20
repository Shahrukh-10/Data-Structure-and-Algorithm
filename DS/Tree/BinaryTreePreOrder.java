import java.util.Stack;

public class BinaryTreePreOrder {

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

    public void preOrder(TreeNode root){  //RECURSION
         if (root == null) {
             return;
         }
         System.out.print(root.data+" ");
         preOrder(root.left);
         preOrder(root.right);
    }

    public void iterativepreOrder(TreeNode root){
        if (root==null) {
            return;
        }
        System.out.println();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            TreeNode temp = st.pop();
            System.out.print(temp.data + " ");

            if (temp.right!=null) {
                st.push(temp.right);
            }
            if (temp.left!=null) {
                st.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreePreOrder bt = new BinaryTreePreOrder();

        bt.addNodeToBinaryTree();
        bt.preOrder(bt.root);
        bt.iterativepreOrder(bt.root);
    }
}
