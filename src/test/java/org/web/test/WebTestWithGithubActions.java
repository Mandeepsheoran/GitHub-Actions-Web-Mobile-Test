package org.web.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTestWithGithubActions {
	@Test
	public void githubActions() throws InterruptedException {
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://github.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://booking.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}
