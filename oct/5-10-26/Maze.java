/*
You are entering into a maze N*N grid consist of(0's and 1's)
Initially you will start from (0,0) position in the maze, 
Your target is to reach the end position (N-1, N-1).

Among the four directions available(top, down, left, right),
you can move in two directions only, right and down.

In the maze, '0' indicates dead end and '1' indicates open way. 
You can travel through only open way.

For Example:-
Given Maze of size N=4 , starting position is (0, 0),
1 0 0 0
1 1 0 1
0 1 0 0
1 1 1 1

You can reach the (3, 3) position in the following way.
1 0 0 0
1 1 0 0
0 1 0 0
0 1 1 1

Return true, if you can reach the end position(N-1, N-1).
otherwise return false.

Input Format:
-------------
Line-1 -> An integer N, size of square board.
Next N lines -> N space separated integers 

Output Format:
--------------
Print a boolean value.

Sample Input-1:
---------------
3
1 1 1
1 0 1
0 1 1

Sample Output-2:
----------------
true

Sample Input-2:
---------------
4
1 0 0 0
1 1 0 1
0 1 0 0
1 1 0 1

Sample Output-1:
----------------
false
*/
import java.util.*;
public class Maze{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [][]  = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(arr.length);
        System.out.println(Maze_rec(arr,n));
    }
    public static boolean Maze_rec(int arr[][], int n ){
        return bfs_rec(arr,0,0);
    }
    public static boolean bfs_rec(int arr[][], int r, int c){
        if(r == arr.length-1 && c == arr.length-1 && arr[r][c] == 1){
            return true;
        }
       /* if(in_bounds(arr,r+1,c)){ // down dhi 
               return bfs_rec(arr,r+1,c);
        }
        if(in_bounds(arr,r,c+1)){ // right dhi  // ila cheste madaylo ney stop aypitunndi 
            return bfs_rec(arr,r,c+1);
        }
        return false;*/ 
        if(!in_bounds(arr,r,c)){
            return false;
        }
        return bfs_rec(arr,r+1,c) || bfs_rec(arr,r,c+1);
    }
    public static boolean in_bounds(int arr[][], int r,int c){
        System.out.println(r + " " + c);
        if(r>=0 && r<arr.length && c>=0 && c<arr.length && arr[r][c] == 1){
            return true;
        }
        return false;
    }
}