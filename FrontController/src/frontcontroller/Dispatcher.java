package frontcontroller;

public class Dispatcher {

	private EmployeeView employeeview;
	private ManagerView managerview;
	public Dispatcher() {
		employeeview=new EmployeeView();
		managerview=new ManagerView();
	}
	public void dispatch(String request)
	{
		if(request.equalsIgnoreCase("EmployeeView"))
			employeeview.ShowView();
		else
			managerview.ShowView();
	}
}
