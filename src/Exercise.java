public class Exercise {//exercise code will be saved here
	//useful c&p
	//System.out.println("-------------------------------------------------------------------");
	//System.out.println();
	
	public static void main(String[]args) {//will call the methods exercise-wise~
		
		// *TOKEN* - anveshrjk: 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
		
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
        System.out.println(areEqualByThreeDecimalPlaces(3.145,3.1458));
        System.out.println(areEqualByThreeDecimalPlaces(3.145,3.1478));
        System.out.println("--------------------------------------------------------------------");
       
        //Exercise 7
        System.out.println(hasEqualSum(1,2,3));
        System.out.println(hasEqualSum(3,2,1));
        System.out.println("---------------------------------------------------------------------");
        
        //Exercise 8
        System.out.println(hasTeen(1, 19, 40));
        System.out.println(hasTeen(12, 7, 6));
        System.out.println("----------------------------------------------------------------------");
        
        //Exercise 9
        System.out.println(area(7.35633));
        System.out.println(area(7.837345,14.3543));
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
	}
//Exercise 1 ---------------------------------------------------------------------------------------
	public static void checkNumber(int number){
		
        System.out.println((number>0)  ? "positive" : ((number<0) ? "negative" : "zero"));
    }

//Exercise 2 ---------------------------------------------------------------------------------------
	public static long toMPH(double KMPH){
		
        long MPH;
        if(KMPH>0){
            MPH = Math.round(KMPH/1.609);
            return MPH;
        }
        return -1;
        
    }
    public static void printAns(double KMPH){
    	
        if(KMPH>0){
            System.out.println(KMPH + " KMPH = " + toMPH(KMPH) + " MPH");
        }
        else{
        	System.out.println(KMPH + " is an Invalid Value");
        	System.out.println("-----------------------------------------------------------------------------------------------------");
        }        
    }
    
//Exercise 3 ----------------------------------------------------------------------------------------
    public static void printKBtoMB(int kiloBytes){
        
        if(kiloBytes<0){
        	
            System.out.println("Invalid Value");
            return;
        }
        
        int mb = kiloBytes / 1024;
        int remainingKB = kiloBytes % 1024;

		System.out.println(kiloBytes+" KB = " + mb + " MB and "+ remainingKB + " KB");   
    }
    public static void printMBtoKB(float megaBytes) {
    	
    	if(megaBytes<0) {
    		System.out.println("Invalid Value");
    	}
    	
    	float kb = megaBytes * 1024F;
    	System.out.println(megaBytes + " MB = " + kb + " KB");
    	System.out.println("-----------------------------------------------------------------------------------------------------");
    }
    
// Exercise 4 --------------------------------------------------------------------------------------

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
    	
        if(hourOfDay < 0 || hourOfDay > 23){
        	
            return false;
        }
        
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

// Exercise 5 -------------------------------------------------------------------------------------

    public static boolean isLeapYear(int year){
        
        if(year < 1 || year > 9999){
        	
            return false;           
        }         
        if(year % 4 == 0){
        	
            if(year % 100 != 0){
            	
                return true;                
            }   
            
            else{                
            	if(year % 400 == 0){
            		
                    return true;                    
                }   
            	
                else {
                	
                     return false;                     
                }
            }
        }         
        else{            
            return false;
        }
    }

//Exercise 6 ---------------------------------------------------------------------------------------

	public static boolean areEqualByThreeDecimalPlaces(double a, double b){
		
		long firstRounded = (long) (a * 1000);
		long secondRounded = (long) (b * 1000);
		return firstRounded == secondRounded;
	}
//Exercise 7 --------------------------------------------------------------------------------------
		
	public static boolean hasEqualSum(int a, int b, int c){
        if(a+b == c){
            
            return true;
        }
        return false;
    }
		
//Exercise 8 -------------------------------------------------------------------------------------
	public static boolean hasTeen(int age1, int age2, int age3){
        
			return isTeen(age1) || isTeen(age2) || isTeen(age3);
    	}
    	public static boolean isTeen(int age){
        
    		return age > 12 && age < 20;
    	}
//Exercise 9 -------------------------------------------------------------------------------------
    	
    	public static double area(double radius){
            if(radius < 0.0){
                return -1.0;
            }
            return Math.PI * radius * radius;
        }
        public static double area(double x, double y){
            if(x < 0 || y < 0){
                
                return -1.0;
            }
            return x * y;
        }
        
//Exercise 10 ----------------------------------------------------------------------------------
	
        public static void printYearsAndDays(long minutes){
            if(minutes < 0){
                System.out.println("Invalid Value");
            }
            else{
                long years = minutes / 525600;
                long remainingDays = (minutes % 525600) / 1440 ;
                System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
                
            }
        }
        
//Exercise 11 ----------------------------------------------------------------------------------
        
        public static void printEqual(int a, int b, int c){
            if (a<0 || b<0 || c<0){
                System.out.println("Invalid Value");
            }
            else if (a == b && a == c){
                System.out.println("All numbers are equal");
            }
            else if ((a == b ) || (a ==c ) || b == c){
                System.out.println("Neither all are equal or different");
            } 
            else{
                System.out.println("All numbers are different");
            }
        }
        
//Exercise 12 ----------------------------------------------------------------------------------
        
        
//Exercise 13 ----------------------------------------------------------------------------------
        
        
}//class closed
