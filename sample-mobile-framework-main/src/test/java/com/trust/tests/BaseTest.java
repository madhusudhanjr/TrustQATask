package com.trust.tests;

import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.trust.utils.DriverUtils;

public class BaseTest {

	/**
	 * Class variable which holds the reference to the Logger Object
	 */
	static Logger logger = Logger.getLogger(BaseTest.class);

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "platformName", "deviceName", "automationName" })
	public void setUp(String platformName, String deviceName, String automationName) {
		logger.info("Setup Appium Driver with Platform:: " + platformName + ", AutomationName:: " + automationName
				+ ", DeviceName:: " + deviceName);

		DriverUtils.initializeDriver(platformName, deviceName, automationName);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult result) {
		logger.info("TearDown Appium Driver");
		DriverUtils.quitDriver();
	}

}
