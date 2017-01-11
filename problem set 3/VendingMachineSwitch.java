import java.util.*;
public class VendingMachineSwitch
{
    public static void main(String[] args)
    {
        double priceOfItem1 = 1.25;
        double priceOfItem2 = .75;
        double priceOfItem3 = .90;
        double priceOfItem4 = .75;
        double priceOfItem5 = 1.50;
        double priceOfItem6 = .75;
        
        
        Scanner input = new Scanner(System.in);
        int item;
        double money;
        float change;
        
        System.out.print("Enter an item number: ");
        
        switch(item = input.nextInt())
        {
            case 1:System.out.print("Enter the amount of money: $");
                   money = input.nextDouble();
                   if(money>priceOfItem1){
                       change = (float)(money-priceOfItem1);
                       System.out.println("Thank you for buying item 1. Your change is $"+change);
                    }
                    else{
                       change = (float)(priceOfItem1-money);
                       System.out.println("Please insert another $"+change);
                    }
                    break;
                    
            case 2:System.out.print("Enter the amount of money: $");
                   money = input.nextDouble();
                   if(money>priceOfItem2){
                       change = (float)(money-priceOfItem2);
                       System.out.println("Thank you for buying item 2. Your change is $"+change);
                    }
                    else{
                       change = (float)(priceOfItem2-money);
                       System.out.println("Please insert another $"+change);
                    }
                    break;
                    
            case 3:System.out.print("Enter the amount of money: $");
                   money = input.nextDouble();
                   if(money>priceOfItem3){
                       change = (float)(money-priceOfItem3);
                       System.out.println("Thank you for buying item 3. Your change is $"+change);
                    }
                    else{
                       change = (float)(priceOfItem3-money);
                       System.out.println("Please insert another $"+(double)change);
                    }
                    break;
                    
            case 4:System.out.print("Enter the amount of money: $");
                   money = input.nextDouble();
                   if(money>priceOfItem4){
                       change = (float)(money-priceOfItem4);
                       System.out.println("Thank you for buying item 4. Your change is $"+change);
                    }
                    else{
                       change = (float)(priceOfItem4-money);
                       System.out.println("Please insert another $"+change);
                    }
                    break;
                    
            case 5:System.out.print("Enter the amount of money: $");
                   money = input.nextDouble();
                   if(money>priceOfItem5){
                       change = (float)(money-priceOfItem5);
                       System.out.println("Thank you for buying item 5. Your change is $"+change);
                    }
                    else{
                       change = (float)(priceOfItem5-money);
                       System.out.println("Please insert another $"+change);
                    }
                    break;
                    
            case 6:System.out.print("Enter the amount of money: $");
                   money = input.nextDouble();
                   if(money>priceOfItem6){
                       change = (float)(money-priceOfItem6);
                       System.out.println("Thank you for buying item 6. Your change is $"+change);
                    }
                    else{
                       change = (float)(priceOfItem6-money);
                       System.out.println("Please insert another $"+change);
                    }
                    break;
        }
    }
}


