package adapter;

public class main {

	public static void main(String[] args) {
		
		Movable bugattiveyron=new BugattiVeyron();
		MovableAdapter bugattiveyronadapter=new MovableAdapterImpl(bugattiveyron);
		System.out.print(bugattiveyronadapter.getSpeed());
	}

}
