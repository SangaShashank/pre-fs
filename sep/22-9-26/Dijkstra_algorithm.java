/*
Write a Java program to implement Dijkstra's single source shortest path algorithm.

Sample Input and Output:
input=
5  //number of vertices
//adjacency matrix
0 1 4 0 0
1 0 4 2 7
4 4 0 3 5
0 2 3 0 4
0 7 5 4 0
0 //src vertex
output=
0 1 4 3 7  //distances from the assumed source vertex 0

input=
5
0 2 0 6 0
2 0 3 8 5
0 3 0 0 7
6 8 0 0 9
0 5 7 9 0
0
output=
0 2 5 6 7

*/
import java.util.*;
import java.util.Scanner;
public class Dijkstra_algorithm{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int graph [][] = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j] = s.nextInt();
            }
        }
        int source = s.nextInt();
        int res [] = dijk_algo(graph,n,source);
        for(int i=0;i<n;i++) System.out.print(res[i]+" ");
        }
        public static int best_vertex(boolean visited[], int mindist[], int n){
            int current_mindist =Integer.MAX_VALUE;
            int best_vertex = -1;
            for(int i=0;i<n;i++){
                if(visited[i]!= true && current_mindist> mindist[i] ){
                    current_mindist = mindist[i];
                    best_vertex = i;
                }
            }
            return best_vertex;
        }
        public static int [] dijk_algo(int graph[][], int n , int source ){
            int mindist [] = new int[n];
            boolean visited [] = new boolean[n];
            for(int i=0;i<n;i++){
                mindist[i] = Integer.MAX_VALUE;
            }
            mindist[source] = 0;
            for(int i=0;i<n;i++){
                // min unvisited vertex kavali kada
                int u = best_vertex(visited,mindist,n);
                visited[u] = true;
                if(u == -1) return mindist; // all visisted ani artham
                for(int v=0;v<n;v++){
                    //main hero 
                    if(graph[u][v] != 0 && visited[v]!= true && mindist[v]> mindist[u]+ graph[u][v]){
                        mindist[v]= mindist[u]+ graph[v][u];
                    }
                }
            }
            return  mindist;
        }
}