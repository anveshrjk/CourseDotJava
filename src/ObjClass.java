public class ObjClass extends Object {

	public static void main(String[] args) {
		
		Student inte = new Student("inte", 20);
		System.out.println(inte.toString());
		System.out.println(inte);            //prints the same as above
		
		ChotaStudent chota = new ChotaStudent("chota", 10, "cnte");
		System.out.println(chota);
	}
}

class ChotaStudent extends Student {
	private String parentName;

	public ChotaStudent(String name, int age, String parentName) {
		super(name, age);
		this.parentName = parentName;
	}

	@Override
	public String toString() {
		return parentName + "'s kid," + super.toString();
	}
	
}

class Student {
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " is " + age;
//		return "Student [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

//	@Override
//	public String toString() {
//		return "Student [toString()=" + super.toString() + "]";
//	}
}