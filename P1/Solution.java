class Solution {
    public long countSubarray(int[] arr, int l, int r) {
        // code here
        return countSubarrayLessThanOREqual(arr,r)-countSubarrayLessThanOREqual(arr,l-1);
    }
    public long countSubarrayLessThanOREqual(int arr[], long maxSum){
        if(maxSum<0)  return 0;
        int left = 0;
        long currentSum =0;
        long  count=0;
        
        for(int right =0;right<arr.length;right++){
            currentSum+=arr[right];
            
          while(left <= right && currentSum>maxSum){
            currentSum-=arr[left];
            left++;
          }
          
          count += (right-left+1);
        }
        return count;
    }
    public static void main(String args[]){
        Solution so = new Solution();
        
        int[] arr = {1,4,6};
        int l = 3;
        int r=8;
        long ans = so.countSubarray(arr,l,r);
        System.out.println(ans);
    }
}