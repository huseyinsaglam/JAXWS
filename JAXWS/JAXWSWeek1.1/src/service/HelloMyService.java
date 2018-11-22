package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
//varsayilan olarak DOCUMENT tir.
public interface HelloMyService {

	@WebMethod
	public String getWelcomeMessage(@WebParam(name = "userName")String name , @WebParam(name = "userSurname") String surname);
}


// Service Endpoint Interface (SEI)
