import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {
    public static void main(String[] args) {

    }
    @Test
    public void login(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\java\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://sk-sk.facebook.com/");
        webDriver.manage().window().maximize();
    }
}
