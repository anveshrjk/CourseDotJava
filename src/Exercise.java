public class Exercise {//exercise code will be saved here

/*	
    useful c & p
    System.out.println("-------------------------------------------------------------------");
	*TOKEN* - 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
*/
    public static void main(String []args) {// will call the methods exercise-wise~

        //Exercise 1
        checkNumber(0);
        checkNumber(38);
        checkNumber(-38);
        System.out.println("-----------------------------------------------------------------");

        //Exercise 2
        printAns(15.38);
        printAns(10548.944569);
        printAns(-5.653);

        //Exercise 3
        printKBtoMB(2048);
        printMBtoKB(2);

        //Exercise 4
        shouldWakeUp(false, 0);

        //Exercise 5
        System.out.println(isLeapYear(2005));
        System.out.println(isLeapYear(2020));
        System.out.println("------------------------------------------------------------------");

        //Exercise 6
        System.out.println(areEqualByThreeDecimalPlaces(3.145, 3.1458));
        System.out.println(areEqualByThreeDecimalPlaces(3.145, 3.1478));
        System.out.println("--------------------------------------------------------------------");

        //Exercise 7
        System.out.println(hasEqualSum(1, 2, 3));
        System.out.println(hasEqualSum(3, 2, 1));
        System.out.println("---------------------------------------------------------------------");

        //Exercise 8
        System.out.println(hasTeen(1, 19, 40));
        System.out.println(hasTeen(12, 7, 6));
        System.out.println("----------------------------------------------------------------------");

        //Exercise 9
        System.out.println(area(7.35633));
        System.out.println(area(7.837345, 14.3543));
        System.out.println("-----------------------------------------------------------------------");

        //Exercise 10
        printYearsAndDays(10518984);
        printYearsAndDays(9993035);
        System.out.println("-------------------------------------------------------------------");

        //Exercise 11
        printEqual(7, -1, 5);
        printEqual(1, 1, 1);
        printEqual(2, 2, 7);
        printEqual(7, 8, 9);
        System.out.println("-------------------------------------------------------------------");

        //Exercise 12
        System.out.println(isCatPlaying(true, 38));
        System.out.println(isCatPlaying(false, 45));
        System.out.println("-------------------------------------------------------------------");
        
        //Exercise 13
        printNumberInWord(7);
        System.out.println("------------------------------------------------------------------");

        //Exercise 14
        System.out.println("2004 is" + (isLeapAYear(2004) ? "" : " not") + " a leap year");
        System.out.println(getDaysInMonth(2, 2004));
        System.out.println("2005 is" + (isLeapAYear(2005) ? "" : " not") + " a leap year");
        System.out.println(getDaysInMonth(2, 2005));
        System.out.println("-------------------------------------------------------------------");

        //Exercise 15
        System.out.println(sumOdd(-7, 34));
        System.out.println(sumOdd(3, 300));
        System.out.println("------------------------------------------------------------------");
        
        //Exercise 16
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(12321));
        System.out.println("------------------------------------------------------------------");
        
        //Exercise 17
        System.out.println(sumFirstLast(1029));
        System.out.println("------------------------------------------------------------------");
        
        //Exercise 18
        System.out.println(hasSharedDigit(16,61));
        System.out.println(hasSharedDigit(70,16));
        System.out.println("------------------------------------------------------------------");
        
        //Exercise 19
        System.out.println("------------------------------------------------------------------");
        
        //Exercise 20
        System.out.println("------------------------------------------------------------------");
        //Exercise 21
        System.out.println("------------------------------------------------------------------");
        //Exercise 22
        System.out.println("------------------------------------------------------------------");
        //Exercise 23
        System.out.println("------------------------------------------------------------------");
        //Exercise 24
        System.out.println("------------------------------------------------------------------");
        //Exercise 25
        System.out.println("------------------------------------------------------------------");
        //Exercise 26
        System.out.println("------------------------------------------------------------------");
        //Exercise 27
        System.out.println("------------------------------------------------------------------");
    }
	
