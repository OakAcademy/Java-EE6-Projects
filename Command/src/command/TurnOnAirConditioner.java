package command;

public class TurnOnAirConditioner implements ICommand {
	AirConditioner airconditioner;

	public TurnOnAirConditioner(AirConditioner airconditioner) {
		super();
		this.airconditioner = airconditioner;
	}

	@Override
	public void execute() {
		System.out.println("Turning on AirConditioner");
		airconditioner.turnOn();
	}
}
