/*
A number is called Happy if repeatedly replacing the number by the 
sum of the squares of its digits eventually reaches 1. 
Write a java program to check whether a number is happy or not using recursion
Sample Input and Output:
input=19
output=true

input=18
output=false

Example
19 -> 1²+9²=82
82 -> 8²+2²=68
68 -> 6²+8²=100
100-> 1²+0²+0²=1
Happy Number
*/

import java.util.*;
public class HappyRec{


    public static void main(String args[]){


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
         HashSet <Integer> st = new HashSet<>();
        System.out.println(happy_check(n,st));
    }
    public static Boolean happy_check(int n,Set <Integer> s)
    {
       if(n ==1 ){
           return true;
       }
       else if(s.contains(n)){
           return false;
       }
       s.add(n);
        int ss = squ_sum(n);
        return happy_check(ss,s);
       
    } 
    

public static int squ_sum(int n ){
    if(n ==0){
        return 0;
    }
    int r = n%10;
    return r*r + squ_sum(n/10);
}


}