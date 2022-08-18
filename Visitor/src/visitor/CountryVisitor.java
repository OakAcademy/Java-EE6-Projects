package visitor;

public class CountryVisitor implements CountryVisitorInterface {

	@Override
	public void Visit(Italy italy) {
		System.out.println("Visiting Italy");
		
	}

	@Override
	public void Visit(USA usa) {
		System.out.println("Visiting USA");		
	}

	@Override
	public void Visit(Canada canada) {
		System.out.println("Visiting Canada");		
	}

}
