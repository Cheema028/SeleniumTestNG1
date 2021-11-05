package com.global.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.qa.base.TestBase;

public class DashboardPage extends TestBase {
	
	
	@FindBy(xpath="//*[@id=\"sidebar\"]/div/div[2]/ul/li[1]/a/span")
	WebElement membership;
	



public DashboardPage(){
	PageFactory.initElements(driver, this);
}

public String validateDashboardPageTitle(){
	return driver.getTitle();
}

public void clickonMembership() {
	
	membership.click();
	
}



}