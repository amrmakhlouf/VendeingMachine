package VendingMachine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

vendingmachine V = null;

V.displayproducts();

String selectedProduct = scanner.nextLine();
int selectproductnum =Integer.parseInt(selectedProduct);
V.selectproduct(selectproductnum);

String userEnteredCoins = scanner.nextLine();
int[] enteredCoins = {}; // the covertion will be in implementation
V.entercoins(enteredCoins);

V.displayonscreen();
	}

}
