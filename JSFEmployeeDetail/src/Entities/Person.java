package Entities;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
@SessionScoped
public class Person {

	public Person() {


	}
	@PostConstruct
	public void setlist()
	{
		Employee emp=new Employee();
		emp.setName("Charles");
		emp.setSurname("Dickens");
		emp.setPosition("Developer");
		emp.setAge(25);
		
		list.add(emp);
		emp.setName("Bernard");
		emp.setSurname("Lewis");
		emp.setPosition("Manager");
		emp.setAge(56);
		
		list.add(emp);
	}
	
	private Employee employee;
	private List<Employee> list;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public List<Employee> getList() {
		return list;
	}
	public void setList(List<Employee> list) {
		this.list = list;
	}
}
