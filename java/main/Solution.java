package main;

class Solution {

    public static void main(String[] args) {
        new Solution().minDeletionSize(new String[] { "rrjk","furt","guzm" });
    }

    public int minDeletionSize(String[] strs) {
        int ans = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    ans += 1;
                    break;
                }
            }
        }
        return ans;
    }
}