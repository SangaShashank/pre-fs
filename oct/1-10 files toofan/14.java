/*
Island Territory Discovery
A satellite mapping system scans an M \times N ocean grid where '1' represents dry land and '0' represents water. 
An island is formed by connecting adjacent lands horizontally or vertically (diagonal connections are impassable water). 
The system needs to calculate the total count of distinct isolated islands to determine navigation zones.


Trap/Nuance: Students often forget that diagonal cells are not connected, or mutate/fail to mark visited cells resulting in an infinite recursion/stack overflow.

Write a complete Java program using Breadth-First Search (BFS) or Depth-First Search (DFS) to count the total number of islands 


input=
3 3
1 1 1
1 1 1
1 1 1
output=
Total Islands = 1

case=4
input=
3 4
0 0 0 0
0 0 0 0
0 0 0 0
output=
Total Islands = 0

*/