/*
Given an integer n, return all the strobogrammatic numbers 
that are of length n. You may return the answer in any order.

A strobogrammatic number is a number that looks the same 
when rotated 180 degrees (looked at upside down).

 
Example 1:
Input: n = 2
Output: [11, 69, 88, 96]

Example 2:
Input: n = 1
Output: [0, 1, 8]

Example 3:
Input=4
Output=[1001, 6009, 8008, 9006, 1111, 6119, 8118, 9116, 1691, 6699, 8698, 9696, 1881, 6889, 8888, 9886, 1961, 6969, 8968, 9966]
 
*/
import java.util.*;
public class strobo_creation{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(app1(n,n));
    }
    public static List<String> app1(int n , int length){
        // length enduku anntey manam n manulplate chestunnam kada adhi store orginal n ni cheayaniki length 
        if(n==0) return Arrays.asList("");
        if(n==1) return Arrays.asList("0","1","8");
        List<String> res = new ArrayList<>();
        List<String> smaller = app1(n-2,length);
        for (String  x: smaller){
            if(n!= length){
                res.add("0" + x + "0");
            }
            res.add("1"+x+"1");
            res.add("6"+x+"9");
            res.add("9"+x+"6");
            res.add("8"+x+"8");
        }
        return res;
    }
}




