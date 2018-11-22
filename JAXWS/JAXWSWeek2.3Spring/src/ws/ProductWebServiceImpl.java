package ws;

import javax.jws.WebService;

import model.Product;
import service.ProductDataService;

@WebService(endpointInterface = "ws.ProductWebService")
public class ProductWebServiceImpl implements ProductWebService {

	private ProductDataService productDataService;

	public void setProductDataService(ProductDataService productDataService) {
		this.productDataService = productDataService;
	}

	@Override
	public Product getProductById(int id) {
		Product product = productDataService.getProductById(id);
		return product;
	}

}
