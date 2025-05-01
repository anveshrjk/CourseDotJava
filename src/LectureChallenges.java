
public class LectureChallenges {

	public static void main(String[] args) {
		//to CM 
		System.out.println(convertToCentimeters(72) + " cm");
		System.out.println(convertToCentimeters(5, 11) + " cm");
		
		//to hours
		System.out.println(getDurationString(-3945));  // This is the first test case
        System.out.println(getDurationString(-65, 45));  // This is the second test case
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));		
	}
	//converts inches and feet to cm
	public static double convertToCentimeters(int inches) {//converts from inches to cm
		return inches * 2.54;
	};
	public static double convertToCentimeters(int feet, int inches) {//from feet'in to cm
		return convertToCentimeters((feet * 12) + inches);
	};
	//convert seconds and minutes into hours
	public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds
                    + "), must be a positive integer value";
        }

        int minutes = seconds / 60;
        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes
                    + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds
                    + "), must be between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
	
}
