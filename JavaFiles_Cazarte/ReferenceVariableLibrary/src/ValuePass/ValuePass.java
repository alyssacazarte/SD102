
package ValuePass;
import IO.*;
import Temp.*;

public class ValuePass {
    public static void main (String [] args){
        ConsoleInput ci = new ConsoleInput ();
        ConsoleOutput co = new ConsoleOutput ();
        Values v = new Values ();
        PassValue pv = new PassValue ();
        
        double number1 = ci.getNum();
        double number2 = ci.getNum();
        
        v.num1 = number1;
        v.num2 = number2;
        
        double result = pv.sum(v);
        co.show(result);
        
        
    }
}
