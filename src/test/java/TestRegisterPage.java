import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRegisterPage {

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
}
