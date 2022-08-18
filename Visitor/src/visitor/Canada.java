package visitor;

public class Canada implements Country{

	@Override
	public void CallCountryVisit(CountryVisitorInterface countryvisitorinterface) {
		countryvisitorinterface.Visit(this);
		
	}
}
