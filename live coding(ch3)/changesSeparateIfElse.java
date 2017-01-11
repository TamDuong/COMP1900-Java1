import java.util.*;
public class changesSeparateIfElse
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        float value;    //use float bc double has so many digit, when multiply by 100 will give value 115.999999
        int coinvalue;
        int numberofquarter, numberofdime, numberofnickel, changes;
        
        System.out.print("Value: $");
        value = input.nextFloat();
        value = value*100;
        System.out.print("Coinvalue: ");
        coinvalue = input.nextInt();
        
        if(coinvalue == 25){
            numberofquarter = (int)value/coinvalue;
            changes = (int)value%coinvalue;
            System.out.println("Number of quarter: "+numberofquarter);
            System.out.println("Amount left over: "+changes);
        }
        else if(coinvalue == 10){
            numberofdime = (int)value/coinvalue;
            changes = (int)(value%coinvalue);
            System.out.println("Number of dime: "+numberofdime);
            System.out.println("Amount left over: "+changes);
        }
        else if(coinvalue == 5){
            numberofnickel = (int)value/coinvalue;
            changes = (int)value%coinvalue;
            System.out.println("Number of nickel: "+numberofnickel);
            System.out.println("Amount left over: "+changes);
        }
        else{
        System.out.println("Invalid coin");
    }
    }
}
