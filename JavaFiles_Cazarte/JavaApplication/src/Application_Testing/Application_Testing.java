package Application_Testing;

import java.util.Scanner;

public class Application_Testing {

    public static void main(String[] args) {
        // TODO code application logic here
        Student_Testing student1;
        student1 = new Student_Testing ();
        Student_Testing student2 = new Student_Testing();
        //Faculty faculty = new Faculty();
        student1.Display();
        student2.Display();
        //faculty.Display();
        int sem, subj;
        Scanner input = new Scanner(System.in);
        System.out.print("How many semester? ");
        sem = input.nextInt();
        System.out.print("How many subject? ");
        subj = input.nextInt();
        int tuition = student2.CalculateTuition(sem, subj);

        System.out.println("Tuition Fee: " + String.valueOf(tuition) + " pesos.");

    }

}