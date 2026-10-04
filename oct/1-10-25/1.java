/*
Jadav Payeng, "The Forest Man of India", 
started planting the seeds in a M*N grid land.
Each cell in the grid land is planted with a seed.
After few days, some seeds grow into saplings indicates with '1',
and the rest are dead seeds indicates with '0'.

One or more saplings are connected either horizontally, vertically or diagonally with each other, form a sapling-group. 
There may be zero more sapling-groups in the grid land.

Jadav Payeng wants to know the biggest sapling-group in that grid land.

You are given the M * N grid, filled with 0's and 1's.
You are task is to help Jadav Payeng to find the number of saplings in 
the largest sapling-group.

Input Format:
-------------
Line-1: Two integers M and N, the number of rows and columns in the grid-land.
Next M lines: contains N space-separated integers .

Output Format:
--------------
Print an integer, the number of saplings in the largest sapling-group in the given grid-land.

Sample Input-1:
---------------
5 4
0 0 1 1
0 0 1 0
0 1 1 0
0 1 0 0
1 1 0 0

Sample Output-1:
----------------
8


Sample Input-2:
---------------
5 5
0 1 1 1 1
0 0 0 0 1
1 1 0 0 0
1 1 0 1 1
0 0 0 1 0

Sample Output-2:
----------------
5
*/
import java.util.*;
public class MaxArea_DFS
{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int grid [][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                grid[i][j] = s.nextInt();
            }
        }
        System.out.println(max_area(grid,m,n));
    }
    public static int max_area(int grid[][],int m,int n){
        int final_area = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    grid[i][j] = 0;
                    int area = bfs(grid,i,j);
                    final_area = Math.max(final_area,area);
                }
            }
        }
        return final_area;
    }
    public static int bfs(int grid[][],int a,int b){
        Queue <int []> q = new LinkedList<>();
        q.offer(new int[]{a,b})
        int res = 1; // already starting taken 
        int neighbours [][] = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int element [] = q.poll();
            for(int [] x:neighbours){
                int i = element[0] + x[0];
                int j = element[1] + x[1];
                if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j] == 1){
                    q.offer(new int []{i,j});
                    grid[i][j] = 0;
                    res++;
                }
            }
        }
        return res;
    }
}