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
}