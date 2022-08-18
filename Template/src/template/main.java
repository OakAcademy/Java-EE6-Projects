package template;

public class main {

	public static void main(String[] args) {
		
		HouseTemplate type=new GlassHouse();
		type.build();
		System.out.println("------------------------------------------------");
		type=new WoodenHouse();
		type.build();
		

	}

}
