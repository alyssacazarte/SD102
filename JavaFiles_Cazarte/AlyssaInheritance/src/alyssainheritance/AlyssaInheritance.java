package alyssainheritance;
import IO.ConsoleInput;
import alyssainheritance.Manager;
public class AlyssaInheritance {

    public static void main(String[] args) {
        
        ConsoleInput h = new ConsoleInput();
	Manager m = new Manager();
      
        System.out.println("Enter the Employers regular salary: ");
	double d = h.getNum();
	System.out.println("Enter the Employers additional salary: ");
	double e = h.getNum();
	double result = m.salary(d,e);
	System.out.println("Total Salary: " + result);
        m.getDetails (); 
	System.out.println(h.getNum());
       
    }
    
}
