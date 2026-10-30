/*
Write a java program to implement Depth First Search of a Graph
Sample Input and Output:
input=
//number of vertices
4
//adjacency matrix
0 1 1 0
1 0 0 1
1 0 0 0
0 1 0 0
//source vertex
1
output=1 2 4 3  //depth first search of the graph
*/
import java.util.*;
public class dfs{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int graph [][] = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                graph[i][j] = s.nextInt();
            }
        }
        int source = s.nextInt();
        boolean visited [] = new boolean[n];
        app1(graph,n,source,visited);
    }
    public static void app1(int graph[][], int n, int source, boolean visited []){
        visited[source] = true;
        System.out.print(source + " ");
        for(int i=0;i<n;i++){
            if(visited[i] != true && graph[source][i] == 1){
                app1(graph,n,i,visited);
            }
        }
        return;
    }
}