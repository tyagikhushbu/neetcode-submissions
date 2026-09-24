# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        
        rightElem = list()
        queue = deque()
        level = 0;

        if not root:
            return rightElem
        
        queue.append(root)

        while queue:
            for i in range(len(queue)):
                node = queue.popleft()
                if i != 0:
                    rightElem[level]= node.val
                else:
                    rightElem.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            level=level+1                    
                    
        return rightElem
    
        
            



        

