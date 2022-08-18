package visitor;

public class Italy implements Country {

	@Override
	public void CallCountryVisit(CountryVisitorInterface countryvisitorinterface) {
		countryvisitorinterface.Visit(this);
		
	}

}
