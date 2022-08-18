package delegate;

public class Client {
BusinessDelegate service;
public Client(BusinessDelegate service) {

	this.service=service;
	// TODO Auto-generated constructor stub
}
public void Task()
{
	service.Task();
	}
}
