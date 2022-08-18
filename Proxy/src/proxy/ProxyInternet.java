package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	private Internet internet=new RealInternet();
	private static List<String> bannedsites;
	static{
		
		bannedsites=new ArrayList<String>();
		bannedsites.add("aaa.com");
		bannedsites.add("bbb.com");
		bannedsites.add("ccc.com");
		bannedsites.add("ddd.com");
	}
	
	@Override
	public void Connect(String serverhost) throws Exception {
		
		if(bannedsites.contains(serverhost.toLowerCase()))
		{
			throw new Exception("Access Denied");
		}
		internet.Connect(serverhost);
		
	}

}
