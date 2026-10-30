/*
Java Program for Prims algorithm to find Minimum Cost Spanning Tree 
of a given connected, undirected and weighted graph

Sample Input and Output:
input=
7
// number of vertices
//cost adjacency matrix which stores 0 if edge does not exist
0  28   0   0   0  10   0
28   0  16   0   0   0  14
0  16   0  12   0   0   0
0   0  12   0  22   0  18
0   0   0  22   0  25  24
10   0   0   0  25   0   0
0  14   0  18  24   0   0
output=
Edge    cost
2 - 1   16
3 - 2   12
4 - 3   22
5 - 4   25
0 - 5   10
1 - 6   14
99
*/
import java.util.*;
public class prims{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int graph [][] = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j] = s.nextInt();
                        }
        }

        System.out.print(prims_algo(graph,n,0));
    }
    public static int prims_algo(int graph[][], int n, int source){
        boolean visited []= new boolean[n];
        int mst [] = new int[n];
        for(int i=0;i<n;i++) mst[i] = Integer.MAX_VALUE;
        mst[source] = 0;
        int total = 0;
        for(int i=0;i<n;i++){ // enduku anntey 
            // no of edges = vertices -1 in mst 
            int u= min_mst_vertex(mst, visited);
            if(u== -1) return total;
            visited[u] = true;
             for(int v=0;v<n;v++){
                if(visited[v] != true && graph[u][v] != 0 && graph[u][v]<mst[v]){
                    mst[v] = graph[u][v];
                }
             }
            total+= mst[u];
        }
        return total;

    }
    public static int min_mst_vertex(int mst[], boolean visited[]){
        int vertex = -1, min_mst_weight = Integer.MAX_VALUE;
        for(int i=0;i<mst.length;i++){
            if(visited[i]!= true && mst[i]<min_mst_weight){
                min_mst_weight = mst[i];
                vertex = i;
            }
        }
        return vertex;
    }
}