public class Main {
    public static void main(String[] args) {
       
    	Car car = new Car();
    	Car car2 = new Car();
/*    	
 They can't be set directly. We can only use the getters. 
 Getters are used to access private variables and setters are used to set private variables.    	
    	car.make = "BMW";
    	car.model = "X5";
    	car.colour = "Black";
    	car.doors = 4;
    	car.convertible = false;
*/
    	// Using setters to set private variables
    	car.setMake("Bugatti");
    	car.setModel("Veyron");
    	car.setColour("White");
    	car.setDoors(2);
    	car.setConvertible(true);
    	
    	car2.setMake("Bugatti");
    	car2.setModel("Chiron");
    	car2.setColour("Black");
    	car2.setDoors(2);
    	car2.setConvertible(false);
    	
    	
    	System.out.println("make: " + car.getMake());
    	System.out.println("model: " + car.getModel());
    	// getModel() and getMake() are used to access private variables
    	
    	car.describeCar(); 
    	car2.describeCar();
    	
    }
}