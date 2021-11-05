package com.global.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.global.qa.base.TestBase;
import com.global.qa.pages.DashboardPage;
import com.global.qa.pages.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	DashboardPage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1, description ="Verifying Login Page Title")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description1")
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Global Parents Forum");
	}
	
	@Test(priority=2, description ="Verifying Login Page Image")
	public void crmLogoImageTest(){
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3, description ="Verifying Login")
	public void loginTest() throws InterruptedException{
		Thread.sleep(1000);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	

}