package flyweight;

import java.util.HashMap;

public class CarFactory {
	private HashMap<String, Car> carlist=new HashMap<String, Car>();
	public Car getCar(String carType)
	{
		Car car=carlist.get((carType));
		if(car==null)
		{
			if(carType=="Mercedes")
			{
				car=new Mercedes();
				System.out.println("A Mercedes Car was created and saved");
			}
			else if(carType=="Jaguar")
			{
				car=new Jaguar();
				System.out.println("A Jaguar Car was created and saved");
			}
			else if(carType=="Citroen")
			{
				car=new Citroen();
				System.out.println("A Citroen car was created and saved");
			}
		}
		return car;
	}

}
