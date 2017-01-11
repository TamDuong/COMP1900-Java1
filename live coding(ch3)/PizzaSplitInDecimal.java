import java.util.*;
public class PizzaSplitInDecimal
{   
    //this program cal number of pizza in decimal
    //try to enter 20 for number of people for an example
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numPeople;
        int cicisNumberslices, dominosNumberslices, pizzahutsNumberslices, exlinesNumberslices;
        double pizza; 
        int totalNumberSlices;
        double numOfSlicesForEachPerson;
        
        
        System.out.print("Number of people attend the meeting: ");
        numPeople = input.nextInt();    //this line already contain new line
        pizza = (double)numPeople/3;        //3 people for a pizza, cast numpeople to double
        System.out.println("Total number of pizzas need to order: " + pizza);
        
        System.out.print("Number of slices that Cici's pizzas have: ");
        cicisNumberslices = input.nextInt();
        System.out.print("Number of slices that Domino's pizzas have: ");
        dominosNumberslices = input.nextInt();
        System.out.print("Number of slices that PizzaHut's pizzas have: ");
        pizzahutsNumberslices = input.nextInt();
        System.out.print("Number of slices that Exline's pizzas have: ");
        exlinesNumberslices = input.nextInt();
        
        totalNumberSlices = cicisNumberslices + dominosNumberslices + pizzahutsNumberslices + exlinesNumberslices;
        numOfSlicesForEachPerson = (double)totalNumberSlices/numPeople;
        //double tell Java to cast totalnumberslices in int to double then the result of expression is in double
        System.out.println("Number of slices each person will get: " + numOfSlicesForEachPerson);
    }
}

