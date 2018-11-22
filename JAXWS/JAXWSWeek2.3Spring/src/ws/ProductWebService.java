package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import model.Product;

@WebService
@SOAPBinding(style =Style.RPC)
public interface ProductWebService {

	@WebMethod
	public Product getProductById(@WebParam(name="id") int id);
}
