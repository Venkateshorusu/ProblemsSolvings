package MultiTreading;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	List<Product> soldProductList = new CopyOnWriteArrayList<>();
	List<Product> purchaseProductList = new ArrayList<>();

	public  void populateSoldProducts() {
		for (int i = 0; i < 100; i++) {
			Product prod = new Product(i, "test_product_" + i);
			soldProductList.add(prod);
			System.err.println("ADDED: " + prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}

	public void displaySoldProducts() {
		for (Product product : soldProductList) {
			System.err.println("Printing the sold: " + product);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
