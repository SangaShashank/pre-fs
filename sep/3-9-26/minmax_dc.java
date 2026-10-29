/*
Given an unsorted array of size n, find the maximum and minimum
elements of the array using Divide and Conquer Technique
Sample input and output:
input=
9
22 13 -5  -8 15 60 17 31 47
output=
60 -8

input=
12
999 450 -300 1200 75 -850 640 32 1500 -45 800 250
output=
1500  -850

input=
8
5 5 5 5 5 5 5 5
output=
5  5

*/
import java.util.*;
public class minmax_dc{
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [ ] = new int [n];
        for(int i=0; i<n;i++) arr[i] = s.nextInt();
        int res[] = minmax(arr,0,n-1);
        System.out.print(res[0] + " " + res[1]);
    }
    
    public static int [] minmax(int arr[],int low , int high ){
        if(low == high ){
            return (new int[]{ arr[low], arr[low] }); 
        }
        int mid = low + (high - low)/2;
        int leftans [] = minmax(arr, low, mid); // left lo ans vastadi 
        int rightans[] = minmax(arr, mid+1, high); // right lo ans vastadi 
        // now compare left and right ans 
        int min = Math.min(leftans[0], rightans[0]);
        int max = Math.max(leftans[1], rightans[1]);
        return (new int[]{min,max});
    }




5


    public static int [] minmax2(int arr[],int low , int high ){
        if(low == high ){
            return (new int[]{ arr[low], arr[low] }); 
        }
        // base case 2: two elements, only 1 comparison
        if (high == low + 1) {
            if (arr[low] < arr[high])
                return new int[]{arr[low], arr[high]};   // {min, max}
            else
                return new int[]{arr[high], arr[low]};
        }
        int mid = low + (high - low)/2;
        int leftans [] = minmax(arr, low, mid); // left lo ans vastadi 
        int rightans[] = minmax(arr, mid+1, high); // right lo ans vastadi 
        // now compare left and right ans 
        int min = Math.min(leftans[0], rightans[0]);
        int max = Math.max(leftans[1], rightans[1]);
        return (new int[]{min,max});
    }

}
//https://claude.ai/share/e162183a-a1ca-4e83-b153-f124a5a58b22
