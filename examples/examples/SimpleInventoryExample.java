package examples;

import choice.Choice;
import inventory.Inventory;
import inventory.Item;

public class SimpleInventoryExample {

	static Item rock = new Item("Rock");
	
	public static void main(String[] args) {
		Inventory playerInv = new Inventory();
		System.out.println("You are in a jungle, you have nothing in your inventory. Do you wish to pick up a rock?");
		switch(Choice.askAndMakeChoice("Yes", "No")) {
		case 1:
			playerInv.addItem(rock);
			System.out.println("You picked up the rock!");
			break;
		case 2:
			System.out.println("You did not pick up the rock");
			break;
		}
		///Doesnt work yet
		System.out.println("You have " + playerInv.getItem(rock).getName() + playerInv.getItem(rock).getAmount());
		switch(Choice.askAndMakeChoice("Yes", "No")) {
		case 1:
			playerInv.addItem(new Item("Rock"));
			System.out.println("You picked up the rock!");
			break;
		case 2:
			System.out.println("You did not pick up the rock");
			break;
		}
		System.out.println("You have " + playerInv.getItem(rock).getName() + playerInv.getItem(rock).getAmount());
	}
}
