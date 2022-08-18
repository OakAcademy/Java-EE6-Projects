package bridge;

public class main {

	public static void main(String[] args) {
		
		Shape triangle=new Triangle(new BlackColor());
		triangle.setColor();
		Shape square=new Square(new WhiteColor());
		square.setColor();

	}

}
