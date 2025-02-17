package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAdmin {
    private WebDriver driver;

    private By userRoleDropdown = By.xpath("//label[text()='User Role']/following::div[1]");
    private By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    private By statusDropdown = By.xpath("//label[text()='Status']/following::div[1]");
    private By usernameField = By.xpath("//label[text()='Username']/following::input[1]");
    private By passwordField = By.xpath("//label[text()='Password']/following::input[1]");
    private By confirmPasswordField = By.xpath("//label[text()='Confirm Password']/following::input[1]");
    private By saveButton = By.xpath("//button[text()='Save']");

    public AddAdmin(WebDriver driver) {
        this.driver = driver;
    }

    public void fillAddUserForm(String userRole, String employeeName, String status, String username, String password) {
        driver.findElement(userRoleDropdown).click();
        driver.findElement(By.xpath("//span[text()='" + userRole + "']")).click();

        driver.findElement(employeeNameField).sendKeys(employeeName);
        driver.findElement(By.xpath("//div[text()='" + employeeName + "']")).click();

        driver.findElement(statusDropdown).click();
        driver.findElement(By.xpath("//span[text()='" + status + "']")).click();

        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmPasswordField).sendKeys(password);
    }

    public void clickSave() {
        driver.findElement(saveButton).click();
    }
}

