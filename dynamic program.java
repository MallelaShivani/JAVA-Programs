public class dp {
    static int c; // optional: to count steps/iterations
    static int fib(int n) {
        c = 0;
        if (n < 0) {
            System.out.println("Error: Negative number");
            return -1;
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            c++;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println("\nTotal iterations: " + c);
    }
}
