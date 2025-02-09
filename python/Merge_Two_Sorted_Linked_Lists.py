from typing import Optional

# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
    if list1 is None:
        return list2
    if list2 is None:
        return list1
    if list1.val <= list2.val:
        list1.next = self.mergeTwoLists(list1.next, list2)
        return list1
    else:
        list2.next = self.mergeTwoLists(list1, list2.next)
        return list2


def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        res = head = ListNode()
        while list1 and list2:
            if list1.val > list2.val:
                head.next = list2
                list2 = list2.next
            else:
                head.next = list1
                list1 = list1.next
            head = head.next
        head.next = list1 or list2
        return res.next