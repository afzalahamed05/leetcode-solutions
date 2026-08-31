class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1]; // number of ways to reach each step
        dp[0]=1;
        dp[1]=1; // base case
        
        for(int i=2;i<n+1;i++)
        {
            dp[i]=dp[i-2]+dp[i-1];
        }
        
        return dp[n];
    }
}