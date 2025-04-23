public class FirstClass {
    public static void main(String[] args) {
        //System.out.println("Hello World");

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
    }

    }
}