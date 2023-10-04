package org.mobile.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTest {
	
	 @Test
	    public void testAppLaunchAndroid() throws MalformedURLException {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
	        capabilities.setCapability("uiautomator2ServerInstallTimeout", 60000);
	        capabilities.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/ApiDemos-debug.apk");
	        WebDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
	                capabilities);
	         By CONTENT_MENU = MobileBy.AccessibilityId("Animation");
	        driver.findElement(CONTENT_MENU).click();
	    }

}
