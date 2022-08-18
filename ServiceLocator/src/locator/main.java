package locator;

public class main {

	public static void main(String[] args) {
		
		Service service=ServiceLocator.getService("EmployeeService");
		service.execute();
		service=ServiceLocator.getService("CustomerService");
		service.execute();
		service=ServiceLocator.getService("EmployeeService");
		service.execute();
		service=ServiceLocator.getService("CustomerService");
		service.execute();
	}

}
