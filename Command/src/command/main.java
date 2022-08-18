package command;

public class main {

	public static void main(String[] args) {
		
		Television kitchentv=new Television();
		Television bedroomtv=new Television();
		AirConditioner kitchenair=new AirConditioner();
		AirConditioner bedroomair=new AirConditioner();
		HomeRemoteControl remote=new HomeRemoteControl();
		remote.setCommand(new TurnOnTelevision(bedroomtv));
		remote.buttonpressed();
		remote.setCommand(new TurnOnTelevision(kitchentv));
		remote.buttonpressed();
		remote.setCommand(new TurnOnAirConditioner(bedroomair));
		remote.buttonpressed();
		remote.setCommand(new TurnOnAirConditioner(kitchenair));
		remote.buttonpressed();
		remote.setCommand(new TurnOffTelevision(bedroomtv));
		remote.buttonpressed();
		remote.setCommand(new TurnOffAirConditioner(bedroomair));
		remote.buttonpressed();

	}

}
