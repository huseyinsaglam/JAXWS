package ws.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.jws.WebService;

import model.Employee;

@WebService(endpointInterface = "ws.service.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	public static List<Employee> employeeList = new ArrayList<Employee>();

	@Override
	public void addEmployee(Employee employee) {

		System.out.println("addEmployee is invoked!!");
		//
		employeeList.add(employee);
		System.out.println(employeeList);

	}

	@Override
	public Employee getEmployee(int id) {
		Predicate<Employee> predicate = e -> e.getId() == id;
		return employeeList.stream().filter(predicate).findAny().orElse(null);
	}

	
	
	
	
//	@Override
//	public Employee[] getEmployeesWithArray() {
//		return employeeList.toArray(new Employee[employeeList.size()]);
//	}

}
