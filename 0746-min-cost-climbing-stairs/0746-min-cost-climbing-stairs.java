class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // Index Match: Size n + 1 so dp[n] represents the top floor
        int[] dp = new int[n + 1]; 
        
        // Base cases: You can start at index 0 or index 1 for free
        dp[0] = 0;
        dp[1] = 0;
        
        // Accumulate costs to reach each subsequent step
        for (int i = 2; i <= n; i++) {
            int alternative1 = dp[i - 1] + cost[i - 1]; // came from i-1, paid cost[i-1]
            int alternative2 = dp[i - 2] + cost[i - 2]; // came from i-2, paid cost[i-2]
            
            dp[i] = Math.min(alternative1, alternative2);
        }
        
        // dp[n] is the minimum cost to reach the top floor beyond all steps
        return dp[n];
    }
}
