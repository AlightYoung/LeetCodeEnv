class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def convert(nums: list) -> TreeNode:
    length = len(nums)
    if not length:
        return None
    nodes = []
    for i in range(length):
        tmp = TreeNode(nums[i]) if nums[i] != -1 else None
        nodes.append(tmp)
    total = 1
    cur_depth = 0
    while total < length:
        cur_depth += 1
        cur_size = 2 ** (cur_depth - 1)
        for i in range(cur_size):
            cur_index = i + total - cur_size
            if not nodes[cur_index]:
                continue
            left_child_index = cur_index + (cur_size - i - 1) + (i + 1) * 2 - 1
            right_child_index = cur_index + (cur_size - i - 1) + (i + 1) * 2
            nodes[cur_index].left = nodes[left_child_index]
            nodes[cur_index].right = nodes[right_child_index]
        total += 2 ** cur_depth
    return nodes[0]


if __name__ == '__main__':
    convert([1, 2, 3, -1, -1, 4, 5, -1, -1, -1, -1, 6, 7, 8, 9])