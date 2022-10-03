class Solution
{
    public int sumOfAll(int l, int r)
    {
        int dp[] = new int[r+1];
        dp[1] = 1;
        
        for(int i = 2; i <= r; i++) {
            if(dp[i] == 0) {
                for(int j = i; j <= r; j += i) {
                    dp[j] += i;
                }
            }
        }
        int sum = 0;
        for(int i = l; i <= r; i++) {
            sum += dp[i];
        }
        return sum;
    }
}
