package com.trust.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

/**
 * DriverUtils class holds the driver related setup/tear down functions
 */
public class DriverUtils {

	/**
	 * Class variable which holds the reference to the Logger Object
	 */
	static Logger logger = Logger.getLogger(DriverUtils.class);

	private static AppiumDriver driver;

	public static void initializeDriver(String platformName, String deviceName, String automationName) {

		logger.info("Initializing the Driver with the desired capabilities");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", System.getProperty("user.dir") + "/v8.7.1_release.apk");
		capabilities.setCapability("platformName", platformName);
		capabilities.setCapability("deviceName", deviceName);
		capabilities.setCapability("automationName", automationName);

		try {
			driver = new AppiumDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			throw new RuntimeException("Appium server URL is invalid", e);
		}

	}

	public static AppiumDriver getDriver() {
		if (driver == null) {
			throw new IllegalStateException("Driver not initialized. Please call initializeDriver first.");
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
