package template;

public abstract class HouseTemplate {

	public final void build()
	{
		windows();
		Walls();
		Pillars();
		Foundation();
	}
	
	private void windows()
	{
		System.out.println("Building Glass windows");
	}
	public abstract void Walls();
	public abstract void Pillars();
	private void Foundation()
	{
		System.out.println("Building with cement, iron and rods");
	}
}
