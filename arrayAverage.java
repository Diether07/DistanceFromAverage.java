/*Allow a user to enter any number of double values up to 15. 
 * The user should enter 99999 to quit entering numbers. 
 * Display an error message if the user quits without entering any numbers; 
 * otherwise, display each entered value and its distance from the average.JAVA
 * */

import java.util.Scanner;
public class arrayAverage 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		double userInput;
		double[] arrayNums = new double[15]; 
		double sum = 0.0;
		double average = 0.0;
		int totalInput = 0;

		
		
		
		for (int sub = 0 ; sub < arrayNums.length; ++sub)
		{
			System.out.println("Enter any value or enter 99999 to end: ");
			userInput = scanner.nextDouble();
			arrayNums[sub] = userInput;
			if(arrayNums[0] == 99999)
			{
				System.out.println("No value found");
				break;
			}
			else if (arrayNums[sub] == 99999) {
				arrayNums[sub] = 0.0; // I turned 99999 to 0 so that in display i will not show the 99999 
				break;
			}
			else
			{
				++totalInput;
				sum += arrayNums[sub];
				average = sum/totalInput;
			}
			
		}
		
		System.out.println("You entered " + totalInput + " value/s and the average is " + average);
		//Display
		for (int sub = 0 ; sub < arrayNums.length; ++sub)
		{
			if (arrayNums[sub] == 0)
			{
				break;
			}
			System.out.println(arrayNums[sub] + " is away average of >> " + (arrayNums[sub] - average));
			
		}
	}

}
