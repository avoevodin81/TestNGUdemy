package udemy.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    static WebDriver create() {
        return new ChromeDriver();
    }
}
