package project1;
import Temp.Salary; //constructor and static topic
import Temp1.*; // complete and concrete topic
public class Project1 {

    public static void main(String[] args) {
//        Salary s = new Salary();
//        s.salaryType = "withAbsences";//another way to get the value of withAbsences or withOvertime
//        float value = s.getSalary(); //to get the value of withAbsences you must put a Sring value like "withAbsences"
//        System.out.println(value);
        
//       Salary s = new Salary();
//       Salary s2 = new Salary();
//       s2.salaryType = "withOvertime";
//       float value = s.getSalary();
//       System.out.println(value);
//       //the result of this is 10400
       
//       Salary s = new Salary();
//       Salary s2 = new Salary();
//       s2.salaryType = "withOvertime";
//       float value = s2.getSalary();
//       System.out.println(value);
//       //the result of this is 10400
//       //the result of this is 13400
    
// contructor overloading with explicitly
//        Salary s = new Salary();
//        float value = s.getSalary();
//        System.out.println(value);
        
////using the static method   
//        System.out.println(Salary.getIntValue());//result 14344
//        System.out.println(Salary.value);//result 14344, 123456
        
//This is the effect of a variable that is defined as STATIC when the value is change all value will be affected     
//        Salary s = new Salary();
//        s.value = 654321;
//        System.out.println(s.value);// result 14344, 123456, 654321
//        
//        System.out.println(Salary.value);// result 14344,123456,654321, 654321
//        Salary s2 = new Salary();
//        System.out.println(s2.value);//result 14344,123456,654321,654321,654321
//        s2.value = 1000;
//        System.out.println(s2.value);//result 14344,123456,654321,654321,654321,1000
        
//This is the part that you will use a two methon within a class 
       // Project1 p1 = new Project1();
       // System.out.println(getStatus(1));// if you will use (p1.getstatus its the same result "Your friend is instantiated") 
//    }
//    static String getStatus(int x)
//    {
//        if (x==0)
//        {
//            return "Your friend is not instantiated";
//        }
//        else
//        {
//            return "Your friend is instantiated";
//        }
    //result is Your friend is instantiated
           
//       Chicken c = new Chicken();
//       Chicken c1= new Chicken();
//       Chicken c2= new Chicken("Manok na Pula");
//       c.sound();
//       c.eat();
//       Chicken.walk();

//-------Another topic: Complete and Concrete--------
    Utility u = new UtilitySon();
    double result = u.subtract(1,2);
    double result2 = u.add(1,2);
    double result3 = u.multiply(1,2);
    double result4= u.divide(1,2);
    System.out.println(result);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    
    }
    {
        
    }
    
}
