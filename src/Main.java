public class Main {
	public static void main(String[] args) {

		// Customer challenge
		Customer customer = new Customer("inte", 100000, "intewastaken@gmail.com");
		System.out.println(customer.getName());
		System.out.println(customer.getCreditLimit());
		System.out.println(customer.getEmail());
		System.out.println("-----------------------------------------------------------------");
		Customer secondCustomer = new Customer();
		System.out.println(secondCustomer.getName());
		System.out.println(secondCustomer.getCreditLimit());
		System.out.println(secondCustomer.getEmail());
		System.out.println("-----------------------------------------------------------------");

		// Bank account challenge - constructors and it's overloading
		Account inteAccount = new Account("123456789", 1000000, "inte kun", "inte@gmail.com", "9876543210");
		System.out.println(inteAccount.getCustomerName() + "'s account details:");
		System.out.println("Account Number: " + inteAccount.getaccNumber());
		System.out.println("Balance: ₹" + inteAccount.getBalance());
		System.out.println("Email: " + inteAccount.getEmail());
		System.out.println("Phone Number: " + inteAccount.getPhNo());
		System.out.println("-----------------------------------------------------------------");

//    	Account inteAccount = new Account();
		inteAccount.depositFunds(500000);
		inteAccount.withdrawFunds(2000000);
		inteAccount.withdrawFunds(67500);
		System.out.println("-----------------------------------------------------------------");
// //basic examples of objects fields getters and setters_____________________________________________
//    	Car car = new Car();
//    	Car car2 = new Car();
///*    	
// They can't be set directly. We can only use the getters. 
// Getters are used to access private variables and setters are used to set private variables.    	
//    	car.make = "BMW";
//    	car.model = "X5";
//    	car.colour = "Black";
//    	car.doors = 4;
//    	car.convertible = false;
//*/
//    	// Using setters to set private variables
//    	car.setMake("Bugatti");
//    	car.setModel("Veyron");
//    	car.setColour("White");
//    	car.setDoors(2);
//    	car.setConvertible(true);
//    	
//    	car2.setMake("Bugatti");
//    	car2.setModel("Chiron");
//    	car2.setColour("Black");
//    	car2.setDoors(2);
//    	car2.setConvertible(false);
//    	
//    	
//    	System.out.println("make: " + car.getMake());
//    	System.out.println("model: " + car.getModel());
//    	// getModel() and getMake() are used to access private variables
//    	
//    	car.describeCar(); 
//    	car2.describeCar();
//   

	}// main function
}// class