package bank;

public class WXYZ implements Bank{

	private final String BName;
	WXYZ()
	{
		BName="WXYZ Bank";
	}
	@Override
	public String GetBankName() {
		// TODO Auto-generated method stub
		return BName;
	}

}
