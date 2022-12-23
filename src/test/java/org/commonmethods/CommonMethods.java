package org.commonmethods;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {
	public static WebDriver driver;

	public void launch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void action(WebElement element) {
		
		Actions ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}
	
	public void senttext(WebElement element, String value) {
		element.sendKeys(value);

	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	public void click(WebElement element) {
		element.click();

	}

	public void screenShot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(path);
		try {
			FileUtils.copyFile(sc, f);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void exit() {
		driver.quit();
	}
	
	public void delay() {
		
		WebDriverWait w = new WebDriverWait(driver, 10);
	}

	public void windowHandling() {

		String parent = driver.getWindowHandle();
		Set<String> childs = driver.getWindowHandles();
		for (String x : childs) {
			if (!parent.equals(x)) {
				driver.switchTo().window(x);
			}
		}

	}
	public void delays() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
