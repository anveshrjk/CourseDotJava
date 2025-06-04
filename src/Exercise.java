public class Exercise {// exercise code will be saved here

	/*
	 * useful c & p System.out.println(
	 * "-------------------------------------------------------------------");
	 * TOKEN* - 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
	 */
	public static void main(String[] args) {// will call the methods exercise-wise~

		// Exercise 1
		checkNumber(0);
		checkNumber(38);
		checkNumber(-38);
		System.out.println("-----------------------------------------------------------------");

		// Exercise 2
		printAns(15.38);
		printAns(10548.944569);
		printAns(-5.653);

		// Exercise 3
		printKBtoMB(2048);
		printMBtoKB(2);
		
		// Exercise 4
		System.out.println(shouldWakeUp(true, 1));
		System.out.println(shouldWakeUp(false, 0));
		

		// Exercise 5
		System.out.println(isLeapYear(2005));
		System.out.println(isLeapYear(2020));
		System.out.println("------------------------------------------------------------------");

		// Exercise 6
		System.out.println(areEqualByThreeDecimalPlaces(3.145, 3.1458));
		System.out.println(areEqualByThreeDecimalPlaces(3.145, 3.1478));
		System.out.println("--------------------------------------------------------------------");

		// Exercise 7
		System.out.println(hasEqualSum(1, 2, 3));
		System.out.println(hasEqualSum(3, 2, 1));
		System.out.println("---------------------------------------------------------------------");

		// Exercise 8
		System.out.println(hasTeen(1, 19, 40));
		System.out.println(hasTeen(12, 7, 6));
		System.out.println("----------------------------------------------------------------------");

		// Exercise 9
		System.out.println(area(7.35633));
		System.out.println(area(7.837345, 14.3543));
		System.out.println("-----------------------------------------------------------------------");

		// Exercise 10
		printYearsAndDays(10518984);
		printYearsAndDays(9993035);
		System.out.println("-------------------------------------------------------------------");

		// Exercise 11
		printEqual(7, -1, 5);
		printEqual(1, 1, 1);
		printEqual(2, 2, 7);
		printEqual(7, 8, 9);
		System.out.println("-------------------------------------------------------------------");

		// Exercise 12
		System.out.println(isCatPlaying(true, 38));
		System.out.println(isCatPlaying(false, 45));
		System.out.println("-------------------------------------------------------------------");

		// Exercise 13
		printNumberInWord(7);
		printNumberInWord(0);
		System.out.println("------------------------------------------------------------------");

		// Exercise 14
		System.out.println("2004 is" + (isLeapAYear(2004) ? "" : " not") + " a leap year");
		System.out.println(getDaysInMonth(2, 2004));
		System.out.println("2005 is" + (isLeapAYear(2005) ? "" : " not") + " a leap year");
		System.out.println(getDaysInMonth(2, 2005));
		System.out.println("-------------------------------------------------------------------");

		// Exercise 15
		System.out.println(sumOdd(-7, 34));
		System.out.println(sumOdd(3, 300));
		System.out.println("------------------------------------------------------------------");

		// Exercise 16
		System.out.println(isPalindrome(123));
		System.out.println(isPalindrome(12321));
		System.out.println("------------------------------------------------------------------");

		// Exercise 17
		System.out.println(sumFirstLast(1029));
		System.out.println("------------------------------------------------------------------");

		// Exercise 18
		System.out.println(hasSharedDigit(16, 61));
		System.out.println(hasSharedDigit(70, 16));
		System.out.println("------------------------------------------------------------------");

		// Exercise 19
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println("------------------------------------------------------------------");

		// Exercise 20
		printFactors(28);
		printFactors(12);
		System.out.println("------------------------------------------------------------------");
		
		// Exercise 21
		System.out.println(getGreatestCommonDivisor(12, 30));
		System.out.println(getGreatestCommonDivisor(25, 15));
		System.out.println("------------------------------------------------------------------");
		
		// Exercise 22
		System.out.println("Is 6 a perfect number? " + isPerfectNumber(6));
		System.out.println("Is 28 a perfect number? " + isPerfectNumber(28));
		System.out.println("------------------------------------------------------------------");
		
		// Exercise 23
		System.out.println("Number 6 in words:");
		numberToWords(6);
		System.out.println("Number 123 in words:");
		numberToWords(123);
		System.out.println("Number 1010 in words:");
		numberToWords(1010);
		System.out.println("------------------------------------------------------------------");
		
		// Exercise 24
		System.out.println("Reversed number of 12345 is: " + reverse(12345));
		System.out.println("Reversed number of 100 is: " + reverse(100));
		System.out.println("------------------------------------------------------------------");
		
		// Exercise 25
		System.out.println("Can pack 2 big bags, 3 small bags to make 13kg? " + canPack(2, 3, 13));
		System.out.println("Can pack 2 big bags, 3 small bags to make 20kg? " + canPack(3, 2, 20));
		
		System.out.println("------------------------------------------------------------------");
		// Exercise 26
		System.out.println("Largest prime factor of 13195 is: " + getLargestPrime(13195));
		System.out.println("Largest prime factor of 600851475143 is: " + getLargestPrime(600851475));
		System.out.println("------------------------------------------------------------------");
		
		// Exercise 27
		printDiagonalStar(9);
		System.out.println("------------------------------------------------------------------");
	}

// Exercise codes here:
	// Exercise

	// Exercise 27 Constructing A Diagonal Star Pattern With Loops
	// Prints a square pattern with diagonals and borders using '*'
	public static void printDiagonalStar(int number) {

		if (number < 5) { // If number is less than 5, pattern can't be made
			System.out.println("Invalid Value");
		} else {
			// int rowCount = 1;
			for (int row = 1; row <= number; row++) {// loop for row
				int rowCount = number;
				for (int column = 1; column <= number; column++) {// loop for column
					// Print '*' for borders and diagonals, else print space
					if (row == 1 || row == number) {// first or last row
						System.out.print("* ");
					} else if (column == 1) {// remaining rows
						System.out.print("* ");
					} else if (column == row) {// main diagonal
						System.out.print("* ");
					} else if (column == rowCount - row + 1) {// anti-diagonal
						System.out.print("* ");
					} else if (column == number) {// last column
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				rowCount--;
				System.out.println("");
			}
		}
	}

	// Exercise 26 Identifying The Largest Prime Factor Of A Number
	// Finds the largest prime factor of a number
	public static int getLargestPrime(int number) {
		if (number <= 0) { // Negative or zero is invalid
			return -1;
		}
		int factor = -1;
		for (int i = 2; i <= number; i++) { // Try dividing by every number from 2 up
			if (number % i != 0) {
				continue; // Skip if not a factor
			}
			factor = i; // Store the factor
			while (number % i == 0) { // Remove all occurrences of this factor
				number /= i;
			}
		}
		return number == 1 ? factor : number; // Return the largest prime factor
	}

	// Exercise 25 Managing Flour Pack Requirements With Limited Bucket Sizes
	// Checks if you can pack a goal weight using big (5kg) and small (1kg) bags
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount < 0 || smallCount < 0 || goal < 0) { // Negative values are invalid
			return false;
		} else {
			int bigBag = 5;
			int totalBigWeight = bigBag * bigCount;
			if (goal <= totalBigWeight) { // If big bags alone can cover the goal
				int remainingWt = goal % bigBag; // What's left after using big bags
				return remainingWt <= smallCount; // Can small bags cover the rest?
			} else {
				int currentWt = goal - totalBigWeight; // Not enough big bags, use all
				return currentWt <= smallCount; // Can small bags cover the rest?
			}
		}
	}

	// Exercise 24 Converting Digits Into Words And Handling Edge Cases
	// Reverses the digits of a number (e.g., 123 -> 321)
	public static int reverse(int number) {

		int reverse = 0;
		while (number != 0) { // Loop until all digits are processed
			// multiply by 10 then and add last digit (number % 10)
			reverse = reverse * 10 + number % 10; // Add last digit to reverse
			number /= 10; // discard last digit
		}
		return reverse;
	}

	// Returns the number of digits in a number
	public static int getDigitCount(int number) {

		if (number < 0) {
			return -1; // Negative numbers are invalid
		}

		if (number == 0) {
			return 1; // Zero has 1 digit
		}

		int count = 0;
		// start from 1 and multiply by 10 each step so i goes 1, 10, 100, 1000
		// count how many times it was multiplied, and that's the digit count
		for (int i = 1; i <= number; i *= 10) { // Multiply i by 10 each time
			count++; // Count how many times we can divide by 10
		}
		return count;
	}

	// Prints each digit of a number in words (e.g., 123 -> One Two Three)
	public static void numberToWords(int number) {

		if (number < 0) {
			System.out.println("Invalid Value");
			return;
		}

		// get reversed number
		int reverse = reverse(number); // Reverse the number to print in correct order

		// subtract numberDigits and reverseDigits to get leading zeroes
		int leadingZeroes = getDigitCount(number) - getDigitCount(reverse); // Count leading zeroes

		if (number == 0) {
			System.out.println("Zero");
			return;
		}

		// use loop to print words
		while (reverse != 0) { // Print each digit as a word
			int lastDigit = reverse % 10;
			switch (lastDigit) {
			case 0 -> System.out.println("Zero");
			case 1 -> System.out.println("One");
			case 2 -> System.out.println("Two");
			case 3 -> System.out.println("Three");
			case 4 -> System.out.println("Four");
			case 5 -> System.out.println("Five");
			case 6 -> System.out.println("Six");
			case 7 -> System.out.println("Seven");
			case 8 -> System.out.println("Eight");
			case 9 -> System.out.println("Nine");
			}
			reverse /= 10;
		}

		// print zeroes if there are any leading zeroes in reversed number
		for (int i = 0; i < leadingZeroes; i++) { // Print any leading zeroes
			System.out.println("Zero");
		}
	}

	// Exercise 23 Confirming Perfect Numbers Through Sum Of Proper Divisors
	// Checks if a number is perfect (sum of divisors equals the number)
	public static boolean isPerfectNumber(int number) {
		if (number < 1) {
			return false; // Negative or zero can't be perfect
		}
		int sum = 0;
		for (int i = 1; i <= number; i++) { // Loop through all numbers up to number
			if (number % i == 0) { // If i is a divisor
				sum += i;
			}
		}
		sum -= number; // Exclude the number itself
		return sum == number;
	}

	// Exercise 22 Deriving The Greatest Common Divisor (GCD) Efficiently
	// Finds the greatest common divisor (GCD) of two numbers
	public static int getGreatestCommonDivisor(int first, int second) {
		if (first < 10 || second < 10) { // Both numbers must be >= 10
			return -1;
		} else {
			int gcd = 0;
			if (first > second) {
				for (int i = 1; i <= second; i++) { // Try all numbers up to second
					if ((first % i == 0) && (second % i == 0)) {
						gcd = i; // Update gcd if i divides both
					}
				}
			} else {
				for (int j = 1; j <= second; j++) { // Try all numbers up to second
					if ((first % j == 0) && (second % j == 0)) {
						gcd = j;
					}
				}
			}
			return gcd;
		}
	}

	// Exercise 21 Listing All Factors Of A Given Number
	// Prints all factors of a number
	public static void printFactors(int number) {
		if (number < 1) {
			System.out.println("Invalid Value");
		} else {
			for (int i = 1; i <= number; i++) { // Loop from 1 to number
				if (number % i == 0) { // If i is a factor
					System.out.print(i + " ");
				}
			}
		}
	}

	// Exercise 20 Evaluating The Last Digit For Multiple Integer Comparisons
	// Checks if any two of three numbers have the same last digit
	public static boolean hasSameLastDigit(int first, int second, int third) {
		boolean condition = isValid(first) && isValid(second) && isValid(third); // All must be in range
		if (condition) {
			int firstL = first % 10;
			int secondL = second % 10;
			int thirdL = third % 10;
			return ((firstL == secondL) || (firstL == thirdL) || (secondL == thirdL));
		}
		return false;
	}

	// Checks if a number is between 10 and 1000
	public static boolean isValid(int number) {
		return (number > 9 && number < 1001);
	}

	// Exercise 19 Checking For A Shared Digit Between Two Numbers
	// Checks if two numbers share any digit
	public static boolean hasSharedDigit(int first, int second) {
		if ((first < 10 || first > 99) || (second < 10 || second > 99)) {
			return false; // Both must be two-digit numbers
		} else {
			int firstLeft = first / 10;
			int firstRight = first % 10;
			int secondLeft = second / 10;
			int secondRight = second % 10;

			// Compare all digit combinations
			if ((firstLeft == secondLeft) || (firstLeft == secondRight) || (firstRight == secondLeft)
					|| (firstRight == secondRight)) {
				return true;
			}
			return false;
		}
	}

	// Exercise 18 Calculating The Sum Of All Even Digits In An Integer
	// Sums all even digits in a number
	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1; // Negative is invalid
		} else {
			int sum = 0;
			while (number > 0) { // Loop through all digits
				int digit = number % 10;
				if (digit % 2 == 0) { // If digit is even
					sum += digit;
				}
				number /= 10;
			}
			return sum;
		}
	}

	// Exercise 17 Summing The First And Last Digits Of An Integer
	// Sums the first and last digit of a number
	public static int sumFirstLast(int number) {
		if (number < 0) {
			return -1;
		}
		int last = number % 10; // Get last digit
		while (number >= 10) { // Loop to get first digit
			number /= 10;
		}
		return number + last;
	}

	// Exercise 16 Identifying Palindromeic Numbers For Enhanced Numeric Validation
	// Checks if a number is a palindrome (reads same forwards and backwards)
	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int original = number;
		while (original != 0) { // Reverse the number
			reverse = reverse * 10 + original % 10;
			original /= 10;
		}
		return number == reverse;
	}

	// Exercise 15 Summing Odd Numbers In A Specified Range
	// Checks if a number is odd
	public static boolean isOdd(int number) {

		if (number < 0) {
			return false;
		}
		return number % 2 != 0;
	}

	// Sums all odd numbers in a range
	public static int sumOdd(int start, int end) {

		if (start <= end) {
			if (start > 0 && end > 0) {
				int sum = 0;
				for (int i = start; i <= end; i++) { // Loop through range
					if (isOdd(i)) { // If number is odd
						sum = sum + i;
					}
				}
				return sum;
				// for loop finds the odd number within the range and adds them
			} else {
				return -1;
			}
		}
		return -1;
	}

	// Exercise 14 Computing Month Length With Leap Year Consideration
	// Checks if a year is a leap year
	public static boolean isLeapAYear(int year) {
		if (year > 0 && year < 10000) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					return year % 400 == 0; // Divisible by 400 is leap
				}
				return true; // Divisible by 4 but not 100 is leap
			}
			return false;
		} else {
			return false;
		}
	}

	// Returns number of days in a month, considering leap years
	public static int getDaysInMonth(int month, int year) {

		if (year < 1 || year > 9999) {
			return -1;
		}
		return switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31; // Months with 31 days
		case 2 -> isLeapYear(year) ? 29 : 28; // February, check leap year
		case 4, 6, 9, 11 -> 30; // Months with 30 days
		default -> -1; // Invalid month
		};
	}

	// Exercise 13 Determining Word Representation Of Numbers Accurately
	// Prints the word for a number 0-9, else prints "OTHER"
	public static void printNumberInWord(int number) {

		String numberInWord;
		switch (number) {
		case 0 -> numberInWord = "ZERO";
		case 1 -> numberInWord = "ONE";
		case 2 -> numberInWord = "TWO";
		case 3 -> numberInWord = "THREE";
		case 4 -> numberInWord = "FOUR";
		case 5 -> numberInWord = "FIVE";
		case 6 -> numberInWord = "SIX";
		case 7 -> numberInWord = "SEVEN";
		case 8 -> numberInWord = "EIGHT";
		case 9 -> numberInWord = "NINE";
		default -> numberInWord = "OTHER";
		}
		System.out.println(numberInWord);
	}

	// Exercise 12 Designing A 'Playing Cat' Logic Program To Refine Conditional
	// Implementation
	// Checks if a cat is playing based on temperature and season
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if (!summer) {
			return temperature >= 25 && temperature <= 35; // Not summer: 25-35
		} else {
			return temperature >= 25 && temperature <= 45; // Summer: 25-45
		}
	}

	// Exercise 11 Crafting An Equality Printer To Explore Multiple Conditional
	// Checks In Java
	// Prints a message based on equality of three numbers
	public static void printEqual(int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0) {
			System.out.println("Invalid Value");
		} else if (a == b && a == c) {
			System.out.println("All numbers are equal");
		} else if ((a == b) || (a == c) || b == c) {
			System.out.println("Neither all are equal or different");
		} else {
			System.out.println("All numbers are different");
		}
	}

	// Exercise 10 Implementing A Minutes-To-Years-And-Days Calculator For Advanced
	// Time Conversions
	// Converts minutes to years and days, then prints result
	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else {
			long years = minutes / 525600; // 1 year = 525600 minutes
			long remainingDays = (minutes % 525600) / 1440; // 1 day = 1440 minutes
			System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");

		}
	}

	// Exercise 9 Constructing A Comprehensive Area Calculator For Circles And
	// Rectangles In Java
	// Calculates area of a circle
	public static double area(double radius) {
		if (radius < 0.0) {
			return -1.0;
		}
		return Math.PI * radius * radius;
	}

	// Calculates area of a rectangle
	public static double area(double x, double y) {
		if (x < 0 || y < 0) {

			return -1.0;
		}
		return x * y;
	}

	// Exercise 8 Devising A Teen Number Checker For Mastery Of Conditional Range
	// Checking
	// Checks if any of three ages is a teen (13-19)
	public static boolean hasTeen(int age1, int age2, int age3) {

		return isTeen(age1) || isTeen(age2) || isTeen(age3);
	}

	// Checks if an age is a teen
	public static boolean isTeen(int age) {

		return age > 12 && age < 20;
	}

	// Exercise 7 Creating An Equal Sum Checker For Strengthening Arithmetic And
	// Comparison Operations
	// Checks if sum of first two numbers equals third
	public static boolean hasEqualSum(int a, int b, int c) {
		return a + b == c;
	}

	// Exercise 6 Building A Decimal Comparator To Practice Floating-Point
	// Comparisons In Java
	// Compares two doubles up to three decimal places
	public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

		long firstRounded = (long) (a * 1000);
		long secondRounded = (long) (b * 1000);
		return firstRounded == secondRounded;
	}

	// Exercise 5 Implementing A Precise Leap Year Calculator To Enhance Conditional
	// Reasoning
	// Checks if a year is a leap year
	public static boolean isLeapYear(int year) {

		if (year < 1 || year > 9999) {

			return false;
		}
		if (year % 4 == 0) {

			if (year % 100 != 0) {

				return true;
			} else {
				return year % 400 == 0;
			}
		}
		return false;
	}

	// Exercise 4 Developing A 'Barking Dog' Program For Boolean Logic Familiarity
	// Checks if a dog should wake up its owner based on barking and time
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

		if (hourOfDay < 0 || hourOfDay > 23) {

			return false;
		}

		return barking && (hourOfDay < 8 || hourOfDay > 22);
	}

	// Exercise 3 Accurate MegaBytes Converter For Mastering Integer Math In Java
	// Converts kilobytes to megabytes and prints result
	public static void printKBtoMB(int kiloBytes) {

		if (kiloBytes < 0) {

			System.out.println("Invalid Value");
			return;
		}

		int mb = kiloBytes / 1024;
		int remainingKB = kiloBytes % 1024;

		System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainingKB + " KB");
	}

	// Converts megabytes to kilobytes and prints result
	public static void printMBtoKB(float megaBytes) {

		if (megaBytes < 0) {
			System.out.println("Invalid Value");
		}

		float kb = megaBytes * 1024F;
		System.out.println(megaBytes + " MB = " + kb + " KB");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
	}

	// Exercise 2 Implementing A Speed Converter To Practice Basic Java Arithmetic
	// And Output
	// Converts KMPH to MPH (rounded)
	public static long toMPH(double KMPH) {

		long MPH;
		if (KMPH > 0) {
			MPH = Math.round(KMPH / 1.609);
			return MPH;
		}
		return -1;

	}

	// Prints the conversion from KMPH to MPH
	public static void printAns(double KMPH) {

		if (KMPH > 0) {
			System.out.println(KMPH + " KMPH = " + toMPH(KMPH) + " MPH");
		} else {
			System.out.println(KMPH + " is an Invalid Value");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------");
		}
	}

	// Exercise 1 Comprehensive 'Positive, Negative, Or Zero' Assessment In Java
	// Prints if a number is positive, negative, or zero
	public static void checkNumber(int number) {

		System.out.println((number > 0) ? "positive" : ((number < 0) ? "negative" : "zero"));
	}
}// class closed
