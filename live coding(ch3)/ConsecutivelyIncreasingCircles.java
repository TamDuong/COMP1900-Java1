import java.util.*;
public class ConsecutivelyIncreasingCircles
{    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;
        double circumference, area, radius;
        int diameter;
        
                
        System.out.print("Diameter of the circle is: ");
        diameter = input.nextInt();
       
        radius = (double)diameter/2;        //double cast diameter and 2 to type double
        circumference = (2*PI*radius);
        area = PI*radius*radius;
        System.out.println("Circumference of the circle is: "+circumference);
        System.out.println("Area of the circle is: "+area);
    }
}