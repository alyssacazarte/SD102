package testing;

import java.util.Scanner;
public class Testing {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numberOne = scan.nextInt();
        System.out.print("Enter the second number: ");
        int numberTwo = scan.nextInt();
        Sum s= new Sum();
        System.out.println("Addition");
        System.out.println(s.add(numberOne, numberTwo));
        Minus m= new Minus();
        System.out.println("Subtraction");
        System.out.println(m.subtract(numberOne, numberTwo));
        Multiply u= new Multiply ();
        System.out.println("Multiplication");
        System.out.println(u.product(numberOne, numberTwo));
        Divide d= new Divide ();
        System.out.println("Division");
        System.out.println(d. quotient (numberOne, numberTwo));
        Result r= new Result ();
        System.out.println("Result");
        System.out.println(r. modulo(numberOne, numberTwo));
    }
    
}