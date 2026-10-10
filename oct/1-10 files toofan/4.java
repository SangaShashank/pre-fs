/*
Stable Stream Combination 
Two internal cache buffers receive sorted numeric timestamps from two independent satellite downlinks. 
The master logging buffer must combine these two sorted streams into one unified sorted array without breaking ascending order.

Write a Java program implementing the Merge Step of Merge Sort to merge two pre-sorted arrays of sizes M and N in O(M + N) time

input=
5 4
-10 -5 0 5 10
-8 -3 2 8
output=
Merged Stream: -10 -8 -5 -3 0 2 5 8 10
*/