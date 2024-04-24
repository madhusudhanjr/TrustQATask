# TrustQATask

**TestCase: Automation of Wallet Creation Functionality**
To automate the wallet creation functionality, we will utilize the abstract framework available at https://github.com/HadiTW/sample-mobile-framework.

## Tech Stack Details:
**Project Type:** Maven

1) **Tools:** Appium Java Client, Appium Server
2) **Programming Language:** Java
3) **Testing Framework:** TestNG
4) **Test Framework Design:** Page Object Model (POM) with Page Factory Pattern
5) **Logging:** Log4j
6) **Reporting:** Default TestNG report
7) **Test App:** Android Trust app
8) **Device Tested:** Android Pixel 5 emulator with API level 30
9) **Platform:** macOS Sonoma (v 14.3.1)
10) **IDE:** Eclipse

## Steps to Run the Tests:

**Prerequisites:**

1) Place the APK file (v8.7.1_release.apk) under the project's root folder.
2) Start the Appium server with the command `appium server -p 4725 -a 127.0.0.1 -pa /wd/hub`
3) Ensure the availability of the Pixel 5 API 30 Android emulator or a similar.
   
**Test Execution:**
1) Select the `testng.xml` file located in the src folder.
2) Run it as a TestNG Suite.
3) The testng.xml file contains default test parameters:
    `platformName` Android
    `deviceName` Pixel_5_API_30
    `automationName` UIAutomator2
4) These parameters facilitate the installation and launch of the APK on the emulator.
5) Optionally, the deviceName can be modified to match locally available Android emulators.
6) Test results will be generated and stored under the `test-output` folder, accessible via `emailable-report.html`.
