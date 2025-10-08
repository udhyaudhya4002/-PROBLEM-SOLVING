class Solution:
    def successfulPairs(self, sp: List[int], po: List[int], su: int) -> List[int]:
        res=[]
        po.sort()
        for s in sp:
            l,r=0,len(po)-1
            idx=len(po)

            while l<=r:
                m=(l+r)//2
                if s*po[m]>=su:
                    r=m-1
                    idx=m
                else:
                    l=m+1
            res.append(len(po)-idx)
        return res                


        