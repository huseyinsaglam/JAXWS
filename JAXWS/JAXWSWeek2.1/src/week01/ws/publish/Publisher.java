package week01.ws.publish;

import javax.xml.ws.Endpoint;

import week01.ws.service.HelloMyServiceImpl;

public class Publisher {

	private static String adress="http://localhost:8888/week1/hello.service";
	public static void main(String[] args) {
		String adress="http://localhost:8888/week1/hello.service";
		Endpoint.publish(adress, new HelloMyServiceImpl());
		
		System.out.println("Web service running hs saglam..");

	}

}
