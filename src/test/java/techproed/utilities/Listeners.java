package techproed.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart-Tüm testlerden önce tek bir kere çağrılır" +context.getName());
    }
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish-Tüm testlerden sonra tek bir kere çağrılır" +context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Herbir @Test dan önce bir kez çağrılır: "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess-Sadece PASS olan testlerden sonra tekbir kez çağrılır: "+result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure-Sadece FAIL olan testlerden sonra tekbir kez çağrılır: "+result.getName());
      ReusableMethods.getScreenshot("Test-Case-Fail-"+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped-Sadece SKIP olan testlerden sonra tekbir kez çağrılır: "+result.getName());
    }
}
