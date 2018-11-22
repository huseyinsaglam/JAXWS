package data;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductData {

	public static List<Product> products = new ArrayList<Product>();
	
	static {
		//
		Product product1 = new Product(1, "SAMSUNG G610", 1.2999);
		Product product2 = new Product(2, "ASUS X550VX", 3.4999);
		Product product3 = new Product(3, "HP15-BS017NT", 1.598);
		//
		products.add(product1);
		products.add(product2);
		products.add(product3);
	}
	
}
