import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import input.TextResources;

import static org.junit.Assert.assertEquals;

public class TestLoginPage extends BaseClass {
    TextResources resources = new TextResources();

    @Test
    public void testLogin() {
        accesTheWebsite();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillEmailField().sendKeys(resources.email);
        loginPage.fillPasswordField().sendKeys(resources.password);
        loginPage.clickSubmitButton();
        String expectedTitle = "admin@admin.com, you have successfully logged in!";
        String actualTitle = "admin@admin.com, you have successfully logged in!";
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void inputWrongEmail() {
        accesTheWebsite();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillEmailField().sendKeys(resources.wrongEmail);
        loginPage.fillPasswordField().sendKeys(resources.password);
        loginPage.clickSubmitButton();
        String expectedTitle = "Bad credentials! Please try again! Make sure that you've registered.";
        String actualTitle = "Bad credentials! Please try again! Make sure that you've registered.";
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void clickOnSubmitBtWithEmptyFields() {
        accesTheWebsite();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSubmitButton();
        String expectedTitle = "Bad credentials! Please try again! Make sure that you've registered.";
        String actualTitle = "Bad credentials! Please try again! Make sure that you've registered.";
        assertEquals(expectedTitle, actualTitle);

    }

    @Test
    public void checkTitleIsDisplayed() {
        accesTheWebsite();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.seeTitleLogin().isDisplayed();
        String expectedTitle = "Login Form";
        String actualTitle = "Login Form";
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void checkEmailFieldIsDisplayed() {
        accesTheWebsite();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.seeTitleLogin().isDisplayed();
        WebElement element = driver.findElement(By.id("email"));
        // Get the "id" attribute of the element
        String actualText = element.getAttribute("id");
        String expectedText = "email";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void checkURL() {
        accesTheWebsite();
        String actualUrl = "https://qa-automation-practice.netlify.app/login";
        String expectedUrl = "https://qa-automation-practice.netlify.app/login";
        assertEquals(expectedUrl, actualUrl);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
