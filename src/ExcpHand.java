import java.util.Scanner;

public class ExcpHand {
	public static void main(String []args) {
		
		// a local variable
		int currentYear = 2025;
		
		//try and catch
		try {
		System.out.println(inputFromConsole(currentYear));
		} catch (NullPointerException e) {
			System.out.println(inputFromScanner(currentYear));
		}
	}
	public static String inputFromConsole(int currentYear){

		String name = System.console().readLine("hi, what's your name? ");
		System.out.println("hi " + name + ", nice to meet you!");

		String DoB = System.console().readLine("What year were you born? ");
		int age = currentYear - Integer.parseInt(DoB);

		return "oh, so you are " + age + " year old";
	}
	
	public static String inputFromScanner(int currentYear) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("hi, what's your name?");
		String name = scanner.nextLine();
		System.out.println("hi " + name + ", nice to meet you!");
		
		System.out.println("What year were you born? ");
		
		boolean validDob = false;
		int age = 0;
		
		do {
			System.out.println("enter a year of birth >= " +
					(currentYear - 125) + " and <= " + currentYear);
			try {
				//if we entered a valid dob or not
				age = checkData(currentYear, scanner.nextLine());
				validDob = age < 0 ? false : true;
			} catch(NumberFormatException badUserData) {
				System.out.println("characters not allowed! try again.");
			}
		}while(!validDob);
		
		scanner.close();
		return "So you are " + age + " year old";
		
	}
	public static int checkData(int currentYear, String dateOfBirth) {
		
		int dob = Integer.parseInt(dateOfBirth);
		int minYear = currentYear - 125;
		
		if(dob < minYear || dob > currentYear) {
			return -1;
		}
		return currentYear - dob;
	}
}