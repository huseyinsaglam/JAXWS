package publisher;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

import service.HelloMyServiceImpl;

@WebServlet("/cxf.webservice/*")
public class PublisherServlet extends CXFNonSpringServlet {

	@Override
	protected void loadBus(ServletConfig sc) {

		System.out.println("loadBus is invoked...");

		super.loadBus(sc);
		
		
		// 1. bu �ekilde publish ediyoruz..
		Bus bus = getBus();
		BusFactory.setDefaultBus(bus);
		Endpoint.publish("/hello.service", new HelloMyServiceImpl());
		
		
		
		// 2. bu �ekilde publish ediyoruz..
		ServerFactoryBean factory = new ServerFactoryBean();
		factory.setBus(bus);
		factory.setServiceBean( new HelloMyServiceImpl());
		factory.setAddress("/hello2.service");
		factory.create();

	}
}
