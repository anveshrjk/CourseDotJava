
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
		return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + "]";
	}
	
	public void move(String speed) {
		System.out.println(type + " moves " + speed);
	}
	
	public void makeNoise() {
		System.out.println(type + " makes some king of noise");
	}
}

class Dog extends Animal {
	public Dog() {
		super();
	}
}
