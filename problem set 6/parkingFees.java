import java.util.*;
/**
 * Tam Duong
 * COMP1900
 * Problem Set # 6
 * 10/31/2013
 * Parking Fees
 */
public class parkingFees {
	//this program calculate parking fees base on minute	
	public static int parkingCharge(int x){		//this method take a parameter min and return the charge base on min
		if(x <= 30)
			return 0;		//park between 0-30 min is FREE
		if(x == 1440)
			return 21;		//park for 24 hour(maximum) is $21
		
		int money = 0;
		money += x/30;
		if((x%30) == 0 ){			//ensure if the time is 421 then charge will be $15 not $14
			return money;
		}			
		return money+1;
	}		
	
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);		
		System.out.print("How long is it been since the car in the parking lot (minutes)? ");
		int minute = input.nextInt();
		parkingCharge(minute);		
		System.out.println("Your parking fees is $" + parkingCharge(minute) + ".00");
		
		
	}

}
