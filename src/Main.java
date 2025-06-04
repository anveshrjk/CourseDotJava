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
// POJO class example:
		for (int i = 1; i <= 5; i++) {
			LPAStudent student = new LPAStudent("S1000" + i, switch (i) {
			case 1 -> " inte";
			case 2 -> " aarnav";
			case 3 -> " amrit";
			case 4 -> " rudr";
			case 5 -> " amrita";
			default -> " Anonymus";
			}, " 16/05/2005", " JavaMasterclass");
			System.out.println(student);

			Student pojoStudent = new Student("S2000", "Ram", "30/05/2005", "Java Masterclass");
			LPAStudent recordStudent = new LPAStudent("S2001", "Harsh", "12/09/2005", "Java Masterclass");

			System.out.println(pojoStudent);
			System.out.println(recordStudent);

			System.out.println(pojoStudent.getName() + " is taking class.");
//			System.out.println(recordStudent.getName() +  " is taking class."); it wont run cuz record dont support/identify getters and setters prefix
			System.out.println(recordStudent.name() + " is taking class.");
			System.out.println("-----------------------------------------------------------------");

			// Exercise 32 Wall Area Computation
			Wall wall1 = new Wall();
			wall1.setWidth(5);
			wall1.setHeight(4);
			System.out.println("Wall Area: " + wall1.getArea() + " square units");
			Wall wall2 = new Wall(3, 6);
			System.out.println("Wall Area: " + wall2.getArea() + " square units");
			Wall wall3 = new Wall(-2, -3); // Negative values should be set to 0
			System.out.println("Wall Area: " + wall3.getArea() + " square units");
			System.out.println("-----------------------------------------------------------------");

			// Exercise 33 Point Class and Distance Calculation
			Point point1 = new Point(3, 5);
			Point point2 = new Point(5, 9);
			System.out.println("Distance from origin: " + point1.distance());
			System.out.println("Distance from another point: " + point1.distance(point2));
			System.out.println("Distance from coordinates (0,0): " + point1.distance(0, 0));
			System.out.println("-----------------------------------------------------------------");

			//Exercise 34 Floor carpet cost
			Floor floor = new Floor(5, 4);
			Carpet carpet = new Carpet(10);
			Calculator calculator = new Calculator(floor, carpet);
			System.out.println("Total cost of carpeting: ₹" + calculator.getTotalCost());
			System.out.println("-----------------------------------------------------------------");
		}
		// Exercise 35 Complex Number Operations
		ComplexNumber complex1 = new ComplexNumber(2, 3);
		ComplexNumber complex2 = new ComplexNumber(4, 5);
		System.out.println("Complex Number 1: " + complex1.getReal() + " + " + complex1.getImaginary() + "i");
		System.out.println("Complex Number 2: " + complex2.getReal() + " + " + complex2.getImaginary() + "i");
		complex1.add(complex2);
		System.out.println("After addition: " + complex1.getReal() + " + " + complex1.getImaginary() + "i");
		complex1.subtract(1, 1);
		System.out.println("After subtraction: " + complex1.getReal() + " + " + complex1.getImaginary() + "i");
		System.out.println("-----------------------------------------------------------------");
		
		//inheritance
		Animal animal = new Animal("Generic Animal", "huge", 400);
		doAnimalStuff(animal, "slow");
		
		Dog dog = new Dog();
		doAnimalStuff(animal, "fast");
		
	}// main function
	
	//inheritance: animal example
	public static void doAnimalStuff(Animal animal, String speed) {
		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println("_ _ _ _");
	}
	
}// main class

// Exercise 35 Complex Number Operations 
class ComplexNumber {
    // write code here
    private double real, imaginary;
    
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public double getReal() {
        return real;
    }
    
    public double getImaginary() {
        return imaginary;
    }
   
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    
    public void add(ComplexNumber c) {
        add(c.real, c.imaginary);
    }   
    
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber c) {
        subtract(c.real, c.imaginary);
    }
}

//Exercise 34 Floor carpet cost
class Floor {
    // write code here
    private double width, length;
    
    public Floor(double width, double length) {
        if(width < 0){
            width = 0;
        }
        this.width = width;
        if(length < 0){
            length = 0;
        }
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
}
class Carpet {
    // write code here
    private double cost;
    
    public Carpet(double cost) {
        if(cost < 0) {
            cost = 0;
        }
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }
}
class Calculator {
    // write code here

    private Floor floor;
    private Carpet carpet;
    
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}

//Exercise 32 Wall Area Computation
class Wall {
	// Width and height of the wall, non-negative values
	private double width;
	private double height;

	// Initializes wall with width=0, height=0
	public Wall() {
	}

	// Initializes wall with given dimensions, validates through setters
	public Wall(double width, double height) {
		setWidth(width);
		setHeight(height);
	}

	// Returns wall width
	public double getWidth() {
		return width;
	}

	// Sets wall width, converts negative values to 0
	public void setWidth(double width) {
		if (width < 0) {
			width = 0;
		}
		this.width = width;
	}

	// Returns wall height
	public double getHeight() {
		return height;
	}

	// Sets wall height, converts negative values to 0
	public void setHeight(double height) {
		if (height < 0) {
			height = 0;
		}
		this.height = height;
	}

	// Calculates wall area (width * height)
	public double getArea() {
		return width * height;
	}
}

// Exercise 33 Point Class and Distance Calculation
class Point {
	// Coordinates in 2D space
	private int x, y;

	// Creates point at origin (0,0)
	public Point() {
	}

	// Creates point at specified coordinates
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Getter and setter for x coordinate
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	// Getter and setter for y coordinate
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Calculates distance from this point to origin (0,0)
	public double distance() {
		return distance(0, 0);
	}

	// Calculates distance between this point and another point
	public double distance(Point a) {
		return distance(a.x, a.y);
	}

	// Calculates distance between this point and given x,y coordinates
	// using the Pythagorean theorem: sqrt((x2-x1)² + (y2-y1)²)
	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}
}

//student POJO class for record and override basic
class Student {
    // Student's unique ID
    private String id;
    // Student's name
    private String name;
    // Student's date of birth
    private String dateOfBirth;
    // List of classes/courses the student is enrolled in
    private String classList;

    // Constructor to create a new student with all details
    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    // Returns a string with all student details
    @Override
    public String toString() {
        return "Student {id =" + id + ", name =" + name + ", dateOfBirth =" + dateOfBirth + ", classList =" + classList + "}";
    }

    // Get student ID
    public String getId() {
        return id;
    }

    // Get student name
    public String getName() {
        return name;
    }

    // Get student date of birth
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    // Get class list
    public String getClassList() {
        return classList;
    }

    // Set student ID
    public void setId(String id) {
        this.id = id;
    }

    // Set student name
    public void setName(String name) {
        this.name = name;
    }

    // Set student date of birth
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Set class list
    public void setClassList(String classList) {
        this.classList = classList;
    }
}
