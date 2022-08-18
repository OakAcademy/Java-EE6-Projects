package observer;

public class Binary extends Observer {

	public Binary(Subject subject)
	{
		this.subject=subject;
		this.subject.attach(this);
	}
	@Override
	public void Update() {
		System.out.println(" Binary string is: "+ Integer.toBinaryString(subject.getState()));
		
	}

}
