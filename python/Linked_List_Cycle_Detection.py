from typing import Optional

# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


def hasCycle(self, head: Optional[ListNode]) -> bool:
    seen = set()
    cur = head
    while cur:
        if cur in seen:
            return True
        seen.add(cur)
        cur = cur.next
    return False