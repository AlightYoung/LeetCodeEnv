package Algorithms;

import java.util.Random;

public class Quicksort {

    public static void randomizedQuicksort(int[] nums, int l, int r) {
        if (l < r) {
            int mid = randomizedPartion(nums, l, r);
            randomizedQuicksort(nums, l, mid - 1);
            randomizedQuicksort(nums, mid + 1, r);
        }
    }

    private static int randomizedPartion(int[] nums, int l, int r) {
        int pivot = new Random().nextInt(r - l) + l;
        swap(nums, r, pivot);
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (nums[j] < nums[r]) {
                i++;
                swap(nums, i, j);
            }
        }
        i++;
        swap(nums, i, r);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        randomizedQuicksort(new int[] {3,1,4,5,2}, 0, 4);
    }
}
