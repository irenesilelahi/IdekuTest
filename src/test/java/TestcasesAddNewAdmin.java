

import org.example.AddAdmin;
import org.example.AdminPage;
import org.example.BaseTest;
import org.example.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestcasesAddNewAdmin extends BaseTest {

    @BeforeMethod
    public void setUp() {
        setupDriver();

    }


    @Test
    public void testAddUserFlow() {
        // Navigate to OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Login
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("Admin", "admin123");

        // Navigate to Admin Page
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        AdminPage adminPage = new AdminPage(driver);
        adminPage.navigateToAdminPage();

        // Add User
        adminPage.clickAddButton();
        AddAdmin addUserPage = new AddAdmin(driver);
        addUserPage.fillAddUserForm("Admin", "Rene Sari", "Enabled", "AdminRene", "Qwerty123");
        addUserPage.clickSave();

        // Log out
        driver.findElement(By.xpath("//p[text()='Paul Collings']")).click(); // Update if username differs
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }

    @AfterMethod
    public void tearDown() {
        tearDown();
    }
}
