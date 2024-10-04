//Question 1: Balanced Parentheses Checker
//Task: Write a Java program to check if a given expression has balanced parentheses using a stack.
//Requirements:
//The program should prompt the user to enter an expression.
//Implement a method that uses a stack to check if the parentheses in the expression are balanced.
//Display whether the expression has balanced parentheses or not.
//Sample Input and Output:
//Input:
//Enter an expression: (2+3)*(5-1)
//Output:
//The expression has balanced parentheses.
//Input:
//Enter an expression: (2+3]*(5-1)
//Output:
//The expression does not have balanced parentheses.

package project;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesesChecker {
	// Method to check if the parentheses are balanced
    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the expression
        for (char ch : expression.toCharArray()) {
            // If it's an opening bracket, push it to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If it's a closing bracket, check if it matches the top of the stack
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        // If the stack is empty, all parentheses are balanced
        return stack.isEmpty();
    }

    // Helper method to check if the parentheses are a matching pair
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an expression: ");
	        String expression = scanner.nextLine();

	        if (areParenthesesBalanced(expression)) {
	            System.out.println("The expression has balanced parentheses.");
	        } else {
	            System.out.println("The expression does not have balanced parentheses.");
	        }
	        
	        scanner.close();

	}

}
