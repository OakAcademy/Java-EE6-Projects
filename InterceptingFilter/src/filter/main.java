package filter;

public class main {

	public static void main(String[] args) {
		
		FManager manager=new FManager(new Target());
		manager.addfilter(new AuthenticationFilter());
		manager.addfilter(new DebugingFilter());
		User user=new User();
		user.setFmanager(manager);
		user.sendrequest("Download");

	}

}
