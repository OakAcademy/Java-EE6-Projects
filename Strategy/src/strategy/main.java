package strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first value");
		float first=Float.parseFloat(br.readLine());
		System.out.println("Enter the Second value");
		float second=Float.parseFloat(br.readLine());
		Context context=new Context(new Addition());
		System.out.println("The Addition of these values : "+context.execute(first, second));
		context=new Context(new Subtraction());
		System.out.println("The subtraction of these values : "+context.execute(first, second));
		context=new Context(new Multiplication());
		System.out.println("The Multiplication of these values : "+context.execute(first, second));
		context=new Context(new Division());
		System.out.println("The Division of these values : "+context.execute(first, second));
	}

}
