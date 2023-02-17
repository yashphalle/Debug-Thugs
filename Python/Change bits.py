# Change Bits



# Given a number N, complete the following tasks,
# Task 1. Generate a new number from N by changing the zeroes in the binary representation of N to 1.
# Task  2. Find the difference between N and the newly generated number.

 

# Example 1:

# Input: N = 8 
# Output: 7 15
# Explanation:
# There are 3 zeroes in binary representation
# of 8. Changing them to 1 will give 15.
# Difference between these two is 7.

# Example 2:

# Input: N = 6 
# Output: 1 7
# Explanation:
# There is 1 zero in binary representation
# of 6. Changing it to 1 will give 7.
# Difference between these two is 1.
 

# Your Task:
# You don't need to read input or print anything. Your task is to complete the function changeBits() which takes an integer N as input parameter and returns a list of two integers containing the difference and the generated number respectively.

 

# Expected Time Complexity: O(log(N))
# Expected Auxiliary Space: O(1)

 

# Constraints:
# 0 <= N <= 108

#User function Template for python
import math
from math import *
class Solution:
    def changeBits(self, N):
        # code here 
        a = int(math.log(N,2) -1)
        a = pow(2,a) - 1
        return a-N,a


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N=int(input())
        
        ob = Solution()
        ans = ob.changeBits(N)
        
        print(ans[0],ans[1])
# } Driver Code Ends