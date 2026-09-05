import java.util.*;
public class BinarySearch{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int k = s.nextInt();
        int res = bs(a,k);
        if(res!= -1){
            System.out.println("element found at : " + res);
        }
        else{
            System.out.println("element not found");
        }
        
    }
    public static int bs(int a[],int k){
        int l = 0,u = a.length-1;
        while(l<=u){ // ee equal to marchipothey test cases rale 
            // int mid = l+u/2; // this might have the risk of overflow
            int mid = l + (u-l)/2;
            if(a[mid] == k){
                return mid +1; // to balance zero based index
            }
            else if(a[mid]>k){ // value takkava unndi kabbati lower bound loki povali 
                u = mid -1;
            }
            else {
                l = mid +1;
            }
        }
        return -1;
    }
}