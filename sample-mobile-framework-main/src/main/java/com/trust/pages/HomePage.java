package com.trust.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * HomePage Class holds the WebElement references to the various UI elements of
 * app home screen
 */
public class HomePage extends BasePage {

	/**
	 * Class variable which holds the reference to the Logger Object
	 */
	static Logger logger = Logger.getLogger(HomePage.class);

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"OK\"]")
	private WebElement acceptSecurityAlert;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Get Started\"]")
	private WebElement getStartedButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Create new wallet\"]")
	private WebElement createNewWallet;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"SKIP\"]")
	private WebElement skipButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"1\"]")
	private WebElement numericOne;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Start using Trust Wallet\"]")
	private WebElement startUsingTrustWallet;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Main Wallet 1\"]")
	private WebElement walletName;

	public HomePage() {

		super();
	}

	/**
	 * This method is used to accept the security alert
	 * 
	 * @param searchText
	 */
	public void acceptSecurityAlert() {

		logger.info("Accept the Securoty Alert");
		acceptSecurityAlert.click();
	}

	/**
	 * This method is used to click on the Get Started Button
	 * 
	 */
	public void clickGetStartedButton() {

		logger.info("Click on GetStarted Button");
		waitForVisibility(getStartedButton);
		getStartedButton.click();
	}

	/**
	 * This method is used to click on the Create New Wallet
	 * 
	 */
	public void clickCreateNewWallet() {

		logger.info("Click Create New Wallet");
		waitForElementClickable(createNewWallet);
		createNewWallet.click();
	}

	/**
	 * This method is used to click on the Skip Button
	 * 
	 */
	public void clickSkipButton() {

		logger.info("Click SKIP button");
		skipButton.click();
	}

	/**
	 * This method is used to enter the Passcode
	 * 
	 */
	public void setPasscode() {

		logger.info("Set/Confirm Passcode");
		numericOne.click();
		numericOne.click();
		numericOne.click();
		numericOne.click();
		numericOne.click();
		numericOne.click();
		
		waitForVisibility(numericOne);
		numericOne.click();
		numericOne.click();
		numericOne.click();
		numericOne.click();
		numericOne.click();
		numericOne.click();
	}

	/**
	 * This method is used to click on the Start using Trust wallet button
	 * 
	 */
	public void clickStartUsingTrustWalletButton() {

		logger.info("Click Start Usnig Trust Wallet button");
		startUsingTrustWallet.click();
	}

	/**
	 * This method is used to get the wallet name
	 * 
	 */
	public String getWalletName() {

		logger.info("Get Wallet Name:: " + walletName.getText());
		return walletName.getText();
	}
}
