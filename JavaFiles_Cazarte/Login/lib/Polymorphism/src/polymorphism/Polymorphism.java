package polymorphism;

public class Polymorphism {

   
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee m = new Manager();
        Employee r = new Engineer();
        
        e.doSomething();
        m.doSomething();
        r.doSomething();
      // Checking for any other type of Employee
           System.out.println("Examine the process of each\nby cheking if it uses instanceof: Manager, Engineer or does not. \n");
       System.out.println("-----------------------------------------------------------------------------\n");
           System.out.println("Examine  the insatanceof the process of Employee:");
          if ( e instanceof Manager){
            System.out.println(" Contains instanceof Manager\n");

            } else if (e instanceof Engineer){
            System.out.println(" Contains instanceof Engineer\n");

            }
           else{
            System.out.println(" Does not contain instanceof! \n");

            }
       System.out.println("----------------------------------------------------------------------------\n");

// Checking for any other type of Manager
           System.out.println("Examine  the insatanceof the process of Manager:");

            if ( m instanceof Employee){
                        System.out.println(" Contains instanceof Employee \n");

                        } else if (m instanceof Engineer){
                        System.out.println(" Contains instanceof Engineer \n ");

                        }
                       else{
                        System.out.println(" Does not contain instanceof!\n");

                        }
       System.out.println("------------------------------------------------------------------------------\n");

// Checking for any other type of Engineer
           System.out.println("Examine  the insatanceof the  process of Engineer:");
            if ( r instanceof Manager){
                        System.out.println(" Contains instanceof Manager \n");

                        } else if (r instanceof Employee){
                        System.out.println(" Contains instanceof Employee \n");

                        }
                       else{
                        System.out.println(" Does not contain instanceof! \n");

      }  
        }
    }
    

