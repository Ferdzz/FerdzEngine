package inventory;

public class Item {
	private String name;
	private int amount;
	
	public Item(String name) {
		this.setName(name);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
