class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashmap = {}

        for i in range(len(nums)):
            if nums[i] not in hashmap:
                hashmap[nums[i]] = i
            else:
                return True
        return False
        
        