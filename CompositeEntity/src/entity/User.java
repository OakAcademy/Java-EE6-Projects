package entity;

public class User {
	private CompositeEntity compositeentity = new CompositeEntity();

	public void print() {
		for (int i = 0; i < compositeentity.getData().length; i++) {
	
		System.out.println(compositeentity.getData()[i]);
		}
	}
	public void setData(String jobState,String satisfaction)
	{
		compositeentity.setData(jobState, satisfaction);
	}
}
