package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class WebpageTest {

    private WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("");
    }

    @Test
    public void titleValidationTest() {
        String actualTitle = driver.getTitle();


        String expectedTitle = "My Simple Website";

        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");


        Assert.assertTrue(actualTitle.contains("Website"),
                "Title should contain 'My'");
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}