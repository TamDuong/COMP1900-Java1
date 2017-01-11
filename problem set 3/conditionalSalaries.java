import java.util.*;
/**
 *Tam Duong
 * COMP1900 
 * Problem Set #3
 * 9/25/2013
 * conditional Salaries
 */
public class conditionalSalaries
{    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int grade, step;
        
        System.out.print("Grade: ");
        grade = input.nextInt();
        System.out.print("Step: ");
        step = input.nextInt();
        
        switch(grade)
        {
            case 1: switch(step)
            {
                case 1: System.out.println("Salary is 20324");break;
                case 2: System.out.println("Salary is 21003");break;
                case 3: System.out.println("Salary is 21679");break;
                default: System.out.println("Invalid step"); 
            }
            break;
            
            case 2: switch(step)
            {
                case 1: System.out.println("Salary is 22851");break;
                case 2: System.out.println("Salary is 23395");break;
                case 3: System.out.println("Salary is 24151");break;
                default: System.out.println("Invalid step"); 
            }
            break;
            
            case 3: switch(step)
            {
                case 1: System.out.println("Salary is 24933");break;
                case 2: System.out.println("Salary is 25764");break;
                case 3: System.out.println("Salary is 26595");break;
                default: System.out.println("Invalid step"); 
            }
            break;
            
            case 4: switch(step)
            {
                case 1: System.out.println("Salary is 27990");break;
                case 2: System.out.println("Salary is 28922");break;
                case 3: System.out.println("Salary is 29855");break;
                default: System.out.println("Invalid step"); 
            }
            break;
            
            case 5: switch(step)
            {
                case 1: System.out.println("Salary is 31315");break;
                case 2: System.out.println("Salary is 32359");break;
                case 3: System.out.println("Salary is 33402");break;
                default: System.out.println("Invalid step"); 
            }
            break;
            
            default: System.out.println("Invalid grade");
        }
    }
}
//using switch statement in this situation is better than if-else statement
//It is clearer and shorter bc grade and step are both going to be and int and in everygrade and everystep the output is different
//this problem doesn't have the same output so using if-else statement is harder and longer to look at
//using if-else the programmer first have to use scanner input for grade and then inside every if-else statement they have to use scanner input for step
//using switch statement the programmer put both scanner input on top of switch statement instead of having them inside every sigle if-else 
