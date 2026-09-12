/*
Program to find find the sum of the elements of an array using Iteration

Sample Input and Output:
input=5
1 2 3 4 5
output=15

input=4
7 8 9 10
output=34

*/
import java.util.*;
public class SumArrayIter{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n<=0 ){
            return;
        }
        long  arr [] = new long[n];
        for (int i=0;i<n;i++) arr[i] = s.nextInt();
        System.out.println(sum(arr));
        
    }
    public static long  sum(long arr[]){
        long sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}
//https://claude.ai/share/af2cd624-59a3-4735-be0e-e6f5c929b586