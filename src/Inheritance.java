public class Inheritance {
// inheritance codes and notes will be here:
}

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
