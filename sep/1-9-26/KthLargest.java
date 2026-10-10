/*
Kth Largest Element in an Array 
Given an integer array nums and an integer k, return the kth largest
element in the array.
Note that it is the kth largest element in the sorted order, not the 
kth distinct element.
Develop a java program without sorting.
 

Example 1:
input=5 //size of the array
10 20 30 40 50  //array elements
1  //k
output=50

input=5
10 20 30 40 50
5
output=10
*/
import java.util.*;
public class KthLargest{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for(int i =0;i<n;i++){
           arr[i] =  s.nextInt(); 
        }
        int k = s.nextInt();
        System.out.println(app1(arr,k));
        System.out.println(quick_sort(arr,0,n-1,k));
    }
    public static int app1(int arr[],int k){
        PriorityQueue <Integer> pq = new PriorityQueue<>();
         pq.add(Integer.MIN_VALUE); // 1st iteration lo peek emm unndadu kada , so akkada problem ravaddu ani 
        for(int i=0;i<arr.length;i++){
            if(pq.peek() < arr[i]){ // konni useless additions apataniki ee enhancement 
                pq.add(arr[i]);
            }
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static int quick_sort(int arr[], int l,int h,int k){
        if(l<=h){
            int partition = quick_sort_partition(arr,l,h);
            int target = arr.length-k;
            if(partition == target){
                return arr[partition];
            }
        else if(partition > target){
           return quick_sort(arr,l,partition-1,k);}
           else{
           return  quick_sort(arr,partition+1,h,k);
        }
    }
    return -1;

    }
    public static int quick_sort_partition(int arr[], int l,int h){
        int i = l; int j = h ;int pivot = arr[l];
        while(i<j){
            while(i<=h && arr[i] <=pivot) i++;
            while(j>= l && arr[j]>pivot) j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp ;
        return j;
    }
}