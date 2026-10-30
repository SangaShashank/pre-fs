/*
Program for Kruskal's algorithm to find Minimum Cost Spanning Tree 
of a given connected, undirected and weighted graph

Sample Input and Output:

input =
4  // number of vertices
5// number of edges
0 1 2 //source vertex, destination vertex, edge cost
0 2 1
1 2 3
2 3 6
1 3 4
output =7

input =
6
12
0 1 4
1 2 5
0 2 4
1 3 3
2 3 7
0 3 6
1 4 7
2 4 8
3 4 3
5 4 8
5 3 7
1 5 9
output =21

input=
7
9
0 1 28
0 5 10
5 4 25
4 6 24
4 3 22
3 6 18
3 2 12
1 2 16
1 6 14
output=99
*/
import java.util.*;
class krushkals_algo{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int e = sc.nextInt();

        int a[] = new int[e];
        int b[] = new int[e];
        int w[] = new int[e];

        for (int i = 0; i < e; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }

        // Sort edges according to weights 
        for (int i = 0; i < e; i++) {
            for (int j = i + 1; j < e; j++) {
                if (w[i] > w[j]) {
                    int t = w[i];
                    w[i] = w[j];
                    w[j] = t;

                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;

                    t = b[i];
                    b[i] = b[j];
                    b[j] = t;
                }
            }
        }
        // anni edges short ayinai
        int p[] = new int[n]; // parent array 

        for (int i = 0; i < n; i++) // all elements are parents to itself
            p[i] = i;

        int cost = 0, count = 0;

        for (int i = 0; i < e; i++) { // okko okko edge chesukunnta povali iga 
            int x = a[i], y = b[i];

            while (p[x] != x) 
                x = p[x];
            // chala imp , idi root find out chese code anamata , 
            // tatpadia gurtunnda and mid ki kuda chusinam
            while (p[y] != y)
                y = p[y];
            // same parent kakapothey print chesi parent [x] = y ani set chesi , count and cost ni update chestunnam 
            // ee contdition enduku anntey to avoid cycles in out mst 
            // most imp ee moodu steps :
            //check for root of x , root of y then if x and y not equlal proceed 
            if (x != y) { 
                System.out.println(a[i] + " " + b[i] + " " + w[i]);

                p[x] = y;
                cost += w[i];
                count++;

                if (count == n - 1) // ofc number of edges is n-1 ee kada 
                    break;
            }
        }

        System.out.println("Minimum Cost = " + cost);
    }
}