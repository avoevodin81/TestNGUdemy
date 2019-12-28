package udemy.parallel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<WebDriver>();

    @BeforeMethod
    public void start() {
        WebDriver driver = WebDriverFactory.create();
        setWebDriver(driver);

        getWebDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    private void setWebDriver(WebDriver driver) {
        driverThreadLocal.set(driver);
    }

    public WebDriver getWebDriver() {
        return driverThreadLocal.get();
    }

    @AfterMethod
    public void finish() {
        getWebDriver().quit();
    }
}
