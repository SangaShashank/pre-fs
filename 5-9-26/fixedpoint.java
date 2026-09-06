/*Given a sorted array arr[] of n distinct integers (can include negative numbers), find an index i such that arr[i] == i. If no such index exists, return -1. 
If multiple such indices exist, return the smallest one.
Example 1:
Input: arr[] = [-10, -5, 0, 3, 7]
Output: 3
Explanation: arr[3] == 3

Example 2:
Input: arr[] = [0, 2, 5, 8, 17]
Output: 0
Explanation: arr[0] == 0

Example 3:
Input: arr[] = [-10, -5, 3, 4, 7, 9]
Output: -1
Explanation: No index i satisfies arr[i] == i

Constraints:

Array is sorted in ascending order
Elements are distinct (can be negative, zero, or positive)
1 <= n <= 10^5
Need the smallest index if multiple fixed points exist*/
import java.util.*;
public class fixedpoint{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(fixed_point(arr));
    }
    public static int fixed_point(int arr[]){
        int l = 0, u = arr.length-1;
        int res = -1;
        while(l <=u){
            int mid = l + (u-l)/2;
            if(arr[mid] == mid){
                 res = mid;
                u = mid -1;
            }
            else if(arr[mid] > mid){
                u = mid - 1;
            }
            else {
                l = mid +1;
            }
        }
        return res;
    }   
}