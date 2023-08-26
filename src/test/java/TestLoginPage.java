import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestLoginPage {

    WebDriver driver;

    @Before
    public void openChromeBrowser(){

    }
    @Test
    public void testRegisterPage() {

        System.setProperty("webdriver.chrome.driver","/Users/sebastianmarius/Downloads/BasicAutomaton/src/main/resources/drivers/browsers/chromedriver_mac64/chromedriver");

        driver=new ChromeDriver();

        driver.get("https://qa-automation-practice.netlify.app/login.html");


    }

    @Test
    public void testLogin() {
        LoginPage loginPage=new LoginPage();
        System.setProperty("webdriver.chrome.driver","/Users/sebastianmarius/Downloads/BasicAutomaton/src/main/resources/drivers/browsers/chromedriver_mac64/chromedriver");

        driver=new ChromeDriver();

        driver.get("https://qa-automation-practice.netlify.app/login.html");
        // Perform actions on the LoginPage
        loginPage.fillEmailField("your_email@example.com");
        loginPage.fillPasswordField("your_password");

        // Add further steps here, such as clicking login button and verification
        // For simplicity, let's just print a message
        System.out.println("Login fields filled successfully.");
    }
}
