package week01.ws.service;

import javax.jws.WebService;


// full name vermemiz gereklidir..
@WebService(endpointInterface = "week01.ws.service.HelloMyService")
public class HelloMyServiceImpl implements HelloMyService {

	@Override
	public String getWelcomeMessage(String name, String surname) {
		
		return "Welcome : " +name + " " +surname;
	}

}


// service implemantation Bean (SIB)