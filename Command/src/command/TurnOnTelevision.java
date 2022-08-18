package command;

public class TurnOnTelevision implements ICommand {

	Television television;
	public TurnOnTelevision(Television television)
	{
		super();
		this.television=television;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Turning on television");
		television.turnOn();
		
	}

}
