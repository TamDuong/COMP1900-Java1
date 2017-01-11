/**
 *Tam Duong
 * COMP1900 
 * Problem Set #2
 * 9/11/2013
 * Baseball Expenses
 */

public class BaseballExpenses
{
     // This program prints a summary of items that Freddie buy.
     // The program display: 
     //  -the name each item
     //  -the number of each item
     //  -the total cost of each item
     //  -Freddie's total expenditures

    public static void main(String[] args)
    {
        //buy a beer before every odd-numbbered inning, each is $6
        //buy nachos before every even-numbered inning, each is $4
        //buy scorecard before the game, scorecard is $3
        int total_innings = 9;
        int total_odd_innings = 5;      //odd innings are 1,3,5,7,9
        int total_even_innings = 4;     //even innings are 2,4,6,8 
        int x = 6;                      //x = 6dollars
        int y = 4;                      //y = 4dollars
        int z = 3;                      //z = 3dollars
        System.out.print("Beer\t");
        System.out.print("\t"+(1*total_odd_innings));
        System.out.println("\t6 dollars");
        System.out.print("Nachos\t");
        System.out.print("\t"+(1*total_even_innings));
        System.out.println("\t4 dollars");
        System.out.print("Scorecard");
        System.out.print("\t"+(1));
        System.out.println("\t3 dollars");
        System.out.print("Freddie's total expenditures: ");
        System.out.println(1*total_odd_innings*x + 1*total_even_innings*y + z+" dollars");
        
    }
}
