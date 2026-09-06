import java.util.*;
public class BinarySearchRec{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        System.out.println(binarysearch(arr,0,n-1,k));
    }
    public static int binarysearch(int arr[],int l,int u,int k){
        if(l > u){
            return -1;
        }
        int mid = l +(u-l)/2;
        //System.out.println(mid);
        if(arr[mid] == k){
            return mid;
        }
        else if(arr[mid]>k){ // anntey we need search left side 
            u = mid -1;
           return  binarysearch(arr,l,u,k); // recursive call
        }
        else {
           return binarysearch(arr,mid +1,u,k);
        }
        // return -1; ee line valla problem ento chaduvu

    }
}
//https://claude.ai/share/77c7f4c2-1a8f-4c36-9ff2-733e9a3a5620