import java.util.*;
/**
 * Tam Duong
 * COMP 1900
 * PS7
 * 11/14/2013
 * List of friends
 */
public class ListsOfFriends
{   //this program search for common element in 2 arrays and display these element with the count of common element using 2 methods
    //the first method allow user to enter the elements
    //the second method display these element in common from 2 arrays
    //the main method will call the first method twice to get 2 arrays then pass it to the second method for printting
    public static int[] readFriendIDs()
    {
        Scanner input = new Scanner(System.in); 
        System.out.print("How many friends are there? ");
        int length = input.nextInt();
        
        //read friend ID numbers
        int[] friends = new int[length];
        System.out.print("Enter list of friends ID number: ");
        for(int i = 0; i < friends.length; i++)
            friends[i] = input.nextInt();        
        
        return friends;
    }
    
    public static void displayCommonFrindIDs(int[] a, int[] b)
    {
        int count = 0;
        System.out.print("Friends in common: ");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){               //check for friend in common
                    System.out.print(a[i]+" ");
                    count ++;
                }
            }
        }
        
        if(count == 0)              //if there are no friends in common this will print no friend in common
            System.out.print("no friends in common");
            
        System.out.println();
        System.out.println("Number of friends in common: "+count);
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        int[] myFriends = readFriendIDs();
        int[] momFriends = readFriendIDs();
        displayCommonFrindIDs(myFriends, momFriends);
        
    }
}
