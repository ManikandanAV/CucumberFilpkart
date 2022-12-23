package org.pom;

import org.commonmethods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePurchasePOM extends CommonMethods{
	
	CommonMethods cm = new CommonMethods();
	public MobilePurchasePOM() {
		PageFactory.initElements(cm.driver, this);
	}
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement username;
	
	public CommonMethods getCm() {
		return cm;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getXbutton() {
		return xbutton;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getAddtokart() {
		return addtokart;
	}
	
	

	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement login;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement xbutton;
	
	@FindBy(xpath = "//input[@class='_3704LK']")
	private WebElement search;
	
	@FindBy(xpath = "//span[contains(text(),'Place Order')]")
	private WebElement placeorder;
	
	@FindBy(xpath = "(//div[@class='_4rR01T'])[2]")
	private WebElement mobile;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtokart;
	
	@FindBy(xpath = "//button[@class='L0Z3Pu']")
	private WebElement searchicon;
	public WebElement getSearchIcon() {
		
		return searchicon;
	}
	
	

}
