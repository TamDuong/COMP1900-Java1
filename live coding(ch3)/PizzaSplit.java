import java.util.*;
public class PizzaSplit
{       
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numPeople;
        int cicisNumberslices, dominosNumberslices, pizzahutsNumberslices, exlinesNumberslices;
        int pizza, totalNumberSlices;         
        double numOfSlicesForEachPerson;
        
        
        System.out.print("Number of people attend the meeting: ");
        numPeople = input.nextInt();    //this line already contain new line******asing user for input********
        pizza = numPeople/3;        //3 people for a pizza, cast numpeople to double
        //System.out.println("Total number of pizzas need to order: " + pizza); 
        //the print total number of pizza need to order can be in the line above but to make the program more organize it better to put it at the bottom
        //so when java ask for the value, it can ask for the value all at the same time then display the result after all
        
        System.out.print("Number of slices that Cici's pizzas have: ");
        cicisNumberslices = input.nextInt();                            //*****asking user for input******
        System.out.print("Number of slices that Domino's pizzas have: ");
        dominosNumberslices = input.nextInt();                          //*****asking user for input******
        System.out.print("Number of slices that PizzaHut's pizzas have: ");
        pizzahutsNumberslices = input.nextInt();                        //*****asking user for input******
        System.out.print("Number of slices that Exline's pizzas have: ");
        exlinesNumberslices = input.nextInt();                          //*****asking user for input******
        
        totalNumberSlices = cicisNumberslices + dominosNumberslices + pizzahutsNumberslices + exlinesNumberslices;
        numOfSlicesForEachPerson = (double)totalNumberSlices/numPeople;
        //double tell Java to cast totalnumberslices in int to double then the result of expression is in double
        System.out.println("Total number of pizzas need to order: " + pizza);
        System.out.println("Number of slices each person will get: " + numOfSlicesForEachPerson);
    }
}

