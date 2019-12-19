package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningParameters {

    @Test()
    @Parameters("email")
    public void logIn(String email) {
        System.out.println("Inside Login");
        System.out.println("My email is: " + email);
    }
}
