import java.util.*;
/**
 *Tam Duong
 * COMP1900 
 * Problem Set #4
 * 10/10/2013
 * Calendar
 */
public class calendar
{
    //program compute and display a tabular calendar for February of that year
    //assume that the year is NOT a leap year (which mean February always have 28 days)
    //program prompt user for the year and the number representing the day of the week Jan.1 fell on
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year you want to see:\n>> ");
        int year = input.nextInt();
        System.out.print("Enter the day of the week that Jan. 1 fell on (0 = Sun, 1 = Mon, etc.)\n>> ");
        int daycode = input.nextInt();          //this day represent the daycode of the week
        daycode = (daycode + 30)/7;     //this new daycode is the day of the week that Jan. 31 fell on
                                //Jan. has 31 days when the user input the DAY OF THE WEEK that is the first day in 31days so there are 30 days left in Jan.
                                //7 is the total days in a week from sun.-sat.
        daycode++;                  //this is the day of the week that FEB. 1 fell on
        System.out.println("\tFebruary "+year);
        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
        switch(daycode)                     //determine the alignment for the first day of Feb
        {
           case 0:System.out.print(" ");break;
           case 1:System.out.print("     ");break;
           case 2:System.out.print("         ");break;
           case 3:System.out.print("             ");break;
           case 4:System.out.print("                 ");break;
           case 5:System.out.print("                     ");break;
           case 6:System.out.print("                         ");break;
        }
        for(int day = 1; day <= 28; day++)
        {
            System.out.print(day);
            if((day+daycode)%7!=0){         //this loop determine whether or not to start a new line
                if(day < 9)                 //this loop determine the spacing for each number of date since we want it align perfectly
                    System.out.print("   ");
                else
                    System.out.print("  ");
                }
            else{
                if(day < 9){               //this loop determine the spacing for each number of date after new line since we want it align perfectly
                System.out.print("\n ");}
                else
                System.out.println();
            }
        }
        System.out.println();
    }
}
