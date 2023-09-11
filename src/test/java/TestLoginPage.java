import org.junit.Test;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class TestLoginPage extends BaseClass{
    TextResources resources=new TextResources();

    @Test
    public void testLogin() {
        testRegisterPage();

        LoginPage loginPage=new LoginPage(driver);


        loginPage.fillEmailField().sendKeys(resources.email);
        loginPage.fillPasswordField().sendKeys(resources.password);
        loginPage.clickSubmitButton();


        System.out.println("Login fields filled successfully.");
    }
}
