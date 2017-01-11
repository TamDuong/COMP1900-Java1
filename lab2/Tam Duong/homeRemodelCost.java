import java.util.*;
/**
 * Tam Duong
 * COMP 1900
 * Lab #2
 * 9/25/2013
 * HomeRemodelCost
 */
public class homeRemodelCost
{    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double length, width, height;
        double doorWidth, doorHeight;
        double windowWidth, windowHeight;
        int paintType;
        
        
        System.out.print("Enter the length, width, height of the room (in ft):");
        length = input.nextDouble();
        width = input.nextDouble();
        height = input.nextDouble();
        System.out.print("Enter the width and height of the room's door (in ft):");
        doorWidth = input.nextDouble();
        doorHeight = input.nextDouble();
        System.out.print("Enter the width and height of the room's window (in ft):");
        windowWidth = input.nextDouble();
        windowHeight = input.nextDouble();
        System.out.print("Enter the type of paint to use (1 for standard and 2 for deluxe):");
        paintType = input.nextInt();
        
        
        
        double costOfStandardPaint = 14.99, costOfDeluxePaint = 29.99;
        double areaPerCanOfPaint = 250;                         //1 can of paint cover 250 ft^2
        final double TAX_RATE = 0.0925;                     //tax is 9.25%
        double areaOfRoom = 2*length*height+2*width*height;       //area of room excluding ceiling, floor
        double areaOfDoor = doorWidth * doorHeight;                 //area of door equal to length*width
        double areaOfWindow = windowWidth * windowHeight;               //area of window equal to length*width
        double numberCansOfPaint;
        double cost, taxAmount;                                        //total cost of paint
        double area = areaOfRoom-areaOfDoor-areaOfWindow;               //total area excluding ceiling, floor, door, window
        
        System.out.println("The paintable wall area of the room is "+area+"ft2");
        numberCansOfPaint = area/areaPerCanOfPaint;
        
        
        if(numberCansOfPaint%(int)numberCansOfPaint==0){        //use the double of canofpaint divide by int of canofpaint to find out if there is a remainder
            System.out.println("The number of cans of paint required: "+(int)numberCansOfPaint+"can");      
            //(int)numbercanofpaint will cast the result to int and display as an integer
        }
        else{
            numberCansOfPaint = (int)numberCansOfPaint+1;
             System.out.println("The number of cans of paint required: "+(int)numberCansOfPaint+"can");
             //(int)numbercanofpaint will cast the result to int and display as an integer
        }
            
        switch(paintType){
            case 1:cost = numberCansOfPaint*costOfStandardPaint;
                   System.out.println("Cost of paint(before tax): $"+cost);
                   taxAmount = cost*TAX_RATE;
                   System.out.println("The tax amount is $"+taxAmount);
                   cost = cost+taxAmount;
                   System.out.println("Cost of paint(after tax) is $"+cost);
                   break;
            case 2:cost = numberCansOfPaint*costOfDeluxePaint;
                   System.out.println("Cost of paint(before tax) is $"+cost);
                   taxAmount = cost*TAX_RATE;
                   System.out.println("The tax amount is $"+taxAmount);
                   cost = cost+taxAmount;
                   System.out.println("Cost of paint(after tax) is $"+cost);
                   break;
            default:System.out.println("Invalid");
        }
    }
}
