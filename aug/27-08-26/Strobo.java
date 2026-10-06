/*
Given a string num which represents an integer, 
return true if num is a strobogrammatic number.

A strobogrammatic number is a number that looks 
the same when rotated 180 degrees (looked at upside down).

Example 1:
Input: num = 69 
Output: true

Example 2:
Input: num = 88
Output: true

Example 3:
Input: num = 962
Output: false
*/
import java.util.*;
public class Strobo{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        /*String numstring   = s.next();
        char [] num = numstring.toCharArray();*/
        String num = s.next();
        System.out.println(check_strobo(num));
       
    }
    public static boolean check_strobo(String  num){
        int left = 0; int  right = num.length()- 1; 
        Map<Character,Character > m = new HashMap<>();
        m.put('0','0'); m.put('1','1'); m.put('8','8');
        m.put('6','9' ); m.put('9','6');
         while (left<= right){ // = chala imp ikkada 
            if(m.containsKey(num.charAt(left))){
                if(m.get(num.charAt(left)).equals(num.charAt(right))){
                    left ++;right --;
                }
                else {
                    return false;
                }
            }
            else{
                return false ;
            }
        }                                 
        return true;
    }
}
//https://claude.ai/share/500b696c-cae2-4788-8f88-54916741bc11