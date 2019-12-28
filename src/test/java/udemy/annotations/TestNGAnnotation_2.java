package udemy.annotations;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation_2 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    @Test
    public void test3() {
        System.out.println("Test 3");
//        throw new SkipException("The test is not supporter");
    }
}
