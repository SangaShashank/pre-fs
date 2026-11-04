/*
Balanced Symbol Verification

A compiler syntax checker receives an expression containing parentheses, square brackets, and curly brackets. 
It must determine whether every opening bracket is closed by the correct type of bracket in the correct order.
Write a Java program using a Stack to determine whether the expression is valid.
This is based on LeetCode 20 – Valid Parentheses. (LeetCode)
Trap/Nuance: Matching bracket types alone is insufficient; the nesting order must also be correct.
input=
{[]}
outut=
Valid = true
*/
import java.util.*;
public class balanced_parantesis{
    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    char arr [] = s.next().toCharArray();
    System.out.println(app1(arr));
}
public static boolean app1(char arr []){
    Stack<Character> st = new Stack<>();
    for(char c : arr){
        if(c == '{' || c == '[') st.push(c);
        else if(c == '}' && st.isEmpty()) return false;
        else if(c == '}' && st.peek() == '{') st.pop();
        else if(c == ']' && st.isEmpty()) return false;
        else if(c == ']' && st.peek() == '[') st.pop();
        else return false;

    }
    if(st.isEmpty()){
        return true;
    }
    return false;

}
}
