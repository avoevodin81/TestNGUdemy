package udemy.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {

    @Test
    public void loginWithEmail() {
        System.out.println("Inside test login with email");
    }

    @Test
    public void loginWithFacebook() {
        System.out.println("Inside test login with Facebook");
        Assert.assertTrue(false);
    }
}
