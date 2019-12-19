package prioritization;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningTestNGPriority {

    @Test(priority = 1)
    public void login() {
        System.out.println("Log in");
    }

    @Test(priority = 3, dependsOnMethods = "navigating")
    public void logOut() {
        System.out.println("Log out");
    }

    @Test(priority = 2)
    public void navigating() {
        System.out.println("Navigating");
        Assert.assertTrue(false);
    }
}
