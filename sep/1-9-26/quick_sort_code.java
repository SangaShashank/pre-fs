/*
Java Program to sort a set of values using Quick Sort
Sample Input and Output:
Input:
10
42 23 74 11 65 58 94 36 99 87
Output:
11 23 36 42 58 65 74 87 94 99
*/
import java.util.*;
public class quick_sort_code {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        quick_sort(arr,0, n-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void quick_sort(int arr[] , int low , int high){
        if(low < high){
            int partition = quick_sort_actual(arr,low, high); 
            quick_sort(arr,low, partition-1); //divide low to partition -1
            quick_sort(arr,partition+1,high); // divide partion +1 to high 
        }

    }
    public static int quick_sort_actual(int arr [], int low , int high){
        int i = low,j = high;
        int pivot = arr[low];
        while(i<j){
            while(i<=high && arr[i]<=pivot){
                i++; // 1st largest element than pivot
            }
            while(j>=low && arr[j]>pivot){
                j--; // 1st smallest element than pivot 
            }
            if(i<j){
            int temp = arr[i];
            arr[i] = arr[j]; 
            arr[j] = temp; // swap i and j only if i < j  and there is while condition to check
        }
    }
        // swap the j and low and that gives the correct position of pivot at j 
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;  
    }

}