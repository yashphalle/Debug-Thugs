// Problem Name: Change Bits
//--------------------------------------
// Given a number N, complete the following tasks,
// Task 1. Generate a new number from N by changing the zeroes in the binary representation of N to 1.
// Task  2. Find the difference between N and the newly generated number.

 

// Example 1:

// Input: N = 8 
// Output: 7 15
// Explanation:
// There are 3 zeroes in binary representation
// of 8. Changing them to 1 will give 15.
// Difference between these two is 7.

// Example 2:

// Input: N = 6 
// Output: 1 7
// Explanation:
// There is 1 zero in binary representation
// of 6. Changing it to 1 will give 7.
// Difference between these two is 1.
 

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function changeBits() which takes an integer N as input parameter and returns a list of two integers containing the difference and the generated number respectively.

 

// Expected Time Complexity: O(log(N))
// Expected Auxiliary Space: O(1)

 

// Constraints:
// 0 <= N <= 108


















//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            int[] ans = ob.changeBits(N);
            System.out.println(ans[0]+ " "+ ans[1]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
     static int[] changeBits(int N) {

        // code here

        String s=Integer.toBinaryString(N);

        String s1="";

        for(int i=0;i<s.length();i++)

        {

            if(s.charAt(i)=='0')

            {

                s1+='1';

            }

            else

            {

                s1+='1';

            }

        }

        //System.out.print(s1);

        int l=Integer.parseInt(s1,4);

        int bal=l-N;

        return new int[]{bal,l};
}
         
     };
