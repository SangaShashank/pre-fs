/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a 
different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any 
profit, return 0.

Example 1:
Input: 
6
7 1 5 3 6 4
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before 
you sell.

Example 2:
Input: 
5
7 6 4 3 1
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
*/
import java.util.*;
public class BestTime{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        int n  = s.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++) arr[i] = s.nextInt();
        System.out.println(best_time(arr));
        
    }
    public static int best_time(int arr[]){
       int  buy = Integer.MAX_VALUE;
        int   profit = 0;
        for(int i=0;i<arr.length;i++){
            buy = Math.min(arr[i],buy);
            profit = Math.max(arr[i] - buy,profit);
        }
        if(profit >0){
            return profit;
        }
        return profit;
       
}
}