import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends PageObject {
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "pass")
    private WebElement password;
    @FindBy(id = "u_0_2")
    private  WebElement logInButton;




    public LoginPage(WebDriver driver) {
        super(driver);
    }

     public void enterlogin(String email,String password){
        this.email.clear();
        this.email.sendKeys(email);

        this.password.clear();
        this.password.sendKeys(password);

        this.logInButton.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     }


}
