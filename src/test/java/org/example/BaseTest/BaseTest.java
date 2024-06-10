package org.example.BaseTest;

import org.example.Utils.DriverManager;
import org.example.constants.URLs;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get(URLs.WebPageUrl);
    }



    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
