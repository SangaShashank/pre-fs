/*
Java Program to multiply 2 matrices
Sample Input and Output:

input=
3 2  //order of first matrix 
2 3 //order of second matrix
//first matrix
1 2
3 4
5 6
//second matrix
7 8 9
10 11 12
output=
27 30 33 
61 68 75 
95 106 117 

input=
2 3 
2 2
output=
Multiplication is not possible
*/
import java.util.*;
public class MatMul{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt(); 
        int c = s.nextInt(); 
        int d = s.nextInt(); 
        if (b!= c){
            System.out.println("Muiltiplication is not possible");
            return;
        }
        int arr1 [][] = new int[a][b];
        int arr2 [][] = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr1[i][j] = s.nextInt();
            }
        }
        for (int i=0;i<c;i++){
            for(int j=0;j<d;j++){
                arr2[i][j] = s.nextInt();
            }
        }
        int res [][] = mat_mul(arr1,arr2,a,b,c,d);
        for(int i =0;i<a;i++){
            for(int j=0;j<d;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int [][] mat_mul(int arr1[][],int arr2[][],int a,int b,int c,int d){
        int res [][] = new int [a][d];
        for (int i=0;i<a;i++){
            for(int j=0;j<d;j++){
                int sum = 0;
                for(int k=0;k<b;k++){
                    sum+= arr1[i][k]*arr2[k][j];

                }
                res[i][j] = sum;
            }
        }
        return res;
}
}