package client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import model.Employee;
import ws.service.EmployeeService;

public class ClientTest01 {

	public static void main(String[] args) throws MalformedURLException {

		System.out.println("ClientTest01#main");
		//
		String address = "http://localhost:8080/JAXWSWeek1Tomcat/employeeServiceWS";
		URL url = new URL(address);
		QName qname = new QName("http://service.ws/", "EmployeeServiceImplService");
		Service service = Service.create(url, qname);

		EmployeeService employeeService = service.getPort(EmployeeService.class);
		Employee employee1 = new Employee(1, "muslum", "oncel", 5000);
		Employee employee2 = new Employee(2, "gorkem", "okur", 5000);

		//
		employeeService.addEmployee(employee1);
		employeeService.addEmployee(employee2);

		//
		Employee emp = employeeService.getEmployee(1);

		System.out.println(emp);
		
		
		
		
		//
		
		
		
//		Employee[] empArray = employeeService.getEmployeesWithArray();
//		Arrays.stream(empArray).forEach(System.out::println);
		
		
	}
}
