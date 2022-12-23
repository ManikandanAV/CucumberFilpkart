package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\MobilePurchase.feature",
				 glue = {"org.stepdefenition","org.hooks"},
				 monochrome = true,
				 plugin = {"html:report/mobilepurchase","json:report/mobile.json"}
				
				)

public class Runner {

}
