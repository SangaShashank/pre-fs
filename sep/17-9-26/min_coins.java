/*
Minimum number of Coins:
-----------------------
Given an amount of n rupees and an unlimited supply of coins or notes of 
denominations {1, 2, 5, 10}. We have to find the minimum number of coins 
required to make up the given amount.

Examples:  
---------
Input: n= 39
Output: 6
Explanation: 39 can be formed using 3 coins of 10 rupees ,1 coin of 5 rupees and
2 coins of 2 rupees, so minimum coins required are 6.

Input: n = 121
Output: 13
Explanation: 121 can be formed using 12 coins of 10 rupees and 1 coin  of 1 rupees.
*/
import java.util.*;
public class min_coins{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int coins_array [] = {10,5,2,1};
        int n = s.nextInt();
        System.out.println(app1(coins_array,n));
        System.out.println(app2(coins_array,n));
    }
    public static int app1(int coins_array [],int n ){
        int i=0;
        int nc = 0;
        while(n!=0){
            while(n<coins_array[i] && i<coins_array.length-1) i++;
            nc+= n/coins_array[i];
            n = n%coins_array[i];
        }
        return nc;
    }
    public static int app2(int coins_array [],int n){
        int sum = 0;
        for(int i=0;i<coins_array.length;i++){
            sum += n/coins_array[i];
            n =  n%coins_array[i];
        }
        return sum ;
      }
}
