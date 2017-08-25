package basicInputOutput.controller;
import java.util.Scanner;

public class BasicIOController 
{
	private String firstName = " ";
    private String lastName = " ";
    
    
    public BasicIOController(String first, String last)
	{
	firstName = first;
	lastName = last;
	}
    public void printGreeting()
    {
   // methods require parentheses 
    	firstName = "Josh";
    	lastName = "Sorrells";
	   System.out.println("Hello" + firstName + " " + lastName);
	   Scanner myScanner = new Scanner(System.in);
	   String response = myScanner.nextLine();
	   System.out.println(response);
	   myScanner.close();
	
    }
   
}
