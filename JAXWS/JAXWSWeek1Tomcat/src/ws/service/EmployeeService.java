package ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import model.Employee;

@WebService
@SOAPBinding(style = Style.RPC)
public interface EmployeeService {

	@WebMethod
	public void addEmployee(@WebParam(name = "employee") Employee employee);
	
	@WebMethod
	public Employee getEmployee(@WebParam(name="id") int id);
	
	
	
	
	
	
//	@WebMethod
//	public Employee[] getEmployeesWithArray();

}
