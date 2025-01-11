from collections import deque
from typing import Optional

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def isSameTree_dfs(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
    if not p and not q:
        return True
    if p and q and p.val == q.val:
        return self.isSameTree(p.left,q.left) and self.isSameTree(p.right,q.right)
    else:
        return False

def isSameTree_bfs(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
    q1 = deque([p])
    q2 = deque([q])

    while q1 and q2:
        nodeP = q1.popleft()
        nodeQ = q2.popleft()

        if nodeP is None and nodeQ is None:
            continue
        if nodeP is None or nodeQ is None or nodeP.val != nodeQ.val:
            return False

        q1.append(nodeP.left)
        q1.append(nodeP.right)
        q2.append(nodeQ.left)
        q2.append(nodeQ.right)

    return True