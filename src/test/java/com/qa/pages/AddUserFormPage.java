package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddUserFormPage {

    public WebDriver driver;

    public AddUserFormPage(WebDriver driver){
        this.driver = driver;
    }

    private final By firstName = By.xpath("//input[@name='FirstName']");
    private final By lastName = By.xpath("//input[@name='LastName']");
    private final By userName = By.xpath("//input[@name='UserName']");
    private final By password = By.xpath("//input[@name='Password']");
    private final By customerAAA = By.xpath("//input[@value='15']");
    private final By customerBBB = By.xpath("//input[@value='16']");
    private final By roleDropDown = By.xpath("//select[@name='RoleId']");
    private final By adminSelection = By.xpath("//option[@value='2']");
    private final By customerSelection = By.xpath("//option[@value='1']");
    private final By emailid = By.xpath("//input[@name='Email']");
    private final By mobile = By.xpath("//input[@name='Mobilephone']");
    private final By saveButton = By.xpath("//button[@class='btn btn-success']");

    public void enterFirstName(String firstname){
        driver.findElement(firstName).sendKeys(firstname);
    }
    public void enterLastName(String lastname){
        driver.findElement(lastName).sendKeys(lastname);
    }
    public void enterUserName(String username){
        driver.findElement(userName).sendKeys(username);
    }
    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void clickCompanyAAARadioButton(){
        driver.findElement(customerAAA).click();
    }
    public void clickCompanyBBBRadioButton(){
        driver.findElement(customerBBB).click();
    }
    public void selectAdminRole(String Role){
        Select select = new Select(driver.findElement(roleDropDown));
        select.selectByVisibleText(Role);
    }
    public void selectCustomerRole(String Role){
        Select select = new Select(driver.findElement(customerSelection));
        select.selectByVisibleText(Role);
    }
    public void enterEmail(String email){
        driver.findElement(emailid).sendKeys(email);
    }
    public void enterCell(String cell){
        driver.findElement(mobile).sendKeys(cell);
    }
    public void clickSaveButton(){
        driver.findElement(saveButton).click();
    }


    public void fillAllFields(String FirstName, String LastName, String UserName, String Password, String Role, String Email, String Cell){
        enterFirstName(FirstName);
        enterLastName(LastName);
        enterUserName(UserName);
        enterPassword(Password);
        clickCompanyAAARadioButton();
        selectAdminRole(Role);
        enterEmail(Email);
        enterCell(Cell);
        clickSaveButton();
    }
}
