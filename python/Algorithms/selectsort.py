def selectionSort(nums: list):
    l = len(nums)
    for i in range(l):
        min = i
        for j in range(i+1, l):
            if nums[min] > nums[j]:
                min = j
        tmp = nums[i]
        nums[i] = nums[min]
        nums[min] = tmp
    return nums
