package financialassistance;
import financialassistance.*;
public class FinancialAssistance {
    
    public static void main (String[]args) {
        Student s = new Student ();
        System.out.println("---------------------------------------------------");
        System.out.println( "PN Cash Assistance for Class 2023");
        System.out.println("---------------------------------------------------");
        System.out.println( "Finacial Assistance total amount:" + s.FinancialAssistance);
        System.out.println( "The Students are part takers of the PN Maintenance, therefore they included to pay for it.");
        System.out.println( "Total Maintenance:" + s.Maintenance);
        System.out.println( "Therefore the total amount of assistance to be given has been deducted.");
        System.out.println( "This is the deducted total amount: " +( s.Share(s.Maintenance)));
        System.out.println( "Hence, students can now recieve each financial assistance with an amount of:" + (s.Share (290000,69)));
    }    
    
    
}