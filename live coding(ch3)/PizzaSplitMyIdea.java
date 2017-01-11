import java.util.*;
public class PizzaSplitMyIdea
{   
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numPeople;
        int numCicis, numDominos, numPizzaHuts, numExlines;
        int cicisNumberslices, dominosNumberslices, pizzahutsNumberslices, exlinesNumberslices;
        int totalcicisNumberslices, totaldominosNumberslices, totalpizzahutsNumberslices, totalexlinesNumberslices;
        int pizza, totalNumberSlices;
        double numOfSlicesForEachPerson;
        
        
        System.out.print("Number of people attend the meeting: ");
        numPeople = input.nextInt();    //this line already contain new line
        pizza = numPeople/3;        //3 people for a pizza
        System.out.println("Total number of pizzas need to order: " + pizza);
        
        System.out.print("Number of  Cici's pizza: ");
        numCicis = input.nextInt();
        System.out.print("Number of Domino's pizza: ");
        numDominos = input.nextInt();
        System.out.print("Number of PizzaHut's pizza: ");
        numPizzaHuts = input.nextInt();
        System.out.print("Number of Exline's pizza: ");
        numExlines = input.nextInt();
        
        System.out.print("Number of slices that Cici's pizza have: ");
        cicisNumberslices = input.nextInt();
        System.out.print("Number of slices that Domino's pizza have: ");
        dominosNumberslices = input.nextInt();
        System.out.print("Number of slices that PizzaHut's pizza have: ");
        pizzahutsNumberslices = input.nextInt();
        System.out.print("Number of slices that Exline's pizza have: ");
        exlinesNumberslices = input.nextInt();
        
        totalNumberSlices = numCicis*cicisNumberslices + numDominos*dominosNumberslices + numPizzaHuts*pizzahutsNumberslices + numExlines*exlinesNumberslices;
        numOfSlicesForEachPerson = (double)totalNumberSlices/numPeople;
        //double tell Java to cast totalnumberslices in int to double then the result of expression is in double
        System.out.println("Number of slices each person will get: " + numOfSlicesForEachPerson);
    }
}
