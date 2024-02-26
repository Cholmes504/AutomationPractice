package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utilities.ElementFetch;

public class LoginPageEvents {
	
ElementFetch ele = new ElementFetch();

	
	public void verifyIfLoginPageIsLoaded() {
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size()==0, "Element not found");
		}
	public void eneterCredentials() {
		ele.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("rmishra@gmail.com");
		ele.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys("12345");

	}
}
