package examples;

import choice.Choice;

public class ChoiceExample {
	public static void main(String[] args) {
		System.out.println("You see an apple, what do you want to do?");
		switch(Choice.askAndMakeChoice("Pick it up", "Kick it", "Punch it in the groin")) {
		case 1:
			System.out.println("You picked up the apple");
			break;
		case 2:
			System.out.println("You kicked the apple, it fell down the stairs");
		case 3:
			System.out.println("You punched it in the groin. Sadly, apples have no groin, therefore it had no effect");
		}
	}
}
