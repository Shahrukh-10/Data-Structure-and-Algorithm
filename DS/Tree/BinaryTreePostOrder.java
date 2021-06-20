import java.util.Stack;

public class BinaryTreePostOrder {

    // Using PreOrder Traversal

    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public void addNodeToBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        root.left = second;
        root.right = third;

        second.left = fourth;
        second.right = fifth;
    }

    public void postOrder(TreeNode root) { // RECURSION
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void iterativePostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println();
        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root;

        while (!st.isEmpty() || current != null) {
            if (current != null) {
                st.push(current);
                current = current.left;
            } else {
                TreeNode temp = st.peek().right;
                if (temp == null) {
                    temp = st.pop();
                    System.out.print(temp.data + " ");
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.pop();
                        System.out.print(temp.data + " ");
                    }
                }else{
                    current=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        BinaryTreePostOrder bt = new BinaryTreePostOrder();

        bt.addNodeToBinaryTree();
        bt.postOrder(bt.root);
        bt.iterativePostOrder(bt.root);
    }
}
