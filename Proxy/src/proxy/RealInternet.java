package proxy;

public class RealInternet implements Internet {

	@Override
	public void Connect(String serverhost) throws Exception {
		System.out.println("Connecting "+serverhost+" adress");
		
	}

}
