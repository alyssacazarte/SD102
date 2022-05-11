package palindrome;
import java.util.Scanner;

public class Palindrome {

   
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        number = sc.nextInt();
        
       for (int i = 1; i <= number; i++) {
           if (i % 2 != 0) {
                System.out.println(i + "(Odd)");
       }
       else{
           System.out.println(i + "(Even) ");
           
       }
        
        
    }
    
}
}