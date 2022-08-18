package filter;

public class DebugingFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("Debuging "+request);

		
	}

}
