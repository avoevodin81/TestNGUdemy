package data_providers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {

    @Test(dataProvider = "getData")
    public void registerUser(String firstName, String lastName, String email, String pwd) {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Password: " + pwd);
        System.out.println("----------------------");
    }

    @Test(dataProviderClass = TestDataFile.class, dataProvider = "getData")
    public void registerUserWithStaticDataProvider(String firstName, String lastName, String email, String pwd) {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Password: " + pwd);
        System.out.println("----------------------");
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] obj = new Object[3][4];

        int i = 1;
        for (Object[] o : obj) {
            o[0] = "Ivan " + i;
            o[1] = "Ivanov " + i;
            o[2] = "ivanov" + i + "@test.com";
            o[3] = "11" + i;
            i++;
        }

        return obj;
    }
}
