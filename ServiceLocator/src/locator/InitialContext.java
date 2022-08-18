package locator;

public class InitialContext {
	public Object lookup(String jname) {
		if (jname.equalsIgnoreCase("EmployeeService")) {
			System.out.println("Looking up and creating a new Employee Service");
return new EmployeeService();
		}
		else if(jname.equalsIgnoreCase("CustomerService"))
		{
			System.out.println("Looking up and creating a new Customer Service");
			return new CustomerService();
		}
		return null;
	}
}
