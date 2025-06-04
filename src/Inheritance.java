
public class Inheritance {
// inheritance codes and notes will be here:
}

//basic animal class
class Animal {
	
	private String type, size;
	private double weight;
	
	public Animal() {}
	
	public Animal(String type, String size, double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"type='" + type + '\'' +
				", size='" + size + '\'' +
				", weight=" + weight +
				'}';
	}

	public void move(String speed) {
		System.out.println(type + " moves " + speed);
	}
	
	public void makeNoise() {
		System.out.println(type + " makes some kind of noise");
	}
}

class Dog extends Animal {
	private String earShape, tailShape;

	public Dog() {
		super("Mutt", "big", 50);
	}

	public Dog(String type, double weight) {
		this(type,weight, "perky", "curled");
	}

	public Dog(String type, double weight, String earShape, String tailShape) {
		super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large" ), weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"earShape='" + earShape + '\'' +
				", tailShape='" + tailShape + '\'' +
				"} " + super.toString();
	}
}
