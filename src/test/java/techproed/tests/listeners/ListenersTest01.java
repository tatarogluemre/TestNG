package techproed.tests.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

//Burada 1. yol olan @Listeners annotations ile test ettik.
@Listeners(techproed.utilities.Listeners.class)
public class ListenersTest01 {
    //        1. Utilities de Listeners class olustur.
//        2. Implement ITestListeners interface. Bu TestBase class gibidir.
//        3. ITestListeners metotlarını ekle.
//                *******************************************
//        4. tests package da, yeni bir package olustur : listeners
//        5. listeners package da yeni bir class olustur : ListenersTest
//                ********************************************
//        NOT : Test Classlari ile Listenerlari iliskilendirmenin 2 yolu vardır
//        1. @Listeners annotation : @Listeners(techproed.utilities.Listeners.class)
//        2. Xml file : listeners taginin xml file da kullan
//<listeners>
//    <listener class-name="techproed.utilities.Listeners"></listener>
//</listeners>



    @Test
    public void test1(){
        System.out.println("PASS");
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.println("FAIL");
        Assert.assertTrue(false);

    }

    @Test()
    public void test3() {
        System.out.println("Skipped");
        throw new SkipException("Metodu Atla");
    }

    @Test
    public void test4() {
        System.out.println("Exception Throw");
        Driver.getDriver().get("https://www.techproeducation.com");
        Driver.getDriver().findElement(By.xpath("asdgadfhadfgnh"));
    }


}
