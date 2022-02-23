from collections import defaultdict
from typing import List
import random


class Solution:
    def countPairs(self, nums: List[int], k: int) -> int:
        dic = defaultdict(list)
        for i, num in enumerate(nums):
            dic[num].append(i)
        ans = 0
        m = k
        for k, v in dic.items():
            n = len(v)
            if n >= 2:
                for x in range(n - 1):
                    for y in range(x + 1, n):
                        if v[x] * v[y] % m == 0:
                            ans += 1
        return ans

# print(1 * 5 % 2)
Solution().countPairs([3, 1, 2, 2, 2, 1, 3], 2)
