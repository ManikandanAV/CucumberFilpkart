package org.stepdefenition;

import org.commonmethods.CommonMethods;
import org.pom.MobilePurchasePOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MobilePurchase extends CommonMethods {

	CommonMethods cm = new CommonMethods();
	MobilePurchasePOM mp = new MobilePurchasePOM();

	@Given("user login to flipkart{string},{string}")
	public void user_login_to_flipkart(String user, String pass) {
		cm.senttext(mp.getUsername(), user);
		cm.senttext(mp.getPassword(), pass);
		// cm.click(mp.getLogin());
		cm.click(mp.getXbutton());
	}
	@And("user search iphone mobile{string}")
	public void user_search_iphone_mobile(String mobile) {
		cm.senttext(mp.getSearch(), mobile);
		cm.action(mp.getSearchIcon());
	}
	

	@And("user select the iphone")
	public void user_select_the_iphone() {
		cm.delays();
		cm.action(mp.getMobile());
	}

	@And("user click addtocart")
	public void user_click_addtocart() {

		cm.windowHandling();
		cm.click(mp.getAddtokart());
	}

	@Then("user click placeorder")
	public void user_click_placeorder() {

		cm.delays();
		cm.click(mp.getPlaceorder());
		cm.screenShot("C:\\Users\\mania\\OneDrive\\Desktop\\mobilepurchased.png");
	}

}
