
/**
 *Tam Duong
 * COMP1900 
 * Problem Set #2
 * 9/11/2013
 * Smurf Population
 */
public class SmurfPopulation
{
    // This program determine if the Smurf population increased
    // The program display the number of smurfs changed for each month
    
    public static void main(String[] args)
    {
        //73 smurfs in may, 80 in june, 75 in july, 64 in august
       int w = 73;          //w = 73smurfs
       int x = 80;          //x = 80smurfs
       int y = 75;          //y = 75smurfs
       int z = 64;          //z = 64smurfs
        
        System.out.print("In June, the Smurf population increased?  ");
        System.out.println(w<=x);
        System.out.print("The number of Smurf changed from May is ");
        System.out.println(x-w);
        System.out.print("In July, the Smurf population increased?  ");
        System.out.println(x<=y);
        System.out.print("The number of Smurf changed from June is ");
        System.out.println(y-x);
        System.out.print("In August, the Smurf population increased?  ");
        System.out.println(y<=z);
        System.out.print("The number of Smurf changed from July is ");
        System.out.println(z-y);
    }
}
