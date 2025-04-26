
public class ConverterChallenges {

	public static void main(String[] args) {
		System.out.println(convertToCentimeters(72) + " cm");
		System.out.println(convertToCentimeters(5, 11) + " cm");
	}
	public static double convertToCentimeters(int inches) {//converts from inches to cm
		return inches * 2.54;
	};
	public static double convertToCentimeters(int feet, int inches) {//from feet'in to cm
		return convertToCentimeters((feet * 12) + inches);
	};
}
