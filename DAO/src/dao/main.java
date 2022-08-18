package dao;

public class main {

	public static void main(String[] args) {
		EmployeeDAO employeedao=new EmployeeDAOImp();
		for(Employee employee:employeedao.getAllEmployees())
		{
			System.out.println(" Employee Name: "+employee.getName()+ " Employee Job: "+employee.getJob()+
					" Employee registration Id: "+employee.getRegistrationId());
			System.out.println("");
			
			
		}
		Employee employee=employeedao.getAllEmployees().get(1);
		employee.setName("Aldous Huxley");
		employee.setJob("New Author");
		employeedao.updateEmployee(employee);
		System.out.println("");
		Employee updatedemployee=employeedao.getAllEmployees().get(1);
		System.out.print("Employee's values changed with Name: "+updatedemployee.getName()+" Job: "+updatedemployee.getJob());

	}

}
