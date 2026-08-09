package STRIVERS_SHEET.SORTING_TECHNIQUES.Merge_Sort;

import java.util.*;
public class Solution {
    private static void merge(int[] arr,int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] lArr = new int[n1];
        int[] rArr = new int [n2];

        for(int x =0;x<n1;x++){
            lArr[x] = arr[l+x];
        }


        for(int x =0;x<n2;x++){
            rArr[x] = arr[mid+1+x];
        }
        int i=0;
        int j=0;
        int k =l;
        while(i<n1 && j<n2){
            if(lArr[i]<rArr[j]){
             arr[k] = lArr[i];
             i++;
            }else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }



    }
    private static int[] Merge_Sort(int[] arr,int l,int r){
        if(l<r){
        int mid = (l+(r-1))/2;
        Merge_Sort( arr,l,mid);
        Merge_Sort(arr, mid+1, r);
        merge(arr,l,mid,r);
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {23,56,76,3,5,8,4,7};
        int l =0; 
        int r = 7;
        Solution so = new Solution();
        int[] sorted_array = so.Merge_Sort(arr, l, r);
        System.out.println(Arrays.toString(sorted_array));
    }
    
}
