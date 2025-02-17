package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {


    protected WebDriver driver;

    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/irenepermatasari/IdeaProjects/Orange/ChromeDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--port=57462");  // Set the port to 57462

        WebDriver driver = new ChromeDriver(options);

    }


    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
