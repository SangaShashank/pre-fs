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
//ali code 


import java.util.*;
class Maze_Using_stack
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][] maze = new int[N][N];
        for (int i=0;i<N;i++) 
        {
            for (int j=0;j<N;j++) 
            {
                maze[i][j]=sc.nextInt();
            }
        }
        System.out.println(solveMaze(N, maze));
    }
    static boolean solveMaze(int N,int maze[][])
    {
        if(maze[0][0]==0) return false;
        Stack<int[]> stack=new Stack<>();
        boolean visited[][]=new boolean[N][N];
        stack.push(new int[]{0,0});
        visited[0][0]=true;
        while(!stack.isEmpty())
        {
            int[] current=stack.pop();
            int r=current[0];
            int c=current[1];
            
            if(r==N-1 && c==N-1) return true;
            int nextRDown=r+1;
            int nextCDown=c;
            if(nextRDown<N && maze[nextRDown][nextCDown]==1 && !visited[nextRDown][nextCDown])
            {
                visited[nextRDown][nextCDown]=true;
                stack.push(new int[]{nextRDown,nextCDown});
            }
            int nextRRight=r;
            int nextCRight=c+1;
            if (nextCRight<N && maze[nextRRight][nextCRight]==1 && !visited[nextRRight][nextCRight]) 
            {
                visited[nextRRight][nextCRight]= true;
                stack.push(new int[]{nextRRight,nextCRight});
            }
        }
        return false;
    }
}   