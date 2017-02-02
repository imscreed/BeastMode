package DataStructures;

import java.util.Stack;

/**
 * Created by Ibrahim on 2017-02-02.
 */
public class ParanthesisMatcherUsingStack {
    public static void main(String[] args){
        System.out.println(CheckParanthesis("{([()])}") ? "Valid" : "Not Valid");
    }
    public static boolean CheckParanthesis(String str)
    {
        if (str.isEmpty())
            return true;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++)
        {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                stack.push(current);
            }


            if (current == '}' || current == ')' || current == ']')
            {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }

        }

        return stack.isEmpty();
    }
}
