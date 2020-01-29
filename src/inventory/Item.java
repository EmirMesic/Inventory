package inventory;

/**
 * 
 * Klasa za item objekte
 *  
 *  */

public class Item {	
	
	/* Polja Item klase */
	
	private static int counterId;
	
	private int id;
	private String name;
	private double quantity;
	private double price;
		
	public Item(String name, double quantity, double price) {
		this.id = counterId++;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item id: " + id + ", name: " + name + ", quantity: " + quantity + ", price: " + price ;
	}
	
	

}
