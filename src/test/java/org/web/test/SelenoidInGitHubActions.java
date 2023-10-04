package org.web.test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SelenoidInGitHubActions {
	@Test
	public void selenoidTest() throws MalformedURLException, InterruptedException {		
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("browserName", "chrome");
		ds.setCapability("enableVNC", true);
		ds.setCapability("enableVideo", false);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ds);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://github.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://booking.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
