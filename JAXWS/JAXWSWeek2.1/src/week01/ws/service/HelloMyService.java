package week01.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
// varsayýlan olarak dokumenttir..
public interface HelloMyService {
	
	@WebMethod
	public String getWelcomeMessage(String name,String surname);

	
// Service Enpoint Service (SEI)

}
