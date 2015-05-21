package inventory;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<Item> inventory;
	
	public Inventory() {
		inventory = new ArrayList<Item>();
	}
	
	/**
	 * Adds an item to the inventory. If the item already exists, adds 1 to the amount
	 * @param item Item to add
	 */
	public void addItem(Item item) {
		if(inventory.contains(item)) {
			inventory.get(inventory.indexOf(item)).setAmount(inventory.get(inventory.indexOf(item)).getAmount() + 1);
		} else {
			inventory.add(item);
		}
	}
	
	public void removeItem(Item item) {
		inventory.remove(item);
	}
	
	public void removeItem(int index) {
		inventory.remove(index);
	}
	
	public Item getItem(Item item) {
		return inventory.get(inventory.indexOf(item));
	}
}
