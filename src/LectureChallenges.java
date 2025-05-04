import java.security.PublicKey;

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
        
        //nato char
        char nato = 'O';
    	switch (nato) {
    	case 'A':
    		System.out.println("ABLE");
    		break;
    	case 'B':
    		System.out.println("BAKER");
    		break;
    	case 'c':
    		System.out.println("CHARLY");
    		break;
    	case 'D':
    		System.out.println("DOG");
    		break;
    	case 'E':
    		System.out.println("EASY");
    		break;
    	default:
    		System.out.println("not found");
    	}
    	
    	//interest calci
    	for(float rate = 7.5f; rate < 10.25f; rate++) {
    		System.out.println("\u20b9100 at " + rate +" % interest is: \u20b9" + interestCalci(100, rate));
    		rate = rate - 0.75f;
    	}
    	
    	//prime no.
    	System.out.println("1 is " + (isPrime(1) ? "" : " not ") + "a prime number");
    	System.out.println("2 is " + (isPrime(2) ? "" : " not ") + "a prime number");
    	System.out.println("3 is " + (isPrime(3) ? "" : " not ") + "a prime number");
    	System.out.println("4 is " + (isPrime(4) ? "" : " not ") + "a prime number");
    	System.out.println("13 is " + (isPrime(13) ? "" : " not ") + "a prime number");
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
    
    //interestcalci
    public static float interestCalci(float amount, float interestRate) {
    	return (amount * (interestRate / 100));
    }
	
    //prime check
    public static boolean isPrime(int num) {
    	if(num <=2 ) {
    		return (num == 2);
    	}
    	for(int div = 2; div <= num/2; div++) {
    		if(num % div == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
