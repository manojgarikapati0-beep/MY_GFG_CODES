package GFG.GFG_4;

import java.util.*;

class Solution {
    public int zigzagSequence(int[][] mat) {
        // code here
        int sum = 0;
        // Random rand = new Random();
        for (int i = 0; i < mat.length; i++) {
            int[] current_Array = mat[i];
            for (int j = 0; j < current_Array.length; i++) {
                int max = current_Array[j];
                if (current_Array[j + 1] > max) {
                    max = current_Array[j + 1];
                }
                sum += max;
            }

            if (i + 1 < mat.length) {
                int[] next_Array = mat[i + 1];
            }

        }
        return sum;
    }

    public static void main(String args[]) {
        int[][] mat1 = {
                { 3, 1, 2 },
                { 4, 8, 5 },
                { 6, 9, 7 }
        };

        // Test Case 2
        int[][] mat2 = {
                { 1, 2, 4 },
                { 3, 9, 6 },
                { 11, 3, 15 }
        };
        Solution so = new Solution();
        int Sum = so.zigzagSequence(mat1);
        int Sum2 = so.zigzagSequence(mat2);
        System.out.println(Sum + " " + Sum2);
    }
}
