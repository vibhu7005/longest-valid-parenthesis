public class Solution {
    public int longestValidParentheses(String A) {
        int left=0,right=0,max_length=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='(')
            left++;
            else
            right++;
            if(left==right)
            {
                max_length=Math.max(max_length,left*2);
            }
            if(right>left)
            {
                left=right=0;
            }
        }
        left=right=0;
        for(int i=A.length()-1;i>=0;i--)
        {
            if(A.charAt(i)==')')
            right++;
            else
            left++;
            if(left==right)
            {
                max_length=Math.max(max_length,left*2);
            }
            if(left>right)
            {
                left=right=0;
            }
        }
        return max_length;
    }
}

