/*Target Range Expansion 
A telemetry log keeps timestamped events sorted in ascending order where identical timestamp values can occur multiple times. 
Given a specific timestamp target, the system must find the starting and ending index positions of that value.

Trap/Nuance: A standard binary search terminates upon encountering the first match. 
To find the span, two separate binary searches must be run to find the leftmost and rightmost boundaries.

Write a Java program using Binary Search to find the range [first, last] in O(log N) time

input=
8
-5 -3 -3 -3 0 2 2 7
-3
output=
Range: [1, 3]

input=
1
10
5
output=
Range: [-1, -1]
*/
