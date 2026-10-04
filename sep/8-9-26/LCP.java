/*
Jagannadham is working with a set of words[], 
He wants to find out the common substring in all the words in the set,
and the substring should be the longest and also a prefix.

Can you help Jagannadham to find such substring.
If the substring is found, print it.
Otherwise, print an empty string,"".

Input Format:
-------------
Space separated strings, set of words[].

Output Format:
--------------
Print a string, the substring.


Sample Input-1:
---------------
apple applet application append

Sample Output-1:
----------------
"app"


Sample Input-2:
---------------
ant fox cat camel fish

Sample Output-2:
----------------
""

NOTE: 
	- " ", added for clarity no need to add in the output.
	- all the words consist of lowercase letters only.
*/
import java.util.*;
public class LCP{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String s1[] = s.nextLine().split(" ");
        System.out.println(check_lcp(s1));
    }
    public static String check_lcp(String s1[]){
        StringBuilder res = new StringBuilder();
        for(char c : s1[0].toCharArray()){
            res.append(c);
            boolean ans = is_present(s1,res);
            if(!ans){
                String res1 = res.toString();
                String final_res = res.substring(0,res.length()-1);
                return final_res;
            }
        }
        return res.toString();
        
        }
        
    public static boolean is_present(String s1[],StringBuilder res){
        int r = res.length();
        for(int i=1;i<s1.length;i++){
            String k = s1[i];
            String sub = k.substring(0,r);
            String res1 = res.toString();
            if(!(res1.equals(sub))){
               return false;
            }
        }
        return true;
    }
}