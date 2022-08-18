package locator;

public class CustomerService implements Service {

	@Override
	public String getServiceName() {
		// TODO Auto-generated method stub
		return "Customer Service";
	}

	@Override
	public void execute() {
		System.out.println("Executing Customer Service");
		
	}

}
