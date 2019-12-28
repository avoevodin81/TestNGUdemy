package udemy.grouping;

import org.testng.annotations.Test;

public class TestGrouping {

    @Test(groups = "performance")
    public void feature1() {
        System.out.println("Inside feture 1");
    }

    @Test(groups = "regression")
    public void feature2() {
        System.out.println("Inside feture 2");
    }

    @Test(groups = {"performance", "regression"})
    public void feature3() {
        System.out.println("Inside feture 3");
    }
}
