package prototype;

public class AccessControl implements Prototype {
	private final String controllevel;
	private String access;

	public AccessControl(String controllevel, String access) {
		this.access = access;
		this.controllevel = controllevel;
	}
	
	public AccessControl clone()
	{
		
		try
		{
			return (AccessControl) super.clone();
			
		}
		catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getControllevel() {
		return controllevel;
	}
}
