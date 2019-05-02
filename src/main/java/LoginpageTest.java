import org.testng.annotations.Test;

public class LoginpageTest extends FunctionalTest{
    @Test
    public void singUp(){
        driver.get("https://www.facebook.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterlogin("ado@gmail.com","ado");

    }
}
