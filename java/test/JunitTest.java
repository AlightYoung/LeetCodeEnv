package test;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import collection.TreeNode;

@SuppressWarnings({ "unused" })
public class JunitTest {

    private static PrintStream out = System.out;
    private int ans;

    @Test
    public void test() throws Exception {
        // TODO mergeTrees()
        // TODO diameterOfBinaryTree()
        System.out.println(projectionArea(new int[][]{}));
    }

    public int projectionArea(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        for (int x = 0; x < n; x++) {
            for (int y : grid[x]) {
                
            }
        }
        return ans;
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode head = new TreeNode(root1.val + root2.val);
        head.left = mergeTrees(root1.left, root2.left);
        head.right = mergeTrees(root1.right, root2.right);
        return head;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        dfs(root);
        return ans - 1;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int l = dfs(node.left);
        int r = dfs(node.right);
        ans = Math.max(l + r + 1, ans);
        return Math.max(l, r) + 1;
    }

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            max = Math.max(max, IntStream.of(account).sum());
        }
        return max;
    }

}
