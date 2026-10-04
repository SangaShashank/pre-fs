/*
Minimum product subset of an array
The minimum product subset of an array refers to a subset of elements from the
array such that the product of the elements in the subset is minimized.

Input : 
5
-1 -1 -2 4 3
Output : -24
Explanation : Minimum product will be ( -2 * -1 * -1 * 4 * 3 ) = -24

Input :
2
-1 0
Output : -1
Explanation : -1(single element) is minimum product possible

Input : 
3
0 0 0
Output : 0
*/
import java.util.*;
public class MinProductSubset{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(min_product(arr));
    }
    public static int min_product(int arr[]){
        int count = 0;
        boolean is_zero  = false;
        boolean is_positive = true;
        int max_negative = Integer.MIN_VALUE;
        int min_positive = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                is_positive = false;
                count++;
                max_negative = Math.max(arr[i],max_negative);
            }
            else if(arr[i] == 0){
                is_zero = true;
            }
            else{
                min_positive = Math.min(min_positive,arr[i]);
            }
        }
        int res = 1;
        if(count % 2 ==0 && !is_zero){
            for(int i=0;i<arr.length;i++){
                res *= arr[i];
            }
            res =  res/max_negative;
        }
        else if(count % 2 != 0 && !is_zero){
            for(int i=0;i<arr.length;i++){
                res *= arr[i];
            }
        }
        else if(is_zero && is_positive){
            return 0;
        }
       else{
        res = min_positive;
       }
       return res;
    }
}