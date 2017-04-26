//PolygonManager.java
//Implements the Polygon Manager which, given a user input, tells them what kind of polygon it is.
//Daniel Olsen
//4/7/2017
import java.util.Scanner;

public class PolygonManager {

    public static void main(String[] args) {

	//sets the initial values and asks the user for a integer to equal the number of sides for the polygon
        int userInput = 0;
        Scanner userScanner = new Scanner(System.in);
        System.out.print("Please enter the number of sides of your polygon: ");
        userInput = userScanner.nextInt();

	//the switch logic, implementing the fall-through for the first 3 values
        switch(userInput)
        {
            case 0:
            case 1:
            case 2:
                System.out.println("A polygon cannot have " + userInput + " side(s).");
                break;
            case 3:
                System.out.println("Your polygon is a triangle");
                break;
            case 4:
                System.out.println("Your polygon is a quadrilateral");
                break;
            case 5:
                System.out.println("Your polygon is a pentagon");
                break;
            case 6:
                System.out.println("Your polygon is a hexagon");
                break;
            case 7:
                System.out.println("Your polygon is a heptagon");
                break;
            case 8:
                System.out.println("Your polygon is a octagon");
                break;
            case 9:
                System.out.println("Your polygon is a nonagon");
                break;
            case 10:
                System.out.println("Your polygon is a decagon");
                break;
            default:
                System.out.println("Sorry, I can't identify your polygon");
        }
    }
    
}
