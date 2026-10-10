/*
Overlapping Maintenance Windows

A maintenance scheduling system receives several time intervals representing maintenance windows. 
Overlapping or touching intervals must be combined into a single continuous maintenance window.
Write a Java program to merge all overlapping intervals.
This is based on LeetCode 56 – Merge Intervals. LeetCode explicitly treats [1,4] and [4,5] as overlapping. (LeetCode)
Trap/Nuance: Intervals may not be supplied in sorted order. Intervals sharing an endpoint must also be merged.

input=
4
10 12
1 5
3 8
9 11
output=
Merged Intervals:
1 8
9 12
*/