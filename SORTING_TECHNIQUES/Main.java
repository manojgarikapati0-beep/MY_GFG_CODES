//package SORTING_TECHNIQUES;
import java.util.*;

class Solution1 {
    public int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}

class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] nums = new int[n];
       for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution1 sl = new Solution1();
        int[] sorted_array = sl.selectionSort(nums);
        System.out.println("Sorted array is: "+ Arrays.toString(sorted_array));        
    }
}