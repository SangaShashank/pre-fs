/*
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), 
return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or 
vertically. You may assume all four edges of the grid are all surrounded by water.

Develop a java program to find the number of islands using DFS

You are given an m x n grid representing a city map, where:
Each cell with a value of 1 represents a residential building,
Each cell with a value of 0 represents an empty plot of land.
The city blocks are formed by groups of adjacent residential buildings that are 
connected horizontally or vertically (not diagonally). These city blocks are distinct,
and each one is surrounded by empty plots of land.
Your task is to determine how many separate city blocks exist in the city, where a city block
is defined as a group of connected residential buildings that form a continuous zone of construction.
Assume that the city's outermost boundary is surrounded by open space.
Develop a java program to find the number of islands using DFS

Sample Input and Output:
input=4
1 1 1 1
1 1 1 1
1 1 1 1
1 1 1 1
output=1


input=3
1 0 1
0 0 0
1 0 1
output=4

input=5
0 0 0 0 0
0 1 1 0 0
0 1 0 1 0
0 0 1 1 0
0 0 0 0 0
output=2

input=6
1 0 0 1 0 1
0 1 0 0 1 0
0 0 1 0 0 0
1 0 0 1 0 0
0 1 0 0 1 0
1 0 0 0 0 1
output=12

*/