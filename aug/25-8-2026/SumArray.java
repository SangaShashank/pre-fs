/*Program to find find the sum of the elements of an 
array using recursion

Sample Input and Output:
input=
5
1 2 3 4 5
output=
15

input=
4
7 8 9 10
output=34
*/
import java.util.*;
public class SumArray{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++) arr[i] = s.nextInt();
        System.out.println(sum_array(arr,0,n-1));
    }
    public static int  sum_array(int arr[],int sum,int i){
        if(i < 0) return sum;
        sum += arr[i];
        return sum_array(arr,sum,i-1);
    }
}
// https://claude.ai/share/4860334d-391e-4fd8-a7fa-0fb0afd0101b
