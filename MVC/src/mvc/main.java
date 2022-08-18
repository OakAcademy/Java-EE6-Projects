package mvc;

public class main {

	public static void main(String[] args) {
		
		Employee model=getFromDB();
		EmployeeView view=new EmployeeView();
		EmployeeController controller=new EmployeeController(model, view);
		controller.update();
		System.out.println("***********************Change Values *******************");
		controller.setName("John Verdon");
		controller.setId(14);
		controller.update();

	}

	private static Employee getFromDB()
	{
		Employee employee=new Employee();
		employee.setName("Charles Dickens");
		employee.setJob("Author");
		employee.setRegistrationId(12);
		return employee;
	}
}
