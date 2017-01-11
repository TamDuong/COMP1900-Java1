import java.util.*;
public class MakingChangeDime
{
    public static void main(String[] args)
    {
        float value;    //use float bc double has so many digit, when multiply by 100 will give value 115.999999
        int numberofdime;
        int amountleftover;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Value: $");
        value = input.nextFloat();
        value = value*100;
        System.out.println(value);
        
        numberofdime = (int)(value/10);
        System.out.println("Number of dimes: "+numberofdime);
        amountleftover = (int)(value%10);
        System.out.println("Ammount left over: "+amountleftover+" cents");
    }
}