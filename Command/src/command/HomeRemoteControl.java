package command;

public class HomeRemoteControl {
	ICommand command;

	public void setCommand(ICommand command) {
		this.command = command;
	}

	public void buttonpressed() {
		command.execute();
	}
}
