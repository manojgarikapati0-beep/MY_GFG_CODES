import java.util.*;
class Solution {
    public int countMinOperations(int arr[]) {
        int steps = 0;
        int i=0;
       while(true){
           int zeroCount =0;
           for( i =0;i<arr.length;i++){
               if(arr[i] % 2!=0){
                   arr[i]-=1;
                   steps++;
               }
               if(arr[i] ==0){
               zeroCount++;
               }
           }
           if(zeroCount==arr.length){
               break;
               }
           for(i=0;i<arr.length;i++){
               arr[i] = arr[i]/2;
           }
           steps++;
       }
       return steps;
        
    }
    public static void main(String args[]){
        Solution so = new Solution();
        int arr[] = {16,16,16};
        int total_steps = so.countMinOperations(arr);
        System.out.println(total_steps);
    }
}
