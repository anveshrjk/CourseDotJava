public class SectionSix {
	public static void main(String[]args) {
		
		//switch-case
		int switchValue = 5;
		switch(switchValue) {
		case 1 -> System.out.println("value was 1");
		case 2 -> System.out.println("value was 2");
		case 3, 4, 5 -> {
			System.out.println("actually it was a " + switchValue);
		}
		default -> System.out.println("was not 1, 2, 3, 4 or 5");
		}
		
		String month = "March";
		System.out.println(month + " is in the " + getQuater(month) + " quater");
	}
	public static String getQuater(String month) {
		
		return switch(month) {
		case "January", "February","March" -> "1st";
		case "April", "May", "June" -> "2nd";
		case "July", "August", "September" -> "3rd";
		case "October", "November", "December" -> "4th";
		default -> {
            yield "invalid";
		}
		};
	}
}
