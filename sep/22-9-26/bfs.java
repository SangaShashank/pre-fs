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
            for(int j =0;j<n;j++){
                graph[i][j] = s.nextInt();
            }
        }
        int source = s.nextInt();
        System.out.println(app1(graph,n,source));
        
        }
        public static ArrayList<Integer> app1(int graph[][], int n,int source){
            // we can use an array and print 
            boolean visited [] = new boolean[n];
            ArrayList<Integer> res = new ArrayList<>();
            Queue<Integer> q = new LinkedList<>();
            q.add(source);
            visited[source] = true;
            while(!q.isEmpty()) {
                int vertex = q.poll();
                res.add(vertex);
                for(int i=0;i<n;i++){
                    if(visited[i] != true && graph[vertex][i]== 1){
                    // only aa row ee chudali kada anudke oka for loop
                    visited[i] = true;
                    q.add(i);
                }

            }
        }
        return res;
}
}