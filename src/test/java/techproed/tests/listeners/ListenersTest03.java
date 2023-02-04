package techproed.tests.listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class ListenersTest03 {

//1. Util Class olustur : ListenersRetry
//import org.testng.IRetryAnalyzer;
//import org.testng.ITestResult;
//    public class ListenersRetry implements IRetryAnalyzer {
//        private int retryCount = 0;
//        private static final int maxRetryCount = 1;
//        @Override
//        public boolean retry(ITestResult result) {
//            if (retryCount < maxRetryCount) {
//                retryCount++;
//                return true;
//            }
//            return false;
//        }
//    }
//2. Test sinifi olustur : ListenersTest3.  Listeners Retry i iliskilendir : @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
//3. Sonuc : Eger herhangi bir test case FAIL olursa, bu test case 3 kez daha run edilecektir.

    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
    public void test1(){
        System.out.println("PASS");
        Assert.assertTrue(true);
    }

    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
    public void test2() {
        System.out.println("FAIL");
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().findElement(By.xpath("asdgadfhadfgnh"));
        Driver.closeDriver();

    }

    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
    public void test3() {
        System.out.println("Skipped");
        throw new SkipException("Metodu Atla");
    }

    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
    public void test4() {
        System.out.println("Exception Throw");
        Driver.getDriver().get("https://www.techproeducation.com");
        Driver.getDriver().findElement(By.xpath("asdgadfhadfgnh"));
        Driver.closeDriver();
    }
}
