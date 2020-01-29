package inventory;

import java.util.Scanner;

public class MainInventory {
	public static void main(String[] args) {
	
		System.out.println("Please choose: ");
		Scanner input = new Scanner(System.in);
		int menuChoice = input.nextInt();
		
		while(menuChoice!=0) {
			System.out.println("1. Create new item /n2. See list of items /n3. Update item /4. Delete item ");
			switch(menuChoice) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
		}
		
		
		
	}
}
