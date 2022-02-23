package IUtils;

import java.util.ArrayList;
import java.util.List;

import ICollections.Node;
import ICollections.TreeNode;

public class CollectionBuilder {
    public static TreeNode buildTree(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return null;
        }
        List<TreeNode> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            TreeNode tmp = null;
            int val = arr[i];
            if (val != -1) {
                tmp = new TreeNode(val);
            }
            nodes.add(tmp);
        }
        for (int j = 0; j < n / 2; j++) {
            TreeNode cur = nodes.get(j);
            if (cur != null) {
                cur.left = nodes.get((j + 1) * 2 - 1);
                cur.right = nodes.get((j + 1) * 2);
            }
        }
        return nodes.get(0);
    }

    public static Node buildList(int[] arr) {
        int n = arr.length;
        if (n < 1) {
            return null;
        }
        Node head = new Node(arr[0]);
        int i = -1;
        Node cur = head;
        while (++i < n - 1) {
            cur.next = new Node(arr[i + 1]);
            cur = cur.next;
        }
        return head;
    }
}