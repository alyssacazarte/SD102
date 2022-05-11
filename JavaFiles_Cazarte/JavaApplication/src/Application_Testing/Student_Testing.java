
package Application_Testing;

import java.util.Scanner;


public class Student_Testing {

    int id,sem, sub, sub_price = 5124;
    String LName, FName;
    static String university = "University of San Carlos";

    public Student_Testing(int ID) {
        Scanner input = new Scanner(System.in);
        id = ID;
        System.out.print("ENTER FIRST NAME: ");
        FName = input.next();
        System.out.print("ENTER LAST NAME: ");
        LName = input.next();
    }

   public Student_Testing() {
        university = "University of San Carlos";
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER FIRST ID NUMBER: ");
        id = input.nextInt();
        System.out.print("ENTER FIRST NAME: ");
        FName = input.next();
        System.out.print("ENTER LAST NAME: ");
        LName = input.next();
    }

    public void Display() {
        System.out.print("My name is " + FName + " " + LName + " and my ID Number is " + id + ".\n");
        System.out.println(university);
    }
    public int CalculateTuition(int sem, int subj){
        return (sem * subj) * 5124;
        
    }
}