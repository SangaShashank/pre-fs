/*
Boundary Insertion Point (Unit-2 | Level: Easy)
(10 Marks)

A library management server maintains book tracking numbers in a strictly sorted ascending array without duplicates. 
When a newly purchased book with a given tracking ID arrives, the server must either identify its exact existing index or 
determine the exact index where it should be inserted to maintain strict sorted order.
Trap/Nuance: When the target does not exist, students often return -1 instead of the boundary insertion index low.
Write a Java program using Binary Search to return the index if target is found, or the insertion index if not found in O(log N) time

input=
1
7
3
output=
Index = 0
case=7
input=
1
7
10
output=
Index = 1
case=8
input=
6
-10 -5 0 5 10 20
-7
output=
Index = 1
*/