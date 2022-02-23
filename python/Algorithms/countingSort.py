from itertools import count


import random


def countingSort(nums, bucketLen):
    bucket = [0] * bucketLen
    for num in nums:
        bucket[num] += 1
    sortIndex = 0
    for i in range(bucketLen):
        while bucket[i] > 0:
            nums[sortIndex] = i
            sortIndex += 1
            bucket[i] -= 1
    return nums

print(countingSort([random.randint(0,99) for _ in range(100)], 100))
