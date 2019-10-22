import java.util.Scanner;

public class LearnAboutSomeone {
	public static void main(String[] args) {

		// give proper responses according to user-submitted info
		// account for invalid user input w/ exceptions
		// try to incorporate IndexOutOfBoundsException and IllegalArgumentException

		// extended challenge - create other exceptions and catch those too

		System.out.println("Welcome to our Java class!");

		Scanner scan = new Scanner(System.in);
		String userChoice = "";
		String cont = "";
		String userChoiceFact = "";
		String userLearnMore = "";
		// provide info about students in a class of at least 10
		// user parallel arrays to hold the student data
		String[] studentNames = { "Katie", "Sean", "Hank", "Nancy", "Doug", "Blair", "Hailey", "Scott", "Pam",
				"Lindsay" };
		String[] studentFood = { "pasta", "nachos", "mexican", "thai", "chicken wings", "cake", "seafood",
				"mashed potatoes", "shrimp", "pizza" };
		String[] studentColors = { "red", "orange", "blue", "purple", "green", "yellow", "pink", "anchor blue",
				"light orange", "mustard yellow" };

		System.out.println("Would you like to learn about students in our class? (y/n)");
		userLearnMore = scan.next();

		while (userLearnMore.equalsIgnoreCase("y") || userLearnMore.equalsIgnoreCase("yes")) {
			// prompt user to ask about a particular student
			System.out.println("What student would you like to learn more about?");

			int num = Validator.getInt(scan, "Enter a number between 1 and 10: ", 1, 10);
			num = num - 1;
			System.out.println("You will be learning more about: " + studentNames[num]);

			System.out.println("Would you like to learn more about " + studentNames[num] + "? (y/n)");
			userLearnMore = scan.nextLine();
			if (userLearnMore.equalsIgnoreCase("n") || userLearnMore.equalsIgnoreCase("no")) {
				break;
			}

			do {
				userChoiceFact = Validator.getString(scan, "Enter favorite food or favorite color.");
				// make it easy for user - tell them what info is available

			if (userChoiceFact.equalsIgnoreCase("favorite food")) {
				String selectFood = studentFood[num];
				System.out.println(studentNames[num] + "'s favorite food is " + selectFood + ".");
			}
			else if (userChoiceFact.equalsIgnoreCase("favorite color")) {
				String selectColor = studentColors[num];
				System.out.println(studentNames[num] + "'s favorite color is " + selectColor + ".");
			} else {
					System.out.println("Invalid entry."); // FIX ME
			}
			} while (!userChoiceFact.equalsIgnoreCase("favorite food")
					|| !userChoiceFact.equalsIgnoreCase("favorite color"));

			// ask if user would like to learn about another student - loop!
			System.out.println("Would you like to learn about another student? (y/n)");
			cont = scan.next();

			if (cont.equalsIgnoreCase("n") || cont.equalsIgnoreCase("no")) {
				break;
			}

		}

		System.out.println("Have a great day!");
		scan.close();

	}

}
