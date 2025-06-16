public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World \n"); //pehla code~
        
        //String methods:
        
        String birthDate = "16/05/2005";
        int startingIndex = birthDate.indexOf("2005");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("birth year = " + birthDate.substring(startingIndex));
        System.out.println("month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/")
                .concat("1982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
        
        System.out.println();
        // String Formatting:
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);
        
        int age = 20;
        int birthYear = 2025 - age;
        System.out.printf("age = %d and birth year = %d%n", age, birthYear);
        System.out.printf("Your age is %.2f%n", (float) age);
        
        for(int i = 1; i <= 100000; i *= 10) {
        	System.out.printf("printing %6d %n",i);
        }
        System.out.printf("Char: %c, Int: %d, Float: %.2f%n", 'A', 10, 3.14);

        
/*
        boolean isCat = true;
        if (isCat == true) {
            System.out.println("it's not a Cat");
            System.out.println("it's a dog");
        }
*/
/*
    String makeOfCar = "Audi";
    boolean isDomesticCar = makeOfCar != "Audi" ? false : true;
    if(isDomesticCar)
        System.out.println("Domestic car");


    int ageOfClient = 20;
    String ageText = ageOfClient <= 18 ? "over eighteen" : "a kid";
    System.out.println("our client is "+ ageText);
*/
/*
 	// ternary basic	
	    double firstVar = 20.00d;
	    double secondVar = 80.00d;
	    double sum = ((firstVar + secondVar) * 100.00d );
	        System.out.println("sum is: " + sum);
	    double remainder = sum % 40.00d;
	        System.out.println("remainder is: " + remainder);
	    boolean output = (remainder == 0) ? true : false;
	        System.out.println("output = " + output);
	    if(!output){
	        System.out.println("got some remainder");
	    } */
        
       
    }// main
}
//class StringsMethod {
//	
//}