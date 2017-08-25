package basicInputOutput.controller;
import java.util.Scanner;

public class BasicIOController 
{
	private String firstName = " ";
    private String lastName = " ";
    private String first = " ";
    private String last = " ";
    
    public BasicIOController(String first, String last)
	{
	firstName = first;
	lastName = last;
	}
    public void printGreeting()
    {
   // methods require parentheses 
	  // String firstName = "Josh";
	  // String lastName = "Sorrells";
	   System.out.println("Hello" + firstName + " " + lastName);
	   Scanner myScanner = new Scanner(System.in);
	   String response = myScanner(System.in);
	   System.out.println(response);
	   
	// Contructor - method with same name as its class that initializes the class
    }
   
}
