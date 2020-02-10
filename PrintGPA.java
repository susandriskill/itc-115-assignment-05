//**************************************************************
//Method: printGPA
//This method accepts a Scanner for the console as a parameter
//and calculates a student's grade point average
//Susan Driskill
//February 10, 2020
//Assignment 5: Page 314, Exercise 10
//**************************************************************

//Import the Scanner
import java.util.*;

public class PrintGPA {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		printGPA(console);

	//To test printGPA method, enter the following for student
	//record:
	//Maria 5 72 91 84 89 78
	//The output should be: Maria's grade is 82.8
	//To test again:
	//Jordan 4 86 71 62 90
	//The output should be: Jordan's grade is 77.25
	}

	public static void printGPA(Scanner console) {
		
		//Use the console to obtain the student record
		System.out.println("Enter a student record: ");		
		
		//Use the console to get the student's name as a String
		String studentName = console.next();
		
		//Use the console to get the total number of scores
		int numOfScores = console.nextInt();

		//Define and instantiate a variable to hold the sum of
		//the scores
		int sumOfScores = 0;
		
		//Create a loop from the number of scores to add the
		//scores together, using the console to get the next 
		//score in the list
		for (int i = 1; i <= numOfScores; i++) {
			sumOfScores += console.nextInt();
		}
		
		//Cast to doubles for correct type of division
		//Divide the total sum of the scores by the total number 
		//of scores 
		double gpa = (double) sumOfScores / (double) numOfScores;
		System.out.println(studentName + "'s grade is " + gpa);
	}

}
