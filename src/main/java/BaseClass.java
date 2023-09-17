import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
    public WebDriver driver;
    public void accesTheWebsite() {

        System.setProperty("webdriver.chrome.driver","/Users/sebastianmarius/Downloads/BasicAutomaton/src/main/resources/drivers/browsers/chromedriver_mac64/chromedriver");

        driver=new ChromeDriver();

       driver.get("https://qa-automation-practice.netlify.app/login.html");
        //String url="https://qa-automation-practice.netlify.app/login.html";
    }



}
