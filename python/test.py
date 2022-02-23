class Test:

    def change(self, nums):
        nums = [num + 1 for num in nums]
    
    def test(self, nums):
        print(nums)
        self.change(nums)
        print(nums)

Test().test([1,2,3])