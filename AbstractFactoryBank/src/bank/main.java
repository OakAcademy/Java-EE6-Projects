package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Bank Name");
		String bankName=br.readLine();
		System.out.println("/n Enter the Loan Name");
		String loanName=br.readLine();
		AbstractFactory bankfactory=FactoryCreator.GetFactory("Bank");
		Bank b=bankfactory.GetBankName(bankName);
		System.out.println("/n Enter the interested rate");
		double rate=Double.parseDouble(br.readLine());
		System.out.print("/n Enter the loan Amount");
		double loanAmount=Double.parseDouble(br.readLine());
		System.out.println("/n Enter the Years");
		int years=Integer.parseInt(br.readLine());
		System.out.println("You will take loan from" +b.GetBankName());
		AbstractFactory loanFactory=FactoryCreator.GetFactory("Loan");
		Loan l=loanFactory.GetLoan(loanName);
		l.GetInterestedRate(rate);
		l.CalculateLoanPayment(loanAmount, years);
		

	}

}
