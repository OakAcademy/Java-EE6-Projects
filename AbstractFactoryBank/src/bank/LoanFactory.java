package bank;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank GetBankName(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan GetLoan(String loan) {
		if(loan==null)
			return null;
		else 
		{
			if(loan.equalsIgnoreCase("Home"))
				return new HomeLoan();
			else if(loan.equals("Business"))
				return new BusinessLoan();
			else if(loan.equals("Education"))
				return new EducationLoan();
			else 
				return null;
		}
		
		// TODO Auto-generated method stub
	
	}
	
}
