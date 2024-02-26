package qa.test;

import org.testng.annotations.Test;

import baseTest.TestingBase;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utilities.ElementFetch;
import pageObjects.LoginPageElements;

public class Testcase1 extends TestingBase {
	
ElementFetch ele = new ElementFetch();
HomePageEvents homePage = new HomePageEvents();
LoginPageEvents loginPage = new LoginPageEvents();

  @Test
  public void sampleMethodForEnteringCredentials(){ 
  
	  homePage.signInButton();
	  loginPage.verifyIfLoginPageIsLoaded();
	  loginPage.eneterCredentials();
	  
  }  
}
