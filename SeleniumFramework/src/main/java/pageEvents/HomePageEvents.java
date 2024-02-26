package pageEvents;

import pageObjects.HomePageElements;
import utilities.ElementFetch;


public class HomePageEvents {
	ElementFetch ele = new ElementFetch();
	public void signInButton() {
		ele.getWebElement("XPATH", HomePageElements.signInButonText).click();
	}
}