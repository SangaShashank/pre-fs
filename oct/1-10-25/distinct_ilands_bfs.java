/*
Viraj Aanand is a wedding planner, He order his assistant to decorate a wall.
The decorator plans to decorate the wall with two different colored balloons.
The wall size is M*N, The decorator can decorate the wall using M*N balloons
the balloons are blue or white in color.

Blue colored ballons represented with digit-1 and 
White colored ballons represented with digit-0.

The blue colored balloons forms different shapes, that are connected 4 directonally.
The directons are upwards, downwards, left, and right. Viraj Aanand got an idea to 
count the unique shapes formed by blue colored ballons.

You will be given the decorated wall as a matrix wall[][].
Your task is to help, Viraj Aanand to count the unique shapes.

Input Format:
-------------
Line-1: Two space separated integers M and N, size of the wall.
Next M lines: N space separated integers, either 0 or 1.

Output Format:
--------------
Print an integer, Number of distinct shapes formed by blue balloons.


Sample Input-1:
---------------
4 5
1 1 0 0 0 
1 1 0 0 0
0 0 0 1 1 
0 0 0 1 1

Sample Output-1:
----------------
1


Sample Input-2:
---------------
5 5
1 1 0 1 1
1 0 0 0 1
0 0 0 0 0
1 0 0 0 1
1 1 0 1 1

Sample Output-2:
----------------
4

Note: 
-------
The shapes, 
1 1  		  1 1
1     and    1 
are different.
*/
//chatgpt code 


import java.util.*;

public class distinct_ilands_bfs{

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int n = s.nextInt();

        int grid[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.nextInt();
            }
        }

        System.out.println(count_shapes(grid, m, n));
    }

    public static int count_shapes(int grid[][], int m, int n) {

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {

                    String shape = bfs(grid, i, j);

                    set.add(shape);
                }
            }
        }

        return set.size();
    }

    public static String bfs(int grid[][], int a, int b) {

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{a, b});

        grid[a][b] = 0;

        String shape = "";

        int neighbours[][] = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        while (!q.isEmpty()) {

            int element[] = q.poll();

            int x = element[0];
            int y = element[1];

            shape += (x-a) + "," + (y-b) + ";";

            for (int z[] : neighbours) {

                int i = x + z[0];
                int j = y + z[1];

                if (i >= 0 && i < grid.length &&
                    j >= 0 && j < grid[0].length &&
                    grid[i][j] == 1) {

                    q.offer(new int[]{i, j});

                    grid[i][j] = 0;
                }
            }
        }

        return shape;
    }
}
