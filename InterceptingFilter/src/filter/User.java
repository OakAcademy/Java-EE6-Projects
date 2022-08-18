package filter;

public class User {
	FManager manager;

	public void setFmanager(FManager manager) {
		this.manager = manager;
	}
	
	public void sendrequest(String request)
	{
		manager.filterrequest(request);
	}
}
