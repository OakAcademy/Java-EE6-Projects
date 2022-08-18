package delegate;

public class BusinessDelegate {

	private BusinessLookUp lookup=new BusinessLookUp();
	private BusinessService service;
	private String servicetype;
	
	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}
	
	public void Task()
	{
		service=lookup.getBusinessService(servicetype);
		service.process();
	}
}
