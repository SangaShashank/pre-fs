/*
Maximum Contiguous Performance

A monitoring system records the performance gain/loss of an automated process over N consecutive operations. 
The system must determine the contiguous sequence of operations having the maximum total gain.
Write a Java program to find the maximum subarray sum.
This is based on LeetCode 53 – Maximum Subarray. 
The problem also identifies divide-and-conquer as an alternative approach; 
the standard O(N) solution is commonly implemented using Kadane's algorithm. (LeetCode)
Trap/Nuance: The maximum subarray must be non-empty. If all values are negative, the largest single value must be returned.

input=
4
-1 -2 -3 4
output=
Maximum Subarray Sum = 4
*/