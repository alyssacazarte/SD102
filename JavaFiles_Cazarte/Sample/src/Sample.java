import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {
        // Declare variables
        char operator;

        // create Scanner class object to
        // read inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double numberOne = sc.nextInt();
        System.out.print("Enter the second number: ");
        double numberTwo = sc.nextInt();
        

        // read operator
        System.out.println("Available Operators"
                + " are::  (+ - * / % ^)");
        System.out.print("Enter operator: ");
        operator = sc.next().charAt(0);

        // switch-case statements
        switch(operator) {
       // case to add two numbers
            case '+':
                System.out.println("Result = "+ (numberOne+numberTwo));
                break;
       // case to subtract two numbers
            case '-':
                System.out.println("Result = "+(numberOne-numberTwo));
                break;
      // case to multiply two numbers
            case '*':
                System.out.println("Result = "+ (numberOne*numberTwo));
                break;
     // case to divide two numbers
            case '/':
                System.out.println("Result = "+ (numberOne/numberTwo));
                break;

            case '%':
                System.out.println("Result = "+ (numberOne%numberTwo));
                break;
    // print the final result
            case '^':
                System.out.println("Result = "+
                        Math.pow(numberOne,numberTwo));
                break;

            default:
                System.out.println("Invalid operator");
        } // end of switch-case

        // close Scanner class object
        sc.close();
    }
}