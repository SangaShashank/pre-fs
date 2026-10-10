/*Scenario

A cybersecurity incident response team detects malware spreading inside an enterprise network. Certain mission-critical servers are connected via bidirectional intranet channels.

When a breach is detected on an entry-point server, the team must determine the **complete contagion boundary** (all devices reachable via direct or indirect intranet links) and 
trace the **depth of infection propagation** before deploying automated firewall isolation. Because the inspection involves probing every connected branch deeply until 
hitting dead ends or visited nodes, Depth-First Search (DFS) is used to establish the exact traversal path and identify whether uncompromised isolated network segments remain intact.

---

### Hint: Data Structures and Strategy

* **Adjacency List (`List<List<Integer>>`)**: Stores bidirectional communication links between servers numbered $0$ to $V-1$.
* **Call Stack (Recursion) or Explicit Stack (`Deque<Integer>` / `Stack<Integer>`)**: Drives the depth-first exploration to plunge deep along each branch before backtracking.
* **Visited Array (`boolean[] visited`)**: Prevents re-visitation, avoiding infinite loops in cyclic topologies.
* **Traversal Order Tracker (`List<Integer>`)**: Records servers in the chronological order they are inspected.

---

### Algorithm

1. Initialize an adjacency list for $V$ servers.
2. Read the number of operational links $E$, adding bidirectional connections $(u, v)$ and $(v, u)$.
3. Read the compromised starting server (`source`).
4. Initialize a boolean array `visited` of size $V$ with `false`.
5. Execute `dfs(source)`:
* Mark current node as `visited[u] = true`.
* Append $u$ to the traversal sequence.
* For each adjacent neighbor $v$ of $u$:
* If `!visited[v]`, recursively call `dfs(v)`.
6. Output the chronological infection order and list the quarantine status (Compromised / Secure) of all servers in the network.

input=6 3
0 1
1 2
3 4
0
output=Infection Spread Order: [0, 1, 2]
Server Security Status:
Server 0: Compromised
Server 1: Compromised
Server 2: Compromised
Server 3: Secure
Server 4: Secure
Server 5: Secure


input=1 0
0
output=Infection Spread Order: [0]
Server Security Status:
Server 0: Compromised


*/
