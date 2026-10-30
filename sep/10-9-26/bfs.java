/*
Write a java program to implement Breadth First Search of a Graph
Sample Input and Output:
input=
4  //number of vertices
//adjacency matrix
0 1 1 0
1 0 1 1
1 1 0 0
0 1 0 0
1  //source vertex
output= 1 2 3 4  //breadth first search of the graph
*/
import java.util.*;
public class bfs{
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int graph [][] = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j =0;i<n;j++){
                graph[i][j] = s.nextInt();
            }
        }
        
        }
}