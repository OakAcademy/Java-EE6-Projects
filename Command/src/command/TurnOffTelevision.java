package command;

public class TurnOffTelevision implements ICommand{

	Television television;
	public TurnOffTelevision(Television television)
	{
		super();
		this.television=television;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Turning off television");
		television.turnOff();
		
	}
}
