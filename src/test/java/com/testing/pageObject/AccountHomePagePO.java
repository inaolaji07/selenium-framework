package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountHomePagePO {

    // Element Locator

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;

    // Initialize Web Element Using Selenium WebDriver

    public AccountHomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // Describe Web Element Actions Using Java Method

    public void clickSignInLink(){
        SignInLink.click();
    }



















}
