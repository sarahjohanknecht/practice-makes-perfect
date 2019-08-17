class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        map = {} #key: integer number, value: index

        for i in range(0, len(nums)):
            num = nums[i]
            if target-num in map:
                return [map[target-num], i]
            map[num] = i
