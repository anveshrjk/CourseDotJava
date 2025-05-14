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
		int DoB = scanner.nextInt();
		
		return "So you are " + (currentYear - DoB) + " year old";
	}

}
