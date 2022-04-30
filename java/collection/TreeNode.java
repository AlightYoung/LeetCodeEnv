package collection;

import util.ParamUtil;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // generate a tree from an array
    public static TreeNode tree(Object[] array) {
        int n = array.length;
        if (array == null || n == 0) {
            return null;
        }
        TreeNode[] nodes = new TreeNode[n];
        for (int i = 0; i < n; i++) {
            if (array[i] == null) {
                continue;
            }
            nodes[i] = new TreeNode((int) array[i]);
        }
        for (int i = 0; i < n / 2; i++) {
            if (nodes[i] == null) {
                continue;
            }
            int rChildIdx = (i + 1) * 2, lChildIdx = rChildIdx - 1;
            nodes[i].left = lChildIdx < n ? nodes[lChildIdx] : null;
            nodes[i].right = rChildIdx < n ? nodes[rChildIdx] : null;
        }
        preorderTraversal(nodes[0]);
        return nodes[0];
    }

    public static TreeNode tree(String str) {
        return tree(ParamUtil.numArr(str));
    }

    // preorder traversal
    public static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    // postordere traversal
    public static void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    // inorder traversal
    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }
}
