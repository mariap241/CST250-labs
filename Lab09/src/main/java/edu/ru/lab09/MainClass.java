
package edu.ru.lab09;

import java.util.Stack;

public class MainClass {
   
    public static void main(String[] args){
        System.out.println(isBalanced("(2+3)-5(3+8)"));
        System.out.println(isBalanced("3*7(6-9"));
        
    }
    
    public static Boolean isBalanced(String expression){
        
        char[] exp = expression.toCharArray();
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i < exp.length; i++){
            if(exp[i] == '('){
                stack.push('(');
                
            }
            if(exp[i] == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
                
            }
    }
        if(stack.isEmpty()){
            return true;
        }
        return false;
        
    }
}
