
package Temp;

public class Salary {
    public String salaryType; //another way to get the value of salaryType(s.salaryType = "withAbsences")
 
    public Salary(String salaryType)//constructor instantiated
    {
     this.salaryType = salaryType;//constructor instantiated
    }
    public Salary()//explicitly define on my code, since we overload, to use this in our
            //Project 1 we don't need to put a String "withAbsences or withOvertime  like for this ( Salary s = new Salary();)
    {
        
    }
    
    public float getSalary()//to get the value of withAbsences put a (String salaryType)
    {
        if(salaryType == "withAbsences")
        {
            return 10400 - 3000;
        }
        else if(salaryType == "withOvertime")
        {
            return 10400 + 3000;
        }
        else
        {
            return 10400;
        }
    }
    public static int value = 123456;
    
    
    public static int getIntValue()//static becomes accessible to another class without instantiation
    {
        return 14344;
    }
}
