package annotations;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGAnnotation_1 {

    @BeforeClass
    public void beforeClass() {
        System.out.print("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void test1() {
        System.out.println("Inside Test 1");
        Assert.assertEquals(1, 2);
    }

    @Test
    public void test2() {
        System.out.println("Inside Test 2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }
}
