class Solution:
    def maxHeapify(self, heap, root, heapLen):
            p = root
            while p * 2 + 1 < heapLen:
                l, r = p * 2 + 1, p * 2 + 2
                if heapLen <= r or heap[r] < heap[l]:
                    nex = l
                else:
                    nex = r
                if heap[p] < heap[nex]:
                    heap[p], heap[nex] = heap[nex], heap[p]
                    p = nex
                else:
                    break
            
    def buildHeap(self, heap):
        for i in range(len(heap) - 1, -1, -1):
            self.maxHeapify(heap, i, len(heap))

    def heapSort(self, nums):
        self.buildHeap(nums)
        for i in range(len(nums) - 1, -1, -1):
            nums[i], nums[0] = nums[0], nums[i]
            self.maxHeapify(nums, 0, i)