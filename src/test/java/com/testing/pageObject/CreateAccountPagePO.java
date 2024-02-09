package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {
    // Element Locator
    @FindBy(id = "firstname")
    public static WebElement FirstNameField;
    @FindBy(id = "lastname")
    public static WebElement LastNameField;
    @FindBy(name = "email")
    public static WebElement EmailField;
    @FindBy(name = "password")
    public static WebElement PasswordField;
    @FindBy(name = "password_confirmation")
    public static WebElement ConfirmpasswordField;
    @FindBy(css = "#form-validate > div > div.primary")
    public static WebElement CreateAnAccountButton;

    // Initialize Web Element Using Selenium WebDriver
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // Describe Web Element Actions Using Java Method
    public void enterFirstName(String FirstName){
        FirstNameField.sendKeys(FirstName);
    }

    public void enterLastName(String LastName){
        LastNameField.sendKeys(LastName);
    }

    public void enterEmail(String Email){
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void enterConfirmPassword(String ConfirmPassword){
        ConfirmpasswordField.sendKeys(ConfirmPassword);
    }

    public void clickCreateAccountButton(){
        CreateAnAccountButton.click();
    }
















}
