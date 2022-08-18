package decaorator;

public class main {

	public static void main(String[] args) {

		Car sportscar=new SportsCar(new BasicCar());
		sportscar.assemble();
		System.out.println("");
		Car sportsluxurycar=new SportsCar(new LuxuryCar(new BasicCar()));
		sportsluxurycar.assemble();
	}

}
