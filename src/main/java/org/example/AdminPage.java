package org.example;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    private WebDriver driver;

    private By adminMenu = By.xpath("//span[contains(@class, 'oxd-main-menu-item--name') and text()='Admin']");

    private By addButtonadmin = By.xpath("//button[contains(@class, 'oxd-button') and .//i[contains(@class, 'oxd-icon')]]");

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToAdminPage() {

        // Wait for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminMenuElement = wait.until(ExpectedConditions.elementToBeClickable(adminMenu));

        // Click the element
        adminMenuElement.click(); }

    public void clickAddButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(addButtonadmin));
        addButton.click();
    }

    public By getAddButton() {
        return addButtonadmin;
    }
}

