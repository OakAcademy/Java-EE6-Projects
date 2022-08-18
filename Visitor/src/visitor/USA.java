package visitor;

public class USA implements Country {
	@Override
	public void CallCountryVisit(CountryVisitorInterface countryvisitorinterface) {
		countryvisitorinterface.Visit(this);
		
	}
}
