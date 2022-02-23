package test;

import java.util.*;
import java.util.stream.Collectors;

import Algorithms.Manacher;
import ICollections.Node;
import ICollections.Pair;
import ICollections.TreeNode;
import IUtils.CollectionBuilder;
import IUtils.Printer;

public class Test {
    public static void main(String[] args) {
        // TreeNode root = CollectionBuilder.buildTree(new int[]{1,2,3,-1,4,5,-1});
        // Node head = CollectionBuilder.buildList(new int[]{1,2,3,4,5});
        // Pair[] pairs = {new Pair(1, 3), new Pair(2, 2), new Pair(3, 1)};
        // Arrays.sort(pairs, (x, y) -> (int)x.key - (int)y.key);
        // for (Pair pair : pairs) {
        //     System.out.println(pair.value);   
        // }
        int[] arr = {1,2,3};
        List<Integer> list= new ArrayList<>();
        System.out.println(Arrays.toString(arr));
    }
}
