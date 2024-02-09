package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPagePO {
    // Element Locator

    @FindBy(name = "login[username]")
    public static WebElement UserNameField;

    @FindBy(name = "login[password]")
    public static WebElement PasswordField;

    @FindBy(css = "#send2 > span")
    public static WebElement SignInButton;

    // Initializer Web Element action using selenium Web Driver
    public AccountLoginPagePO(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // Describe Web Element action using Java Method
    public void enterUserName(String UserName){
        UserNameField.sendKeys(UserName);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void clickSignInButton(){
        SignInButton.click();
    }






























}
