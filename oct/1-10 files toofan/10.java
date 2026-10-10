/*
Image Region Recoloring
A digital image-processing system represents an image as an M × N grid of integer color values.
When an operator selects a pixel, the system must recolor that pixel and every directly connected pixel having the same original color.
Two pixels are considered connected only when they share an edge horizontally or vertically.
Write a Java program using DFS or BFS to perform the flood-fill operation.
This is based on LeetCode 733 – Flood Fill. (LeetCode)
Trap/Nuance: Diagonal pixels must not be considered connected. 
Also, if the new color is the same as the original color, the program must terminate without repeatedly processing the same pixels.

input=
2 2
5 5
5 5
0 1 8
output=
Flood Filled Image:
8 8
8 8

input=
3 3
1 0 1
0 1 0
1 0 1
1 1 9
output=
Flood Filled Image:
1 0 1
0 9 0
1 0 1
*/