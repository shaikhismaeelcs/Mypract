package browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Pom1 {
@FindBy (xpath="//input[@type='text']")
private WebElement username;

@FindBy (xpath="//input[@type='password']")
private WebElement password;

@FindBy (xpath="//button[@type='submit']")
private WebElement loginButton;
public Pom1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void senduser() {
	username.sendKeys("8805921218");
}
public void sendpass() {
	password.sendKeys("971226");
}
public void submit() {
	loginButton.click();
}
}