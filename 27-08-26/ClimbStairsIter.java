/*
Program to count the number of ways to climb n steps using Iteration
Given n stairs, a person can climb either 1 or 2 steps at a time. 
Find the total number of ways to reach the top.

Sample Input and Output:
input=8
output=34

input=4
output=5

*/
import java.util.*;
public class ClimbStairsIter{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n <= 2){
            System.out.println(n);
            return;
        }
        int a = 0,b=1,c = 0;
        for(int i=1;i<=n;i++){
            c = a+b;
            a =b;
            b = c;
        }
        System.out.println(c);
        
    }
}