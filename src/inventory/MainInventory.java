package inventory;


import java.util.Scanner;

public class MainInventory {
	public static void main(String[] args) {
	
		System.out.println("1. Create new item \n2. See list of items \n3. Update item \n4. Delete item ");
		Scanner input = new Scanner(System.in);
		InventoriClass inventory = new InventoriClass();
		
		int menuChoice = input.nextInt();
		while(menuChoice!=0) {

			switch(menuChoice) {
			case 1:
				System.out.print("Input name: ");
				String name = input.next();
				System.out.print("Input quantity: ");
				double quantity = input.nextDouble();
				System.out.print("Input price: ");
				double price = input.nextDouble();
				inventory.createItem(name, quantity, price);
				break;
				
			case 2:
				for(int i = 0; i<inventory.getSize(); i++)
					System.out.println(inventory.getItem(i));
				break;
				
			case 3:
				for(int i = 0; i<inventory.getSize(); i++)
					System.out.println("Index " + i + " "+ inventory.getItem(i));
				System.out.print("Input item idex you want to update: ");
				int index = input.nextInt();
				System.out.println("1. Change name \n2.Change quantity \n3.Change price");
				int choice = input.nextInt();
				Item tempItem = inventory.getItem(index);
				switch(choice) {
				case 1:
					System.out.print("Input new item name: ");
					String newName = input.next();
					tempItem.setName(newName);
					break;
				case 2:
					System.out.print("Input new item quantity: ");
					double newQuantity = input.nextDouble();
					tempItem.setQuantity(newQuantity);
					break;
				case 3:
					System.out.print("Input new item price: ");
					double newPrice = input.nextDouble();
					tempItem.setPrice(newPrice);
					break;
				}
				break;
			case 4:
				break;
			}
			System.out.println("1. Create new item \n2. See list of items \n3. Update item \n4. Delete item ");
			menuChoice = input.nextInt();
		}
		
		
		
	}
}
