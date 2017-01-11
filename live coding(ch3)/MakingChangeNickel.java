import java.util.*;
public class MakingChangeNickel
{
    public static void main(String[] args)
    {
        float value;    //use float bc double has so many digit, when multiply by 100 will give value 115.999999
        int numberofnickel;
        int amountleftover;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Value: $");
        value = input.nextFloat();
        value = value*100;
        
        numberofnickel = (int)(value/5);
        System.out.println("Number of nickels: "+numberofnickel);
        amountleftover = (int)(value%numberofnickel);
        System.out.println("Ammount left over: "+amountleftover+" cents");
    }
}