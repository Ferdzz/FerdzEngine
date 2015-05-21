package choice;

import java.util.Scanner;

public class Choice {

	/**
	 * Asks questions and waits for answer
	 * 
	 * @param questions
	 *            List of questions
	 * @return the index of the question
	 */
	public static int askAndMakeChoice(String... questions) {
		askChoice(questions);
		return makeChoice(1, questions.length);
	}

	/**
	 * Offers different options to the user in this form:<br />
	 * <br />
	 * 1) Option 1<br />
	 * 2) Option 2<br />
	 * 3) Option 3<br />
	 * 
	 * @param questions
	 *            List of questions
	 */
	public static void askChoice(String... questions) {
		for (int i = 0; i < questions.length; i++) {
			System.out.println((i + 1) + ") " + questions[i]);
		}
	}

	/**
	 * Waits for user's input
	 * 
	 * @param choices
	 *            List of valid choices
	 * @return User's input
	 */
	public static int makeChoice(int... choices) {
		System.out.print("Enter one of these numbers:");
		for (int i = 0; i < choices.length; i++) {
			System.out.print(" " + choices[i] + ")");
		}
		System.out.println();

		while (true) {
			int answer = getIntAnswer();
			for (int i = 0; i < choices.length; i++) {
				if (answer == choices[i]) {
					return answer;
				}
			}
			System.out.println("Invalid answer, enter a valid answer");
		}
	}

	/**
	 * Wait for user's input<br />
	 * Used for large number of choices
	 * 
	 * @param min
	 *            Minimal bound (inclusive [] )
	 * @param max
	 *            Maximal bound (inclusive [] )
	 * @return User's input
	 */
	public static int makeChoice(int min, int max) {
		System.out.println("Enter a number between " + min + " and " + max);

		while (true) {
			int answer = getIntAnswer();
			if (answer <= max && answer >= min) {
				return answer;
			}
			System.out.println("Invalid answer, enter a valid answer");
		}
	}

	/**
	 * Makes a choice between 1 and parameter
	 * 
	 * @param amountOfChoice
	 *            Maximal bound (inclusive)
	 * @return User's input
	 */
	public static int makeChoice(int amountOfChoice) {
		return makeChoice(1, amountOfChoice);
	}

	/**
	 * Waits for a correct int answer
	 * 
	 * @return Returns valid int answer
	 */
	public static int getIntAnswer() {
		boolean isAccepted = true;
		int number = 0;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				number = sc.nextInt();
				isAccepted = true;
			} catch (Exception e) {
				isAccepted = false;
				System.out.println("Please enter a valid whole number");
				sc.nextLine();
			}
		} while (!isAccepted);
		
		return number;
	}
}
