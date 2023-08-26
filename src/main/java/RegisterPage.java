import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

    WebDriver driver;

    @FindBy(xpath = "")
    private WebElement firstName;
    @FindBy(xpath = "")
    private WebElement lastName;
    @FindBy(xpath = "")
    private WebElement phoneNumber;
    @FindBy(xpath = "")
    private WebElement country;
    @FindBy(xpath = "")
    private WebElement emailAddress;
    @FindBy(xpath = "")
    private WebElement password;
    @FindBy(xpath = "")
    private WebElement termsConditions;
    @FindBy(xpath = "")
    private WebElement register;

    public WebElement getfillFirstNameField() {
        return firstName;
    }
}
