package org.hooks;

import org.commonmethods.CommonMethods;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonMethods {
	
	CommonMethods cm = new CommonMethods();
	
	
	@Before
	public void browserlaunch() {
		cm.launch("https://www.flipkart.com/");
	}
	@After
	public void browserclose() {
		cm.exit();
	}
}
