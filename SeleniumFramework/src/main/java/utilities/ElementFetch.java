package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseTest.TestingBase;

public class ElementFetch {
	
	public WebElement getWebElement(String identifierType, String identifierValue) {
		switch(identifierType) {
		
		case "XPATH":
			return TestingBase.driver.findElement(By.xpath(identifierValue));	
		case"CSS":
			return TestingBase.driver.findElement(By.cssSelector(identifierValue));
		case "ID":
			return TestingBase.driver.findElement(By.id(identifierValue));
		case "Name":
			return TestingBase.driver.findElement(By.name(identifierValue));

			default:
				return null;
		}
	}

	public List<WebElement> getWebElements(String identifierType, String identifierValue) {
		switch(identifierType) {
		
		case "XPATH":
			return TestingBase.driver.findElements(By.xpath(identifierValue));	
		case"CSS":
			return TestingBase.driver.findElements(By.cssSelector(identifierValue));
		case "ID":
			return TestingBase.driver.findElements(By.id(identifierValue));
		case "Name":
			return TestingBase.driver.findElements(By.name(identifierValue));

			default:
				return null;
		}
	}

}
