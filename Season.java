//**************************************************************
//Method: season
//This method takes as parameters two integers representing a
//month and day and returns a String indicating the season for
//that month and day
//Susan Driskill
//February 10, 2020
//Assignment 5: Page 314, Exercise 3
//**************************************************************

public class Season {

	public static void main(String[] args) {
		//Testing for the season method
		System.out.println(season(1, 1));
		System.out.println(season(3, 15));
		System.out.println(season(3, 16));
		System.out.println(season(6, 15));
		System.out.println(season(6, 16));
		System.out.println(season(9, 15));
		System.out.println(season(9, 16));
		System.out.println(season(12, 15));
		System.out.println(season(12, 16));
	}

	public static String season(int month, int day) {
		//Define a String variable for the output
		String season;
		//Start with the beginning of the year:
		//Winter: 1, 1 to 3, 15
		if (month < 3 || month == 3 && day <= 15) {
			season = "winter";
		//Spring: 3, 16 to 6, 15
		} else if (month == 3 && day >=16 || month <= 5 || month == 6 && day <=15) {
			season = "spring";
		//Summer: 6, 16 to 9, 15
		} else if (month == 6 && day >=16 || month <= 8 || month == 9 && day <=15) {
			season = "summer";
		//Fall: 9, 16 to 12, 15
		} else if (month == 9 && day >=16 || month <= 11 || month == 12 && day <=15) {
			season = "fall";
		//Finish the rest of the year:
		//12, 16 to 12, 31
		} else {
			season = "winter";
		}
	return season;
		
	}
	
}
