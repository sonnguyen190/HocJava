package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Employee;
import com.service.EmployeeService;

@Controller // Controller là nơi tiếp nhận request(yêu cầu)
@RequestMapping("/main") // đường dẫn để đi vào các request bên trong
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainController {
	Employee emloyee = new Employee();
	@Autowired
	@Qualifier("employeeServiceImpl")
	private EmployeeService employeeService;
	
	

	
	@RequestMapping(value = {"employee/list"}, method = RequestMethod.GET)
 	@ResponseBody //trong mô hình MVC thì khi return nó sẽ hiểu là trả về view, muốn trả về data thì sử dụng @ResponseBody 
	public List<Employee> getAllEmployees()  {
		List<Employee> employees = employeeService.getAllEmployees();
		if (employees == null) {
			System.out.println("Empty.");
		}
		return employees;
	}
	@RequestMapping("employee/{ssn}")
	@ResponseBody
	public Employee findEmployeeByssn(@PathVariable("ssn") int ssn) {
		Employee employee = employeeService.findEmployeeBySSN(ssn);
		
		return employee;
	}
	@RequestMapping("employee/insert1")
	@ResponseBody
	public String addNewEmployee(@RequestParam("ssn") int ssn, @RequestParam("name") String name,
			@RequestParam("salary") double salary, @RequestParam("department") int department) {
		Employee employee = new Employee();
		employee.setSsn(ssn);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDepartment(department);
		boolean isInserted = employeeService.addNewEmployee(employee);
		if (isInserted) {
			System.out.println("Add New Employee Successfully.");
		}
		return "redirect:/main/employee/list";//dùng để gửi 1 request, chỉ áp dụng với request có method là GET
	}
	@PostMapping(value = {"employee/insert"})
	@ResponseBody
	public String addNewEmployee(@RequestBody Employee employee) {
		Employee newemployee = new Employee();
		newemployee.setSsn(employee.getSsn());
		newemployee.setName(employee.getName());
		newemployee.setSalary(employee.getSalary());
		newemployee.setDepartment(employee.getDepartment());
		boolean isInserted = employeeService.addNewEmployee(employee) ;
		if (isInserted) {
			System.out.println("Add New Employee Successfully.");
		}
		return "redirect:/main/employee/list";//dùng để gửi 1 request, chỉ áp dụng với request có method là GET
	}
	
	@PutMapping(value = {"employee/update/{ssn}"})
	@ResponseBody
	public String updateEmployee(@PathVariable("ssn") int ssn, @RequestParam("name") String name, @RequestParam("salary") double salary,
			@RequestParam("department") int department) {
		Employee employee = new Employee();
		employee.setSsn(ssn);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDepartment(department);
		boolean isUpdated = employeeService.updateEmployee(employee);
		if (isUpdated) {
			System.out.println("Update Employee Successfully.");
		}
		return "redirect:/main/employee/list";
	}
	@DeleteMapping(value = {"employee/delete/{ssn}"})
	@ResponseBody
	public String deleteEmployee(@PathVariable("ssn") int ssn) {
		boolean isDeleted = employeeService.deleteEmployee(ssn);
		if (isDeleted) {
			System.out.println("Delete Employee Successfully.");
		}
		return "redirect:/main/employee/list";
	}

}