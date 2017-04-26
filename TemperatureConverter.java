//TemperatureConverter.java
//Implements the Temperature Converter, which converts fahrenheit to celsius.
//Daniel Olsen
//4/7/2017

import java.util.Scanner;

public class TemperatureConverter {

    
    public static void main(String[] args) {
	//implements the initial values, including constants for the calculations
        Scanner userInput = new Scanner(System.in);
        int userFarValue = 0;
        double result = 0;
        final int OFFSETVALUE = 32;
        final double FRACRESULT = 5.0/9.0;

	//reads in the users input
        System.out.print("Please enter an integer for the fahrenheit temperature: ");
        userFarValue = userInput.nextInt();

	//takes the users input and calculates the celsius value
        result = (userFarValue - OFFSETVALUE) * FRACRESULT;
        System.out.print("You entered " +  userFarValue + " degrees fahrenheit:");
        System.out.printf(" this is %.2f degrees celsius. \n", result);
        
    }
    
}
