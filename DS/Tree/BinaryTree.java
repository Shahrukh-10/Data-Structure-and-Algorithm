public class BinaryTree {

    // Using PreOrder Traversal


    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        TreeNode(int data){this.data= data;
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

    public Integer findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if (left > result) {
            result = left;
        }
        if (right > result) {
            result = right;
        }
        
        return result;
    }

  
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.addNodeToBinaryTree();
        System.out.println(bt.findMax(bt.root));
        
    }
}
