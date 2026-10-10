/*
Staircase Route Counting

An automated elevator controller must determine the number of distinct ways a user can reach the Nth floor when each move can advance either one floor or two floors.
Write a Java program to calculate the number of distinct ways.
This is based on LeetCode 70 – Climbing Stairs. (LeetCode)
Trap/Nuance: The problem is naturally recursive, but direct recursion repeats subproblems. An efficient implementation should avoid unnecessary repeated computation.

input=
5
output=
Number of Ways = 8
*/