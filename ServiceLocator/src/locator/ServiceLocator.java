package locator;

public class ServiceLocator {
	private static Cache cache;
	static {
		cache = new Cache();
	}

	public static Service getService(String jname) {
		Service service = cache.getService(jname);
		if (service != null)
			return service;
		InitialContext context = new InitialContext();
		Service service1 = (Service) context.lookup(jname);
		cache.addService(service1);
		return service1;
	}
}
