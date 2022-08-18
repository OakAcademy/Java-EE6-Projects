package mediator;

public interface Mediator {

	void register(Colleague colleague);
	void unregister(Colleague colleague);
}
