package udemy.data_providers;

import org.testng.annotations.DataProvider;

public class TestDataFile {

    @DataProvider
    public static Object[][] getData() {
        Object[][] obj = new Object[3][4];

        int i = 10;
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
