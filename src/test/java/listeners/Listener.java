package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        System.out.println("The test is passed");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        System.out.println("The test is failed");
    }
}
