import java.util.*;
class Solution {
    public int maxTask(int[] h, int[] l) {
    if (h == null || l == null) return 0;
    int n = Math.min(h.length, l.length); // Use the smaller length to avoid out of bounds
    
    if (n == 0) return 0;
    if (n == 1) return Math.max(h[0], l[0]);

    int[] dp = new int[n];
    dp[0] = Math.max(h[0], l[0]);
    dp[1] = Math.max(h[1], dp[0] + l[1]);

    for (int i = 2; i < n; i++) {
        dp[i] = Math.max(dp[i - 1] + l[i], dp[i - 2] + h[i]);
    }

    return dp[n - 1];
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int [n];
        int[] l = new int [m];
         for(int i =0;i<n;i++){
            h[i] = sc.nextInt();
        }
        for(int j =0;j<m;j++){
            l[j] = sc.nextInt();
        }
        Solution so = new Solution();
        int total_sum = so.maxTask(h,l);
        System.out.println(total_sum);
    }
}