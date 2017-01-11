import java.util.*;
public class WhatTheTemp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double temperature;
        double Fahrenheit;
        double Celsius;
                        
        System.out.print("What the temperature is in Memphis in F? ");
        temperature = input.nextDouble();
        Celsius = ((temperature-32)*(5.0/9));   
        //notice 5.0 not 5 bc if put 5 then the expression 5/9 is in the ()so that java have to evaluate that first
        //5 and 9 both in type int this (5/9) will give 0 bc it an int        
        System.out.println("The temperature in Memphis is: " + Celsius + "C");
        
        
        System.out.print("What the temperature is in Boston in F? ");
        temperature = input.nextDouble();
        Celsius = ((temperature-32)*(5.0/9));
        //notice 5.0 not 5 bc if put 5 then the expression 5/9 is in the ()so that java have to evaluate that first
        //5 and 9 both in type int this (5/9) will give 0 bc it an int 
        System.out.println("The temperature in Boston is: " + Celsius + "C");
        
        
        System.out.print("What the temperature is in Rome in C? ");
        temperature = input.nextDouble();
        Fahrenheit = (temperature*(9.0/5)+32);
        //notice 9.0 not 9 bc if put 9 then the expression 9/5 is in the ()so that java have to evaluate that first
        //5 and 9 both in type int this (9/5) will give 0 bc it an int 1 instead of 1.8
        System.out.println("The temperature in Rome is: " + Fahrenheit + "F");
        
        
        System.out.print("What the temperature is in Warsaw in C? ");
        temperature = input.nextDouble();
        Fahrenheit = (temperature*(9.0/5)+32);
        //notice 9.0 not 9 bc if put 9 then the expression 9/5 is in the ()so that java have to evaluate that first
        //5 and 9 both in type int this (9/5) will give 0 bc it an int 1 instead of 1.8
        System.out.println("The temperature in Warsaw is: " + Fahrenheit + "F");
        
    }
}
