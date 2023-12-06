package prefixnotationstack;
import java.util.*;

/**
 * This class implements the evaluation of expressions in prefix and postfix notations using a stack and present a output of the notation.
 * It includes methods for evaluating both prefix and postfix expressions.
 *
 * @author Harpreet Singh
 *         Ryan Serrano
 *         Luisa Valencia
 */
public class Prefixnotationstack {

    // Helper method to check if a character is an operand (0-9) based on asci table used by char class.
    public static boolean operand(char c) {
        
        return c >= 48 && c <= 57;
    }

    // Method to evaluate expressions in prefix notation.
    public static double preFix(String notation1) {
        Stack<Double> preStack = new Stack<Double>();

        // Iterate through the expression in reverse order.
        for (int i = notation1.length() - 1; i >= 0; i--) {
            
            if (operand(notation1.charAt(i))) {
                // If the character is an operand, push it onto the stack.
                preStack.push((double) (notation1.charAt(i) - 48));
                
            } else {
                
                // If it's an operator, pop two operands, perform the operation, and push the result back.
                double element1, element2;
                element1 = preStack.peek();
                preStack.pop();
                element2 = preStack.peek();
                preStack.pop();
                
                // if and else statement can be used which utilize the asci table value of operators and comapre the values to make the decision.
                switch (notation1.charAt(i)) {
                    case '+' -> preStack.push(element1 + element2);
                    case '-' -> preStack.push(element1 - element2);
                    case '*' -> preStack.push(element1 * element2);
                    case '/' -> preStack.push(element1 / element2);
                }
            }
        }
        // The final result is at the top of the stack.
        return preStack.peek();
    }

    // Method to evaluate expressions in postfix notation.
    public static double postFix(String notation) {
        Stack<Double> postStack = new Stack<Double>();

        // Iterate through the expression.
        for (int i = 0; i < notation.length(); i++) {
            
            if (operand(notation.charAt(i))) {
                
                // If the character is an operand, push it onto the stack.
                postStack.push((double) (notation.charAt(i) - 48));
                
            } else {
                
                // If it's an operator, pop two operands, perform the operation, and push the result back.
                double element1, element2;
                element1 = postStack.peek();
                postStack.pop();
                element2 = postStack.peek();
                postStack.pop();
                
                // if and else statement can be used which utilize the asci table value of operators and comapre the values to make the decision.
                switch (notation.charAt(i)) {
                    case '+' -> postStack.push(element1 + element2);
                    case '-' -> postStack.push(element1 - element2);
                    case '*' -> postStack.push(element1 * element2);
                    case '/' -> postStack.push(element1 / element2);
                }
            }
        }
        
        // The final result is at the top of the stack.
        return postStack.peek();
    }

    // Main method to take user input and call the appropriate method based on the notation type.
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the Notation");

        String note1 = scnr.next();

        // Check the first character to determine if it's prefix or postfix notation.
        if (operand(note1.charAt(0))) 
        {
            System.out.println(postFix(note1));
        } 
        else if(note1.charAt(0) <= 47 && note1.charAt(0) >= 42)
        {
            System.out.println(preFix(note1));
        } 
        else 
        {
            System.out.println("Please Try again");
        }
    }
}
