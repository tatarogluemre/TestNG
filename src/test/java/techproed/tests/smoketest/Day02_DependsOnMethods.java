package techproed.tests.smoketest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day02_DependsOnMethods {
    @Test
    public void homeTest() {
        System.out.println("Home Test");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "homeTest")
    public void searchTest() {

        System.out.println("Search Test");
    }


    @Test(dependsOnMethods = "homeTest")
    public void paymentTest() {

        System.out.println("Payment Test");
    }
    /*
    TestNg de tüm @Test methodları birbirinden bağımsız çalışırlar.
    Eğer methodları bağımlı hale getirmek istersek depensOnMethods parametresi kullanılır.
    Burdaki örnekde searchTest methodu homeTest methoduna bağımlıdır.
    Eğer homeTest başarılı ise searchTest ve paymentTest çalışır.
    Eğer homeTest başarısız ise searchTest ve paymentTest ıgnore edilir.

     */
}



