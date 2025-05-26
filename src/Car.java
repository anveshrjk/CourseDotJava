public class Car {
	private String make = "Bugatti";
	private String model = "Veyron";
	private String colour = "White";
	private int doors = 2;
	public boolean convertible = false;
	
	// Getters to access private variables
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getColour() {
		return colour;
	}
	public int getDoors() {
		return doors;
	}
	public boolean isConvertible() {
		return convertible;
	}
	
	// Setters to modify private variables
	public void setMake(String make) {
		if(make == null) make = "Unknown";
		String lowercaseMake = make.toLowerCase();
		switch (lowercaseMake) {
		case "bugatti", "ferrari", "lamborghini", "tesla" -> this.make = make;
		default -> this.make = "Unsupported make";
		}
	}	
	public void setModel(String model) {
		this.model = model;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}
	
	// Method to describe the car
	public void describeCar() {
		System.out.println(doors + "-doors " +
				colour + " " +
				make + " " +
				model + " " +
				(convertible ? "convertible" : ""));
	}
}
