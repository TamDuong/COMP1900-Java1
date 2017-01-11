import java.util.*;
/**
 * Tam Duong
 * COMP 1900
 * Lab #5
 * 11/13/2013
 * Overload method(2 arrays and boolean as arguments)
 */
public class part3
{    
    public static double []getArrayStats(double []a, double []b, boolean c)
    {
        if (c == true){                     //multiply arrays
            double []multiply = new double[a.length];
            double sumMulti = 0;
            for(int i = 0; i < a.length; i++){
                multiply[i] = a[i] * b[i];
                sumMulti += multiply[i];
            }
            //assume that 2 arrays are sorted
            double min = multiply[0];
            double max = multiply[multiply.length - 1];
            double med = multiply[(multiply.length - 1)/2];
            double ave = sumMulti/multiply.length;
            
            double []result = {min, med, max, ave};
            return result;
        }        
        else {                              //add arrays
            double []plus = new double[a.length];
            double sumplus = 0;
            for(int i = 0; i < a.length; i++){
                plus[i] = a[i] + b[i];
                sumplus += plus[i];
            }
            //assume that 2 arrays are sorted
            double min = plus[0];
            double max = plus[plus.length - 1];
            double med = plus[(plus.length - 1)/2];
            double ave = sumplus/plus.length;
            
            double []result = {min, med, max, ave};
            return result;
        }
    }
    
    public static void main(String []args)
    {        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of 2 arrays: ");
        int length = input.nextInt();
        double []list1 = new double[length];
        double []list2 = new double[length];
        
        //read input for array1
        System.out.print("Enter the numbers for a the first array: ");
        for(int i = 0; i < list1.length; i++)
            list1[i] = input.nextDouble();
            
        //read input for array2    
        System.out.print("Enter the numbers for a the second array: ");
        for(int j = 0; j < list2.length; j++)
            list2[j] = input.nextDouble();
            
        //desire ADD or MULTIPLY
        System.out.print("Type TRUE to multiply 2 array or FALSE to add 2 array: ");
        boolean choice = input.nextBoolean();           //read input of type boolean 
        
        double []answer = getArrayStats(list1, list2, choice);          //method call
        
        //print answer
        System.out.println("Min:"+answer[0]);
        System.out.println("Med:"+answer[1]);
        System.out.println("Max:"+answer[2]);
        System.out.println("Ave:"+answer[3]);
    }
}
