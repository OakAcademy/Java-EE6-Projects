package locator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private List<Service> services;
	public Cache() {
		services=new ArrayList<Service>();
	}
	
	public Service getService(String name)
	{
		for(Service service:services)
		{
			if(service.getServiceName().equalsIgnoreCase(name))
			{
				System.out.println(" Returning cached "+name+ " object");
				return service;
			}
		}
		return null;

	}
	
	public void addService(Service newservice)
	{
		
		boolean exist=false;
		for(Service service:services)
		{
			if(service.getServiceName().equalsIgnoreCase(newservice.getServiceName()))
				exist=true;
		}
		if(!exist)
		{
			services.add(newservice);
		}
	}
}
