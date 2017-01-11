import java.util.*;
/**
 * Tam Duong
 * COMP 1900
 * Lab #5
 * 11/13/2013
 * Overload method(2D array as arguments)
 */
public class part2
{    
    public static double []getArrayStats(double [][]a)
    {
        double min = a[0][0];
        double max = a[0][0];
        double ave = 0;
        double sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++){           //read collumns as a[i].length where (in this case) i is the row number in a 2D array
                if(min > a[i][j])
                    min = a[i][j];                
                if(max < a[i][j])
                    max = a[i][j];
                
                sum += a[i][j];
            }
        }
            ave = sum/(a.length*a[0].length);           //take a.length * a[0].length 
        
            double []result = {min, ave, max};
            return result;
            
    }
    public static void main(String[]  args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows and collumns of 2D array list:");
        int rows = input.nextInt();
        int collumns = input.nextInt();
        double [][]list = new double[rows][collumns];        
        System.out.print("Enter numbers in list:"); 
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < collumns; j++){
                list[i][j] = input.nextDouble();
            }
        }
        
        double []list2 = getArrayStats(list);                
        System.out.println("Minimum element:"+list2[0]);
        System.out.println("Average element:"+list2[1]);
        System.out.println("Maximum element:"+list2[2]);
    }
}
