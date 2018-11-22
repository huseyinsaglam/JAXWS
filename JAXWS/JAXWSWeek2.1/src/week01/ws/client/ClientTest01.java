package week01.ws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import week01.ws.service.HelloMyService;

public class ClientTest01 {

	public static void main(String[] args) throws MalformedURLException {
		
		String adress="http://localhost:8082/week1/hello.service";
		
		//property ekledigimizde soap mesajlarini trace edebilirz.
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		
		
		URL url = new URL(adress);
		
		QName qName = new QName("http://service.ws.week01/", "HelloMyServiceImplService");
		
		//  // Gerekli bilgiler verilip servis oluþturuluyor..
		Service service = Service.create(url, qName);
		
		
		
		//
		
		
		HelloMyService hello = service.getPort(HelloMyService.class);
		String message =hello.getWelcomeMessage("huseyin", "saglam");
		System.out.println(message);

	}

}
