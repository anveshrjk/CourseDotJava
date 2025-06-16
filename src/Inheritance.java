public class Inheritance {
// inheritance codes and notes will be here:
	
	// inheritance: animal example
	public static void doAnimalStuff(Animal animal, String speed) {
		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println("_ _ _ _");
	}
	public static void main(String[] args) {
/*		
 * 		dog class:
		Animal animal = new Animal("Generic Animal", "huge", 400);
		doAnimalStuff(animal, "slow");

		Dog dog = new Dog();
		doAnimalStuff(dog, "fast");

		Dog yorkie = new Dog("Yorkie", 15);
		doAnimalStuff(yorkie, "fast");
		Dog retriever = new Dog("labrador retriever", 50, "floppy", "swimmer");
		doAnimalStuff(retriever, "slow");
		
		Dog wolf = new Dog("wolf", 40);
		doAnimalStuff(wolf, "slow");
			
		// inheritance
		Fish goldie = new Fish("goldfish", 0.25, 2, 3);
		doAnimalStuff(goldie, "fast");				
 		*/
		
		Employee inte = new Employee("inte", "16/05/2005", "07/08/2024");
		System.out.println(inte);		
		System.out.println("age = " + inte.getAge());
		System.out.println("pay = " + inte.collectPay());
		
		SalariedEmployee joey = new SalariedEmployee("joey", "01/02/2006", "04/09/2003", 10000);
		System.out.println(joey);
		System.out.println("age = " + joey.getAge());
		System.out.println("pay = " + joey.collectPay());
        joey.retire();
        System.out.println("Joe's Pension check = $" + joey.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
		
		
	}// main
}

// challenge lec.93
class Worker {
	
	private String name, birthDate;
	protected String endDate;
	
	public Worker() {}

	public Worker(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public int getAge() {
		int currentYear = 2025;
		int birthYear = Integer.parseInt(birthDate.substring(6));
		return (currentYear - birthYear);
	}
	 
	public double collectPay() {
		return 0.0;
	}
	
	public void terminate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}
	
	 
}

class Employee extends Worker {
	
	private long employeeId;
	private String hireDate;
	
	private static int employeeNo = 1;
	
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

	public Employee(String name, String birthDate, long employeeId, String hireDate) {
		super(name, birthDate);
		this.employeeId = employeeId;
		this.hireDate = hireDate;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", hireDate=" + hireDate + "], " + super.toString()
				+ "]";
	}
}

class SalariedEmployee extends Employee{
	
	private double annualSalary;
	private boolean isRetired;
	
	
	
	public SalariedEmployee(String name, String birthDate, String hireDate,
			double annualSalary) {
		super(name, birthDate, hireDate);
		this.annualSalary = annualSalary;
	}
	
	@Override
	public double collectPay() {
		double paycheck = annualSalary/26;
		double adjustedPay = isRetired ? 0.9 * paycheck : paycheck; 
		return (int) adjustedPay;
	}

	public void retire() {
		terminate("12/12/2025");
		isRetired = true;
	}
}	

class HourlyEmployee extends Employee{
	
	private double hourlyPayRate;

	public HourlyEmployee(String name, String birthDate, String hireDate,
			double hourlyPayRate) {
		super(name, birthDate, hireDate);
		this.hourlyPayRate = hourlyPayRate;
	}
	
	@Override
	public double collectPay() {
		return 40 * hourlyPayRate;
	}
	
	public double getDoublePay() {
		return  2 * collectPay();
	}
}
	
//--------------------------------------------------------------------------------------------------------------------------

//fish class
class Fish extends Animal {
	private int fins, gills;

	public Fish(String type, double weight, int fins, int gills) {
		super(type, "small", weight);
		this.fins = fins;
		this.gills = gills;
	}
	private void moveMuscles() {
		System.out.println("muscles moving");
	}
	private void moveBackFins() {
		System.out.println("back fin moving");
	}
	
	@Override
	public void move(String speed) {
		super.move(speed);
		moveMuscles();
		if(speed == "fast") {
			moveBackFins();
		}
		System.out.println();
	}
	@Override
	public String toString() {
		return "Fish [fins=" + fins + ", gills=" + gills + "]";
	}
}

//basic animal class
class Animal {

	protected String type;
	private String size;
	private double weight;

	public Animal() {
	}

	public Animal(String type, String size, double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal{" + "type='" + type + '\'' + ", size='" + size + '\'' + ", weight=" + weight + '}';
	}

	public void move(String speed) {
		System.out.println(type + " moves " + speed);
	}

	public void makeNoise() {
		System.out.println(type + " makes some kind of noise");
	}
}

/*
class Dog extends Animal {
	private String earShape, tailShape;

	public Dog() {
		super("Mutt", "big", 50);
	}

	public Dog(String type, double weight) {
		this(type, weight, "perky", "curled");
	}

	public Dog(String type, double weight, String earShape, String tailShape) {
		super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	@Override
	public String toString() {
		return "Dog{" + "earShape='" + earShape + '\'' + ", tailShape='" + tailShape + '\'' + "} " + super.toString();
	}

	public void makeNoise() {
		if(type == "wolf") {
			System.err.println("ow wooo!");
		}
		bark();
		System.err.println();
	}

	@Override
	public void move(String speed) {
		super.move(speed);
//		System.out.println("dog walk, run and wag their tail");
		
		if(speed == "slow") {
			walk();
			wagTail();
		}else {
			run();
			bark();
		}
		System.err.println();
	}
	public void bark() {
		System.out.println("woof");
	}
	public void run() {
		System.err.println("dog running");
	}
	public void walk() {
		System.err.println("dog walking");
	}
	public void wagTail() {
		System.err.println("tail wagging");
	}
}
*/	
