def mergeSort(self, nums, l, r):
        if l == r:
            return
        mid = (l + r) // 2
        self.mergeSort(nums, l, mid)
        self.mergeSort(nums, mid + 1, r)
        tmp = []
        i, j = l, mid + 1
        while i <= mid or j <= r:
            if i > mid or (j <= r and nums[j] < nums[i]):
                tmp.append(nums[j])
                j += 1
            else:
                tmp.append(nums[i])
                i += 1
        nums[l: r + 1] = tmp

def sortArray(self, nums: List[int]) -> List[int]:
    self.mergeSort(nums, 0, len(nums) - 1)
    return nums