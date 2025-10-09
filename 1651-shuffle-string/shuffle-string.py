class Solution:
    def restoreString(self, s: str, ind: List[int]) -> str:
        l=[0]*len(s)
        for i in range(len(s)):
            l[ind[i]]=s[i]
        return ''.join(l)
            
        