package delegate;

public class main {

	public static void main(String[] args) {
		
		BusinessDelegate delegate=new BusinessDelegate();
		delegate.setServicetype("EJBService");
		Client client=new Client(delegate);
		client.Task();
		delegate.setServicetype("JMSService");
		client.Task();

	}

}
