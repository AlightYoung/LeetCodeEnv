def shellsort(nums: list):
    n = len(nums)
    h = 1
    while h < n // 3:
        h = h * 3 + 1
    while h > 0:
        for i in range(h, n):
            j = i - h
            cur = nums[i]
            while j >= 0 and cur < nums[j]:
                nums[j + h] = nums[j]
                j -= h
            nums[j + h] = cur
        h = (h - 1) // 3
    return nums


if __name__ == '__main__':
    print(shellsort([12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]))
