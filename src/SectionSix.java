import java.io.Closeable;
import java.util.Scanner;

public class SectionSix {
	public static void main(String[] args) {
		
		//switch-case
		int switchValue = 2;
		switch (switchValue) {
			case 1 -> System.out.println("value was 1");
			case 2 -> System.out.println("value was 2");
			case 3, 4, 5 -> {
				System.out.println("actually it was a " + switchValue);
			}
			default -> System.out.println("was not 1, 2, 3, 4 or 5");
		}

		//no. of days in a month
		String month = "March";
		System.out.println(month + " is in the " + getQuater(month) + " quater");

		//parsing of different datatype~
		int currentYear = 2025;
		String userDOB = "2005";
		int DOB = Integer.parseInt(userDOB);
		System.out.println("age = " + (currentYear - DOB));
		
		// 5 int sum
		addNum();
	}

	public static String getQuater(String month) {

		return switch (month) {
			case "January", "February", "March" -> "1st";
			case "April", "May", "June" -> "2nd";
			case "July", "August", "September" -> "3rd";
			case "October", "November", "December" -> "4th";
			default -> {
				yield "invalid";
			}
		};
	}
	
	//taking 5 valid integers as i/p and adding them
	public static void addNum() {
		Scanner scanner = new Scanner(System.in);
		int counter = 1;
		int sum = 0;
		
		while(counter <= 5) {
			System.out.println("Enter number #" + counter);
			String strNumber = scanner.nextLine();
			try {
				int num = Integer.parseInt(strNumber);
				counter++;
				sum += num;
			} catch(NumberFormatException nfe) {
				System.out.println("Invalid Number");
			}
		}
		scanner.close();
		System.out.println("The sum of 5 numbers is: " + sum);
	}
}//class close
