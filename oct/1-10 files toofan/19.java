/*
A disaster response management agency operates a network of regional relief hubs connected by two-way supply corridors. 
When an emergency strikes, relief supplies must be dispatched from a central headquarters (source hub) to all reachable relief hubs.
Because road risks increase with each transfer point, emergency coordinators must distribute supplies using the minimum number of transit hops (shortest unweighted path). 
If a hub cannot be reached due to severed connections, the system must flag it as unreachable.

Hint: Data Structures and StrategyAdjacency List (Map<Integer, List<Integer>> or List<List<Integer>>): 
Represents the undirected network of hubs. 

Each hub stores a list of neighboring directly connected hubs.

Queue (Queue<Integer> via LinkedList or ArrayDeque): Essential for Breadth-First Search (BFS) to explore nodes level-by-level (0 hops, 1 hop, 2 hops, etc.).

Visited Array / Distance Array (int[] dist or boolean[] visited):An integer array dist initialized to -1 for all nodes.

Setting dist[source] = 0 and tracking unvisited nodes by checking if (dist[neighbor] == -1) prevents infinite cycles and records the exact hop count.
Algorithm
1. Initialize an adjacency list for $V$ hubs (numbered 0 to n-1).
2. Read the number of operational corridors E and populate the bidirectional edges.
3. Read the starting hub ID (source).
4. Initialize a distance array dist of size v with -1.
5. Initialize a queue q and enqueue source. Set dist[source] = 0.
6. While q is not empty:
    Dequeue the front hub u.
    For every neighbor v of u:
        If dist[v] == -1 (not yet reached):
            Set dist[v] = dist[u] + 1.
            Enqueue v.
7. rint the shortest hop distance from the source hub to every hub $0$ to $V-1$. If dist[i] == -1, report it as unreachable.


input=6 3
0 1
1 2
3 4
0
output=Relief Distribution Hop Counts from Hub 0:
Hub 0: 0 hops
Hub 1: 1 hops
Hub 2: 2 hops
Hub 3: Unreachable
Hub 4: Unreachable
Hub 5: Unreachable


input=1 0
0
output=Relief Distribution Hop Counts from Hub 0:
Hub 0: 0 hops

*/