// Exercise codes here:
//Exercise -----------------------------------------
    
    //Exercise 20 Evaluating The Last Digit For Multiple Integer Comparisons-------------------------
    
    
	//Exercise 19 Checking For A Shared Digit Between Two Numbers------------------------------------
    public static boolean hasSharedDigit(int first, int second){
        if((first < 10 || first > 99) || (second < 10 || second > 99)){
            return false;
        }
        else{
            int firstLeft = first / 10;
            int  firstRight = first % 10;
            int secondLeft = second / 10;
            int secondRight = second % 10;
            
            if((firstLeft == secondLeft)||(firstLeft == secondRight)||
                (firstRight == secondLeft)||(firstRight == secondRight)){
                    return true;
                }
                return false;
        }    
    }
    
	//Exercise 18 Calculating The Sum Of All Even Digits In An Integer-------------------------------
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        else{
            int sum = 0;
            while(number > 0){
                int digit = number % 10;
                if(digit % 2 == 0){
                    sum += digit;
                }
                number /= 10;
            }
            return sum;
        }
    }    
    
	//Exercise 17 Summing The First And Last Digits Of An Integer-----------------------------------
	public static int sumFirstLast(int number){
	    if(number < 0){
	        return -1;
	    }
	    int last = number % 10;
	    while(number >= 10){
	        number /= 10;
	    }
	    return number + last;
	}    
    
	//Exercise 16 Identifying Palindromeic Numbers For Enhanced Numeric Validation ------------------
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int original = number;
        while(original != 0){
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return number == reverse;
    }    
    
	//Exercise 15 ----------------------------------------------------------------------------------
    public static boolean isOdd(int number){
        
        if(number < 0){
            return false;
        }
        return number % 2 != 0;
    }
    public static int sumOdd(int start, int end){
        
        if(start <= end){
            if(start > 0 && end > 0){
                int sum = 0;
                for(int i = start; i <= end; i++){
                    if(isOdd(i) == true){
                        sum = sum + i;
                    }
                }
                return sum;
                // for loop finds the odd number within the range and adds them
            }
            else{
                return -1;
            }
        }
        return -1;
    }    
    
	//Exercise 14 ----------------------------------------------------------------------------------
    public static boolean isLeapAYear(int year) {
        if (year > 0 && year < 10000) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if (year < 1 || year > 9999){
            return -1;
        }
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            // for any of the following months, return 31

            case 2 -> isLeapYear(year) ? 29 : 28;
            // if it's February, determine if it's a leap year first, then return either 28 or 29.

            case 4, 6, 9, 11 -> 30;
            // return 30 for the following months

            default -> -1;
            // return -1 if the month parameter is not between 1 and 12.
        };
    }    
    
	//Exercise 13 ----------------------------------------------------------------------------------
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
    
	//Exercise 12 ----------------------------------------------------------------------------------
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer) {
            return temperature >= 25 && temperature <= 35;
        } else {
            return temperature >= 25 && temperature <= 45;
        }
    }    
    
	//Exercise 11 ----------------------------------------------------------------------------------
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
    
	//Exercise 10 ----------------------------------------------------------------------------------
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long remainingDays = (minutes % 525600) / 1440;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");

        }
    }    
    
	//Exercise 9 -------------------------------------------------------------------------------------
    public static double area(double radius) {
        if (radius < 0.0) {
            return -1.0;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {

            return -1.0;
        }
        return x * y;
    }    
    
    //Exercise 8 -------------------------------------------------------------------------------------
    public static boolean hasTeen(int age1, int age2, int age3) {

        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }

    public static boolean isTeen(int age) {

        return age > 12 && age < 20;
    }    
    
    //Exercise 7 --------------------------------------------------------------------------------------

    public static boolean hasEqualSum(int a, int b, int c) {
        return a + b == c;
    }    
    
    //Exercise 6 ---------------------------------------------------------------------------------------

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        long firstRounded = (long) (a * 1000);
        long secondRounded = (long) (b * 1000);
        return firstRounded == secondRounded;
    }    
    
    // Exercise 5 -------------------------------------------------------------------------------------

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
    
    // Exercise 4 --------------------------------------------------------------------------------------

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {

            return false;
        }

        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }    

    //Exercise 3 ----------------------------------------------------------------------------------------
    public static void printKBtoMB(int kiloBytes) {

        if (kiloBytes < 0) {

            System.out.println("Invalid Value");
            return;
        }

        int mb = kiloBytes / 1024;
        int remainingKB = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainingKB + " KB");
    }

    public static void printMBtoKB(float megaBytes) {

        if (megaBytes < 0) {
            System.out.println("Invalid Value");
        }

        float kb = megaBytes * 1024F;
        System.out.println(megaBytes + " MB = " + kb + " KB");
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }    
    
    //Exercise 2 ---------------------------------------------------------------------------------------
    public static long toMPH(double KMPH) {

        long MPH;
        if (KMPH > 0) {
            MPH = Math.round(KMPH / 1.609);
            return MPH;
        }
        return -1;

    }

    public static void printAns(double KMPH) {

        if (KMPH > 0) {
            System.out.println(KMPH + " KMPH = " + toMPH(KMPH) + " MPH");
        } else {
            System.out.println(KMPH + " is an Invalid Value");
            System.out.println("-----------------------------------------------------------------------------------------------------");
        }
    }
    
    //Exercise 1 ---------------------------------------------------------------------------------------
    public static void checkNumber(int number) {

        System.out.println((number > 0) ? "positive" : ((number < 0) ? "negative" : "zero"));
    }    
}//class closed
