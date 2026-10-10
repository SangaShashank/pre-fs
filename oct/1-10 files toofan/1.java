/*
Organizational Hierarchy Level Traversal

An organization stores its reporting hierarchy as a binary tree. The HR system needs to display employees level by level, starting from the top-level employee.
Write a Java program using Breadth-First Search (BFS) to print the level-order traversal of the binary tree.
This is based on LeetCode 102 – Binary Tree Level Order Traversal, which specifies left-to-right traversal level by level. (LeetCode)
Input convention for this lab: The tree is supplied in level-order, using -1 to represent a missing node.

input=
5
10 -1 20 -1 30
output=
Level Order:
10
20
30

input=
7
5 3 8 1 -1 7 9
output=
Level Order:
5
3 8
1 7 9
*/