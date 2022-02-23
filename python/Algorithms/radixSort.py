def radixSort(nums):
    def countingSort(nums, exp, n):
        count = [0] * 10
        output = [0] * n
        for i in range(n):
            count[(nums[i] // exp) % 10] += 1
        for i in range(8, -1, -1):
            count[i] += count[i + 1]
        for i in range(n - 1, -1, -1):
            num = nums[i] // exp
            output[count[num % 10] - 1] = nums[i]
            count[num % 10] -= 1
        for i in range(n):
            nums[i] = output[i]

    n = len(nums)
    ma = max(nums)        
    exp = 1
    while ma // exp >= 1:
        countingSort(nums, exp, n)
        exp *= 10
    return nums


nums = [170, 45, 75, 90, 802, 24, 2, 66, 1000]
print(radixSort(nums))
