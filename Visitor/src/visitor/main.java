package visitor;

public class main {

	public static void main(String[] args) {
		Country countries=new Countries();
		CountryVisitorInterface countryvisitor=new CountryVisitor();
		countries.CallCountryVisit(countryvisitor);

	}

}
