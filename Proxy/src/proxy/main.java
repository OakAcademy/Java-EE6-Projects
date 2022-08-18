package proxy;

public class main {

	public static void main(String[] args) {
		
		Internet internet=new ProxyInternet();
		try	
		{
			internet.Connect("www.cloudacademy.com");
			internet.Connect("www.oakacademy.uk");
			internet.Connect("www.google.com");
			internet.Connect("aaa.com");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
