public class Pell {
    public Pell() {
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");
        if(n == 0 || n == 1){
            return n;
        }
        long[] dp = new long[n + 1];
        dp[1] = 1;
        for (int i = 2;i <= n;i++){
            dp[i] = dp[i - 1] * 2 + dp[i - 2];
        }
        return dp[n];
    }
}
