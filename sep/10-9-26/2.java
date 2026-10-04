/*
In a school, 5th standard is having 2 sections called Rose and Lotus.
Section Rose contains 'm' students and Lotus contains 'n' students.
Each section's students scored marks in the Mathematics exam.
Teacher maintained a record of marks in ascending order of each section.
Now your task is to find out the median of the marks of 2 sections together.

Note: The overall run time complexity should be O(log (m+n)) .

Example 1:
Sample Input=
4  //m                                                                                                     
5  //n                                                                                                    
62 74 81 95         //Rose section marks                                                                                                    
40 59 67 73 84      //Lotus section marks                                                                                                    

Sample Output=
73.0  //median

Explanation: merged marks = [40 59 62 67 73 74 81 84 95] 
and median is 73.0

Example 2:
Sample Input=
4
4
61 71 82 95
42 51 64 83

Sample Output=
67.5

Explanation: merged marks = [42 51 61 64 71 82 83 95] 
and median is (64+71)/2 is 67.5

*/