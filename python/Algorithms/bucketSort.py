def bucketSort(nums, bucketSize):
    def insertionSort(arr):
        for i in range(1, len(arr)):
            cur = arr[i]
            bef = cur - 1
            while bef >= 0 and arr[bef] > cur:
                arr[bef + 1] = arr[bef]
                bef -= 1
            arr[bef + 1] = cur
        return arr

    buckets = [[] for _ in range(bucketSize)]
    for num in nums:
        buckets[int(bucketSize * num)].append(num)
    for i in range(bucketSize):
        buckets[i] = insertionSort(buckets[i])
    sortIndex = 0
    for i in range(bucketSize):
        for j in range(len(buckets[i])):
            nums[sortIndex] = buckets[i][j]
            sortIndex += 1
    return nums


nums = [0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434]
print(bucketSort(nums, 10))
