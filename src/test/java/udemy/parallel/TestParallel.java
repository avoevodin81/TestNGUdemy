package udemy.parallel;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestParallel extends BaseTest {

    @Test
    public void test1() {
        getWebDriver().get("https://www.w3schools.com/");
        getWebDriver().findElement(By.xpath("//div[@class='w3-bar-block']/a[contains(text(), 'Learn CSS')]")).click();
        Assert.assertEquals(getWebDriver().getTitle(), "CSS Tutorial");
    }

    @Test
    public void test2() {
        getWebDriver().get("https://www.w3schools.com/");
        getWebDriver().findElement(By.xpath("//div[@class='w3-bar-block']/a[contains(text(), 'Learn HTML')]")).click();
        Assert.assertEquals(getWebDriver().getTitle(), "HTML Tutorial");
    }

    @Test
    public void test3() {
        getWebDriver().get("https://www.w3schools.com/");
        getWebDriver().findElement(By.xpath("//div[@class='w3-bar-block']/a[contains(text(), 'Learn HTML')]")).click();
        Assert.assertEquals(getWebDriver().getTitle(), "HTML Tutorial");
    }
}
