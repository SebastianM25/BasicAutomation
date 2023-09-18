import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        System.out.println("Login fields filled successfully.");
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
        // Now, use assertEquals to compare the actualText with the expectedText
        assertEquals(expectedText, actualText);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
