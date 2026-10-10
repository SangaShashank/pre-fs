/*
Quick Partition Parity Split 
An embedded data logger receives an unsorted stream of transaction weights. 
To optimize internal processing, the controller must partition the array in-place so that 
all values less than or equal to a specified threshold value appear before all values strictly greater than it, 
preserving standard Lomuto or Hoare partition mechanics.

Write a Java program implementing the Quick Sort Partition Step that places the chosen pivot in its correct position and outputs the partitioned array.


input=
7
9 3 7 1 8 2 5
output=
Partition Index = 3
Partitioned Array: 3 1 2 5 8 7 9
case=7
input=
4
-2 5 -1 3
output=
Partition Index = 2
Partitioned Array: -2 -1 3 5

*/