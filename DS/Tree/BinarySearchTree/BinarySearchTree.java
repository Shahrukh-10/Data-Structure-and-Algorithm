import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;

import javax.management.Query;

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public void insertNode(int key) {
        root = insert(root, key);
    }

    public void searchKey(int key) {
        root = search(root, key);
    }

    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int data) {

        if (root == null || root.data == data) {
            System.out.println(root.data);
            return root;
        } else {
            if (data < root.data) {
                return search(root.left, data);
            } else {
                return search(root.right, data);
            }
        }

    }

    public void levelOrder(){
        if (root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.print(temp.data);
            if (temp.left!=null) {
                q.offer(temp.left);
            }
            if (temp.right!=null) {
                q.offer(temp.right);
            }
        }
       System.out.println();
    }
    

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insertNode(5);
        bt.insertNode(4);
        bt.insertNode(3);
        bt.insertNode(6);
        bt.insertNode(7);
        bt.levelOrder();
        bt.searchKey(7);
    }
    
}
