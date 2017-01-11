import java.util.*;
public class changesforquarterdimenickelcent
{
    public static void main(String[] args)
    {
        float value;    //use float bc double has so many digit, when multiply by 100 will give value 115.999999
        int numberofquarter;
        int numberofdime;
        int numberofnickel;
        int amountleftover;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Value: $");
        value = input.nextFloat();
        value = value*100;              //value is in double
        
        numberofquarter = (int)(value/25);  //since value is type float the result will be in type float
       //notice without the int the expression cause error bc as declare above that numberofquarter is type int    
        numberofdime = (int)(value%25/10);
        numberofnickel = (int)(value%25%10/5);
        amountleftover = (int)(value%5);
        
        System.out.println("Number of quarters: "+numberofquarter);
        System.out.println("Number of dimes: "+numberofdime);     
        System.out.println("Number of nickels: "+numberofnickel);        
        System.out.println("Ammount left over: "+amountleftover+" cents");
   
    }
}
