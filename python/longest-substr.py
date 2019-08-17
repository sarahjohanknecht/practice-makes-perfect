class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        max_sub = 0
        s_dict = {}
        substr = []

        for i in range(0, len(s)):
            if s[i] not in substr:
                substr.append(s[i])
            else:
                while(s[i] in substr):
                    substr.pop(0)
                substr.append(s[i])
                
            if len(substr) > max_sub:
                max_sub = len(substr)

        return max_sub
