package choice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Choice {

	public static void askChoice(String... questions) {
		for (int i = 0; i < questions.length; i++) {
			System.out.println((i + 1) + ") " + questions[i]);
		}
	}

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

	public static int askAndMakeChoice(String... questions) {
		askChoice(questions);
		return makeChoice(1, questions.length);
	}

	public static int getIntAnswer() {
		boolean isAccepted = true;
		int number = 0;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				number = Integer.parseInt(sc.next());
				isAccepted = true;
			} catch (Exception e) {
				isAccepted = false;
				System.out.println("Please enter a valid whole number");
			}
		} while (!isAccepted);
		
		return number;
	}
}
