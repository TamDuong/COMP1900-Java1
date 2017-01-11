import java.util.*;
public class MakingChangeQuarter
{
    public static void main(String[] args)
    {
        float value; //use float bc double has so many digit, when multiply by 100 will give value 115.999999
        int numberofquarter;
        int amountleftover;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Value: $");
        value = 100*input.nextFloat();
                     //value is in double
        
        numberofquarter = (int)(value/25);  //since value is type double the result will be in type double
       //notice without the int the expression cause error bc as declare above that numberofquarter is type int 
        System.out.println("Number of quarters: "+numberofquarter);
        amountleftover = ((int)value)%25;
        System.out.println("Ammount left over: "+amountleftover+" cents");
    }
}
