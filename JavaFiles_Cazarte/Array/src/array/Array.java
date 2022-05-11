
package array;

public class Array {

    public static void main(String[] args) {
      //  original code and the args is the problem of the code is the args[x] that is 
      // it will not run
//      int num=0; 
//      int sum=0;
//      for(int x = 0; x<3; x++)
//      {
//          num = Integer.parseInt(args[x]);
//          sum+=num;
//      }
//      System.out.println("The sum is:" + sum);
//      int[] asdf = new int[10];//size of an array is 10
//      float[] qwer = new float[10];
//      String[] zxcy = new String [10];
//     // String[] xyz = {"asdf", "qwer", "zxcy"};//size of an array in this line is 3
//       String[] [] xyz = {{"asdf", "qwer", "zxcy"},{"asdf", "qwer", "zxcy"}};//size of an array is 2 by 3
//      int num = 0; //  
//      int sum = 0;
//      for(int x = 0; x<3; x++)
//      {
//          num = Integer.parseInt(args[x]);
//          sum+=num;
//       int sum = 0;
//       for(String x : args)
//       {
//           try
//           {
//           sum+=Integer.parseInt(x);
//           }
//           catch(Exception e)
//           {
//               System.out.println("Something went wrong"+ x);
//           }
//       }
//           System.out.println(sum);
//           
        //--THE TRY-CATCH STATEMENT
//        int sum = 0;
//       for(String x : args)
//       {
//           try
//           {
//           sum+=Integer.parseInt(x);
//           }
//           catch(NumberFormatException e)
//           {
//               System.out.println(x+"is not an integer");
//           }
//           catch(Exception e)
//           {
//               System.out.println("Something went wrong"+ x);
//           }
//       }
//           System.out.println(sum);
           //--CALL STACK METHOD
           Array a = new Array();
           int result = a.divideThis(1,0);
           System.out.println(result);
          
    }
    int divideThis(int a, int b)
    {
        int result=0;
        try
        {
        result = a/b; 
        }
        catch (NumberFormatException e)
        {
         System.out.println("NumberFormatException");
        }
        catch(IllegalArgumentException e)
        {
         System.out.println("IllegalArgumentException");
        }
        catch(Exception e)
        {
//         System.out.println("Exception");
           System.out.println(e.getCause());
           System.out.println(e.getMessage());//will tell you what is the error of your code
        }
          
        return result;
        //Call stack mechanism really catch the problem and the error
         
        //-- The Finally Clause
      }
    }   

    
    
    
    
