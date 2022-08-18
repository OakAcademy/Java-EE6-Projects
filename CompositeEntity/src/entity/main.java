package entity;

public class main {

	public static void main(String[] args) {
		
		User user=new User();
		user.setData("Success", "Satisfied");
		user.print();
		System.out.println("************************");
		user.setData("Fail", "Unsatisfied");
		user.print();

	}

}
