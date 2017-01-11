import java.util.*;
/**
 * Tam Duong
 * COMP 1900
 * Lab #5
 * 11/13/2013
 * Method find Min, Max, Ave (take in array a and return a array with length 3)
 */
public class part1
{    
    public static double []getArrayStats(double []a)
    {
        double min = a[0];
        double max = a[0];
        double ave = 0;
        double sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(min > a[i])
                min = a[i];                
            if(max < a[i])
                max = a[i];
                
            sum += a[i];
        }
        ave = sum/a.length;
        
        double []result = {min, ave, max};
        return result;
    }
    public static void main(String[]  args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of list:");
        int length = input.nextInt();
        double []list = new double[length];        
        System.out.print("Enter The list of numbers:"); 
        for(int i = 0; i < length; i++){
            list[i] = input.nextDouble();
        }
        
        double []list2 = getArrayStats(list);                
        System.out.println("Minimum element:"+list2[0]);
        System.out.println("Average element:"+list2[1]);
        System.out.println("Maximum element:"+list2[2]);
    }
}

