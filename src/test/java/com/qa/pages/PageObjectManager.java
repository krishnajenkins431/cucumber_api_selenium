package com.qa.pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public AddUserPage addUserPage;
    public AddUserFormPage addUserFormPage;
    public WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }
    public AddUserPage addUserPage(){
        addUserPage = new AddUserPage(driver);
        return addUserPage;
    }
    public AddUserFormPage addUserFormPage(){
        addUserFormPage = new AddUserFormPage(driver);
        return addUserFormPage;
    }
}
