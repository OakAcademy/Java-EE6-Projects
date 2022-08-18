package frontcontroller;

public class main {

	public static void main(String[] args) {

FrontController frontcontroller=new FrontController();
frontcontroller.dispatchrequest("EmployeeView");
frontcontroller.dispatchrequest("ManagerView");

	}

}
