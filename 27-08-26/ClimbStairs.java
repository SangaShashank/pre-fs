/*
Program to count the number of ways to climb n steps using recursion
Given n stairs, a person can climb either 1 or 2 steps at a time. 
Find the total number of ways to reach the top.

Sample Input and Output:
input=8
output=34

input=4
output=5

*/
import java.util.*;
public class ClimbStairs{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(fib_rec(n));
    }
    public static int fib_rec(int n){
        if(n <= 2){
            return n;
        }
        return fib_rec(n-1) + fib_rec(n-2);
    }
}