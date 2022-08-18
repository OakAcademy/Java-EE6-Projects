package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> list=new ArrayList<Memento>();
	public void addmemento(Memento state)
	{
		list.add(state);
	}
	public Memento getMemento(int index)
	{
		return list.get(index);
	}
}
