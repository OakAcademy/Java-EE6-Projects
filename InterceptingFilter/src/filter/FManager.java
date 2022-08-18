package filter;

public class FManager {
	FilterChain filterchain;

	public FManager(Target target) {

		filterchain = new FilterChain();
		filterchain.setTarget(target);
		// TODO Auto-generated constructor stub
	}

	public void addfilter(Filter filter) {
		filterchain.add(filter);
	}

	public void filterrequest(String request) {
		filterchain.execute(request);
	}
}
