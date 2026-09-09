import java.util.*;
class Solution {
    public int findMax(int n) {
        int best = n;
        int maxSum = digitSum(n);

        // Try modifying each digit from right to left to turn trailing digits into 9s
        int p = 1;
        while (n > 0) {
            // Drop current digit to 9 and decrease the prefix
            int candidate = (n - 1) * p + (p - 1);

            if (digitSum(candidate) > maxSum) {
                maxSum = digitSum(candidate);
                best = candidate;
            }

            n /= 10;
            p *= 10;
        }

        return best;
    }

    // Helper method to add up digits of a number
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); 
        Solution so = new Solution();
        so.findMax(n);
    }
}