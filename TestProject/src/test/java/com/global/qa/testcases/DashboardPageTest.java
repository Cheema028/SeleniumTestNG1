package com.global.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.global.qa.base.TestBase;
import com.global.qa.pages.DashboardPage;
import com.global.qa.pages.LoginPage;
import com.global.qa.util.TestUtil;

public class DashboardPageTest extends TestBase {
	LoginPage loginPage;
	DashboardPage homePage;
	TestUtil testUtil;

	public DashboardPageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@Test(priority=1)
	public void verifyMembershipDirTest(){
	 homePage.clickonMembership();
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}