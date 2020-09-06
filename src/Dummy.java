/*package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.utils.Constants;
import com.qa.hubspot.utils.ElementUtils;

public class HomePage extends BasePage{
	
	//private WebDriver driver;
	ElementUtils elementUtil;
	
	//By locators
	By header = By.tagName("h1");
	By accountButton = By.cssSelector("#account-menu-container");
	By accountName = By.xpath("//div[text()='Ram Perabathula']");
	By startImport = By.xpath("//a[@type='button']/child::i18n-string[text()='Start import']");
	By importBtn = By.xpath("//span[contains(text(),'Import your data')]"); 
	By settings = By.cssSelector("#navSetting");
	
	public HomePage(WebDriver driver) {
		elementUtil = new ElementUtils(driver);
		//this.driver = driver; // plz remove driver becoz we dont't use driver in this class
	}
	

	public String getHomePageTitle() {
		//return driver.getTitle();
		return elementUtil.waitForTitlePresent(Constants.HOME_PAGE_TITLE, 5);
	}
	*//**
	 * This method says that if header is available return text, If not return null 
	 * @return
	 *//*
	public String getHeaderValue() {
		if(elementUtil.isDisplayed(header)) {
			return elementUtil.getText(header);
		}
		else {
			return null;
		}
//		if(driver.findElement(header).isDisplayed()) {
//		return driver.findElement(header).getText();
//	}
//		else {
//		return null;	
//		}
	}
	
	public String getAccountName() {
		driver.findElement(accountButton).click();
		if(driver.findElement(accountName).isDisplayed()) {
			return driver.findElement(accountName).getText();
		}
		else {
			return null;
		}
		elementUtil.getElement(accountButton).click();
		if(elementUtil.getElement(accountName).isDisplayed()) {
			return elementUtil.getText(accountName);
		}
		else {
			return null;
		}
	}
	
	public void doClickOnStartImport() {
		if(driver.findElement(startImport).isDisplayed()) {
			driver.findElement(startImport).click();
		}
		
		if(elementUtil.getElement(startImport).isDisplayed()) {
			elementUtil.getElement(startImport).click();
		}
	}
	
	public void doClickOnImport() {
		//driver.findElement(importBtn).click();
		elementUtil.getElement(importBtn).click();
	}
	
	public boolean isSettingsExists() {
		//return driver.findElement(settings).isDisplayed();
		return elementUtil.getElement(settings).isDisplayed();
	}
	
	
}*/