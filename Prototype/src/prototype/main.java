package prototype;

public class main {

	public static void main(String[] args) {
		
		AccessControl userAccessControl=AccessControlProvider.getAccessControlObjects("USER");
		User user=new User("User A", "USER Level", userAccessControl);
		System.out.println("  ");
		System.out.println(user);
		userAccessControl=AccessControlProvider.getAccessControlObjects("USER");
		user=new User("User B", "USER Level", userAccessControl);
		System.out.println("Change Access Control of : " +user.getUserName());
		user.getAccessControl().setAccess("Read Reports");
		System.out.println(user);
		System.out.println(" ");
		AccessControl managerAccesscontrol=AccessControlProvider.getAccessControlObjects("MANAGER");
		user=new User("User C", "USER Level", managerAccesscontrol);
		System.out.println(user);
	}

}
