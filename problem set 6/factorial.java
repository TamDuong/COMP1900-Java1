import java.util.*;
/**
 * Tam Duong
 * COMP1900
 * Problem Set # 6
 * 10/31/2013
 * Factorial
 */
public class factorial {
    //this program calculate the factorial of a number    
	public static int solvefactorial(int x){   //this method take a parameter of a number and return the factorial of it
		int answer = 1;		//answer = 1 so it wont return 0 for factorial of x
		if(x != 0){
			for(int i = x; i > 0; i--){
				answer *= i;
			}
			return answer;
		}
		return 1; 
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		solvefactorial(number);
		System.out.print("the factorial of this number is "+solvefactorial(number));
	}
	
}
