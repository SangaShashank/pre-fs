/*
Sorted Pair Locator

A database maintains transaction values in ascending order. Given a target amount, determine the two transaction positions whose values add exactly to the target.
Because the values are already sorted, the system should use a two-pointer strategy instead of checking every possible pair.
This is based on LeetCode 167 – Two Sum II: Input Array Is Sorted. The official problem uses 1-based indices and requires constant extra space. (LeetCode)
Trap/Nuance: The required indices are 1-based, not 0-based. The same element cannot be used twice.

input=
4
1 3 4 6
7
output=
Indices = 1 4

input=
5
0 0 3 5 8
0
output=
Indices = 1 2
*/
