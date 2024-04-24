package com.trust.tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.trust.pages.HomePage;

public class WalletTest extends BaseTest {
	
	/**
	 * Class variable which holds the reference to the Logger Object
	 */
	static Logger logger = Logger.getLogger(WalletTest.class);

    @Test(description = "Create Wallet Tests for Trust Wallet App")
    public void createWallet() throws Exception {
    	
    	logger.info("*****Executiion of CreateWallet Test starts*****");
    	
    	HomePage homePage = new HomePage();
    	homePage.acceptSecurityAlert();
    	homePage.clickGetStartedButton();
    	homePage.clickCreateNewWallet();
    	homePage.clickSkipButton();
    	homePage.setPasscode();
    	homePage.clickStartUsingTrustWalletButton();
    	
    	Assert.assertTrue(homePage.getWalletName().equalsIgnoreCase("Main Wallet 1"), "Wallet name mismatch!");
    	
    	logger.info("*****Executiion of CreateWallet Test ends*****");
    		    
    }

}