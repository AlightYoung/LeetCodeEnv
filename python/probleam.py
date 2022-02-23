def subArrayRanges(nums):
    # 子数组范围和 = 子数组最大值和-子数组最小值和
    # 单调栈用(最值, 影响的子数组数量)形式保存
    minStack, maxStack = [], []
    minSum, maxSum = 0, 0
    ans = 0
    # 遍历nums，相当于每次引入一个新元素cur，形成一批以cur为结尾的子数组
    for cur in nums:
        # count表示以当前元素cur为最值的子数组数量，初始为[num]自身
        minCount, maxCount = 1, 1
        # 分别检测单调栈，如果当前元素不大于/不小于栈顶元素
        # 则表示加入当前元素后，将替代之前栈顶元素所影响的子数组最小值/最大值
        # 同时，需要将被替代的子数组数量*子数组最值从总和中剔除
        while minStack and cur <= minStack[-1][0]:
            preMin, preMinCount = minStack.pop()
            minCount += preMinCount
            minSum -= preMin * preMinCount
        while maxStack and cur >= maxStack[-1][0]:
            preMax, preMaxCount = maxStack.pop()
            maxCount += preMaxCount
            maxSum -= preMax * preMaxCount
        # 将(当前值，影响的子数组数量)入栈
        minStack.append((cur, minCount))
        maxStack.append((cur, maxCount))
        # 计算以当前元素为最值的子数组对总和的影响
        minSum += cur * minCount
        maxSum += cur * maxCount
        ans += maxSum - minSum  # 累加子数组范围和
    return ans


subArrayRanges([4,-2,-3,4,1])