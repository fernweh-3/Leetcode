def maxDepth_dfs(self, root: Optional[TreeNode]) -> int:
    stack = [(root,1)]
    res = 0
    while stack:
        node,depth = stack.pop()
        if node:
            stack.append((node.left,depth+1))
            stack.append((node.right, depth+1))
            res = max(depth,res)
    return res

def maxDepth_bfs(self, root: Optional[TreeNode]) -> int:
    que = deque()
    if root:
        que.append(root)
    res = 0
    while que:
        for i in range(len(que)):
            node = que.popleft()
            if node.left:
                que.append(node.left)
            if node.right:
                que.append(node.right)
        res+=1
    return res
