package command;

public class TurnOffAirConditioner implements ICommand {
	AirConditioner airconditioner;

	public TurnOffAirConditioner(AirConditioner airconditioner) {
		super();
		this.airconditioner = airconditioner;
	}

	@Override
	public void execute() {
		System.out.println("Turning off AirConditioner");
		airconditioner.turnOff();
	}

}
