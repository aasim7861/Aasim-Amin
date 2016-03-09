/**
 * Simple example of a class which reads lines from a file and outputs each to
 * the console.
 * 
 * @author Mark Dixon
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {
/**
* @param args
* @throws FileNotFoundException
* when the file cannot be loaded
*/

	public static void main(String[] args) throws FileNotFoundException {

	//Declaring variables

	int validcount = 0;
	int invalidcount = 0;
	int homescoreNum = 0;
	int awayscoreNum = 0;
	int totalscore = 0;
	int score = 0;

		ArrayList<Integer> finaltotal = new ArrayList<Integer>();

		Scanner s = new Scanner(new File("results1.txt")); // Create a scanner which scans from a file

		String line; // Stores each line of text which reads from the file

		while (s.hasNext()) {

		line = s.nextLine(); // Reads the next line of text from the file
		String[] elements = line.split(":");

		
		if (elements.length == 4) 
		{
			
			 try {
				    homescoreNum = Integer.parseInt(elements[2].trim());
				    awayscoreNum = Integer.parseInt(elements[3].trim());
				    
				    totalscore = homescoreNum + awayscoreNum;

					finaltotal.add(totalscore);
					validcount++;
					System.out.println(elements[0].trim() + " " + "[" + elements[2].trim() + "]" + " " + "|" + "" + " "+ elements[1].trim() + " " +"[" +  elements[3].trim() + "]");
				}
					catch(NumberFormatException nFE) {
				    invalidcount++;
				   
				}
			 		
				
		}
		else
		{
			invalidcount++;
		}
}
		// End of while loop

		for (int i = 0; i < finaltotal.size(); i++){
		score += finaltotal.get(i);
	}

		System.out.println("Valid Match Count was " + validcount++  + " total goals scored were " + ""  + score + ".");
		System.out.println("Invalid Match Count was " + invalidcount++);

		//Output and End Of File message
		System.out.println("\nEOF"); 
	}
}
