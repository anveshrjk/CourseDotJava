public class Exercise {//exercise code will be saved here
	public static void main(String[]args) {//will call the methods exercise-wise~
		
		// *TOKEN* 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
		// *TOKEN-anveshrjk* 
		
		//Exercise 1 
		checkNumber(-4);
		
		//Exercise 2 
		printAns(15.38);
        printAns(-5.653);
        printAns(10548.944569);
        
        //Exercise 3
        printKBtoMB(2048);
        printMBtoKB(2);

	}
//Exercise 1 -----------------------------------------------------------------------------------------------------
	public static void checkNumber(int number){
        System.out.println((number>0)  ? "positive\n" : ((number<0) ? "negative\n" : "zero\n"));
    }

//Exercise 2 -----------------------------------------------------------------------------------------------------
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
        }        
    }
    
//Exercise 3 -----------------------------------------------------------------------------------------------------
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
    	System.out.println(megaBytes + " MB = " + kb + " KB");\
    	// lol
    }
    
// Exercise 4 -----------------------------------------------------------------------------------------------    
}
