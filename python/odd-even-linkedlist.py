# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
import copy
class Solution(object):
    def oddEvenList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head or not head.next:
            return head

        odd = head
        first_even = even = head.next

        while odd and even:
            odd2 = even.next
            even2 = odd2.next if odd2 else None

            last_odd = odd
            odd.next = odd2
            even.next = even2
            # then increment odd and even to continue the loop
            odd, even = odd2, even2

        if odd:
            last_odd = odd

        last_odd.next = first_even
        return head
