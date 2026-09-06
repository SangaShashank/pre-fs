import java.util.*;
public class fixedpointrec{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int [n];
        for (int i=0;i<n;i++){
            arr[i]  = s.nextInt();

        }   
        System.out.println(fixed_point(arr,0,n-1));
     }
     public static int fixed_point(int arr[],int l,int u){
        int mid = l + (u-l)/2;
        if(l>u){
            return -1;
        }
        if(arr[mid] == mid){
            int left_possible = fixed_point(arr,l,mid - 1); // left side emayina possibilty unnda leda ani check chestuunam
            if(left_possible == -1){ 
                return mid;
            }
            else {
                return left_possible;
            }
        }
        else if(arr[mid] > mid ){ // lower bound lo undney avakasm unndi
            return fixed_point(arr,l,mid -1);
        }
        else{
            return fixed_point(arr,mid+1,u);
        }
     }
}