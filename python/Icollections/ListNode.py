class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __str__(self):
        ret = []
        while self:
            if self.next is not None:
                ret.append('(' + str(self.val) + '-->' +
                           str(self.next.val) + ')')
            else:
                ret.append('(' + str(self.val) + '--> None )')
            self = self.next
        return ret.__str__()


def convert(arr: list) -> ListNode:
    length = len(arr)
    if not length:
        return None
    nodes = []
    for i in range(length):
        nodes.append(ListNode(arr[i]))
    for i in range(length - 1):
        nodes[i].next = nodes[i + 1]
    return nodes[0]


def reverseList(head: ListNode) -> ListNode:
    def changeNext(pre, head):
        if not head:
            return pre
        next = head.next
        head.next = pre
        pre = head
        return changeNext(pre, next)

    return changeNext(None, head)