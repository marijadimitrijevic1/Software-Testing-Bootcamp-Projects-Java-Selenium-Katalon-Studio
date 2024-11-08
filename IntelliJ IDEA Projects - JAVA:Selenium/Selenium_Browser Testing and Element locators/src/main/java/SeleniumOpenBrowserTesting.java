import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOpenBrowserTesting {
    public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String googleSource = driver.getPageSource();
        String googleHandle = driver.getWindowHandle();
        System.out.println(googleHandle);
        System.out.println(googleSource);
        String googleTitle = driver.getTitle();
        System.out.println("Google Title:"+ googleTitle);
        driver.navigate().to("https://www.udemy.com/");
driver.navigate().back();
driver.manage().window().fullscreen();
driver.quit();

    }
}


