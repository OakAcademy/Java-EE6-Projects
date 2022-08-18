package memento;

public class main {

	public static void main(String[] args) {


		Originator originator=new Originator();
		CareTaker caretaker=new CareTaker();
		originator.setState("State1");
		caretaker.addmemento(originator.saveStatetoMemento());
		originator.setState("State2");
		caretaker.addmemento(originator.saveStatetoMemento());
		originator.setState("State3");
		caretaker.addmemento(originator.saveStatetoMemento());
		originator.setState("State4");
		caretaker.addmemento(originator.saveStatetoMemento());
		
		System.out.println("Current state is: "+originator.getState());
		originator.getStateFromMemento(caretaker.getMemento(0));
		System.out.println("first state is: "+originator.getState());
		originator.getStateFromMemento(caretaker.getMemento(1));
		System.out.println("Second state is: "+originator.getState());
		originator.getStateFromMemento(caretaker.getMemento(2));
		System.out.println("Third state is: "+originator.getState());
		originator.getStateFromMemento(caretaker.getMemento(3));
	}

}
