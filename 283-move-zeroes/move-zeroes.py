class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        j=0
        temp=0l
        for i in range(len(nums)):
            if(nums[i]!=0):
                temp=nums[j]
                nums[j]=nums[i]
                nums[i]=temp
                j+=1
        # return nums        