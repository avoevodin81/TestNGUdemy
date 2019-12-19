package reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportingTests {

    @Test
    public void login() {
        System.out.println("login");
    }

    @Test
    public void logout() {
        System.out.println("logout");
        Assert.assertTrue(false);
    }
}
