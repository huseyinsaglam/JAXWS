package service;

import data.ProductData;
import model.Product;

public class ProductDataServiceImpl implements ProductDataService {

	@Override
	public Product getProductById(int id) {
		Product product = ProductData.products.stream().filter(p -> p.getId() == id).findFirst()
				.orElse(new Product(0, "Not Found", 0));
		
		return product;
	}

}
