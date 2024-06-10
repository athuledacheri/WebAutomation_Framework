package org.example.PageObject;

import org.apache.logging.log4j.LogManager;
import org.example.constants.URLs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;

public class GoogleHomePage extends BasePage {



    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public void p()
    {
        System.out.println("successfully clicked");

    }


}
