import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AutomateBrowsers {
    public static void main(String[] args) {

/*WebDriverManager.firefoxdriver().setup();
WebDriver driver = new FirefoxDriver();
 */
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
         */
WebDriverManager.safaridriver().setup();
WebDriver driver = new SafariDriver();
    }
}
