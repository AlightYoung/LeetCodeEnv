package IUtils;

import java.util.ArrayList;
import java.util.List;

import ICollections.Node;
import ICollections.TreeNode;

public class Printer {
    public static void print(Object object) {
        System.out.println(object.toString());
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        while (!isAllNull(nodes)) {
            List<TreeNode> tmp = new ArrayList<>();
            for (TreeNode node : nodes) {
                if (node == null) {
                    System.out.print(-1 + " ");
                }
                else {
                    System.out.print(node.val + " ");
                    tmp.add(node.left);
                    tmp.add(node.right);
                }
            }
            nodes = tmp;
        }
    }

    public static void printList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }

    private static Boolean isAllNull(List<TreeNode> nodes) {
        for (TreeNode node : nodes) {
            if (node != null) {
                return false;
            }
        }
        return true;
    }
}
