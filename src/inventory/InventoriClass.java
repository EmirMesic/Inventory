package inventory;

import java.util.ArrayList;

public class InventoriClass {
	private ArrayList<Item> items;

	public InventoriClass() {
		items = new ArrayList<Item>();
	}

	public boolean createItem(String name, double quantity, double price) {
		if(quantity < 0)
			return false;
		else if(price < 0)
			return false;
		return items.add(new Item(name, quantity, price));
	}

	public Item getItem(int index) {
		if(index < 0 || index >= items.size())
			return null;
		return items.get(index);	
	}

	public void updateItem(int index, Item element) {
		if(index < 0 || index >= items.size())
			return;
		items.add(index, element);
	}

	public void deleteItem(int index) {
		if(index < 0 || index >= items.size())
			return;
		items.add(index, null);
	}
	
	public int getSize() {
		return items.size();
	}
}
