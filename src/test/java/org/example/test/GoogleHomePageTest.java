package org.example.test;


import org.apache.logging.log4j.LogManager;
import org.example.BaseTest.BaseTest;
import org.example.PageObject.GoogleHomePage;
import org.example.Utils.DriverManager;
import org.example.constants.URLs;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class GoogleHomePageTest extends BaseTest {
    private WebDriver driver;
    private GoogleHomePage googleHomePage;

    @Test
    public void testGoogleSearch() {

        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.p();


    }
}
