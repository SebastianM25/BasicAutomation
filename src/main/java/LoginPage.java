import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    public WebElement fillEmailField(String email) {
        //email.sendKeys(userEmail);
        return emailField;
    }
    public WebElement fillPasswordField(String userPassword) {
        //password.sendKeys(userPassword);
        return passwordField;
    }
   
}
