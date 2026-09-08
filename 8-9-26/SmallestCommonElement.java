/*
There are B bags containing N gold boxes each. In each bag, gold boxes are 
arranged  in ascending order of their weights strictly, create a method in 
such a way that we need to return the least weight of gold box which is 
common least weight in all the given bags.

If we don’t have any common least weighted gold box, 
among all the bags then return -1.

Input Format:
-------------
Line-1: Two integers B and N, number of bags and number of goldboxes in each Bag.
Next B lines: N space separated integers, weights of GoldBoxes.

Output Format:
--------------
Print the least weight of gold box, if found
Print -1, if not found.


Sample Input:
---------------
5 5
1 2 3 4 5
2 3 6 7 9
1 2 3 5 8
1 3 4 6 8 
2 3 5 7 8

Sample Output:
----------------
3
*/
import java.util.*;
public class SmallestCommonElement{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int m= s.nextInt();
        int n = s.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(bs_2d(arr,m,n));
        System.out.println(optimal(arr,m,n));
    }
    public static int bs_2d(int arr[][],int m,int n){
       for(int j=0;j<n;j++){
           int count = 0;
           for(int i=1;i<m;i++){
          boolean res = is_present(arr,arr[0][j],i,n-1);
          if(res){
              count ++;
          }
          else{
              break;
          }
       }
       if(count == m-1 ){
           return arr[0][j];
       }
       }
       return -1;
    }
    public static boolean is_present(int arr[][],int k,int i,int u){
        int l = 0;
        while(l<=u){
            int mid = l + (u-l)/2;
            if(arr[i][mid] == k){
                return true;
            }
            else if(arr[i][mid] >k){
                u = mid -1;
            }
            else{
                l = mid +1;
            }
        }
        return false;
    }
    public static int optimal(int arr[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=)
        }
    }
    
}