package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUserPage {

    public WebDriver driver;

    public AddUserPage(WebDriver driver){
        this.driver = driver;
    }

    private final By addUserButton = By.xpath("//button[normalize-space()='Add User']");

    public void clickAdduser(){
        driver.findElement(addUserButton).click();
    }
}
