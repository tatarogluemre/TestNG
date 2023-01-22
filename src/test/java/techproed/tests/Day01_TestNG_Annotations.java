package techproed.tests;

import org.testng.annotations.*;

public class Day01_TestNG_Annotations {


    /*
    @Test: Test Case oluşturmak içim kullanılır.
    @Before ve @After : 5 Before 5After anotations var
      suite > tests > grup > class > method  şeklinde seviyeler ilerler
    @BeforeSuite : her bir test suite den once 1 sefer calisir
    @AfterSuite : her bir test suiteden sonra 1 sefer calisir
    @BeforeTest : her bir testden once(TEST CASE ILE KARISTIRILMAMALI) 1 sefer calisir
    @AfterTest : her bir testden sonra(TEST CASE ILE KARISTIRILMAMALI) 1 sefer calisir
    @BeforeClass: her bir classdan once 1 sefer calisir
    @AfterClass: her bir classdan sonra 1 sefer calisir
    @BeforeMethod: her bir @Test annotationdan once tek sefer calisir. JUnitdeki karsiligi @Before
    @AfterMethod: her bir @Test annotationdan sonra tek sefer calisir. JUnitdeki karsiligi @After
    -------------------------------------------------------------------------------------------
    @Ignore : @Test çalışmasını istemediğimiz test caseleri atlamak için  kullanılır.
    @Test(enabled = false) Test case i pasif hale getirir çalışmasıını engeller.
    -------------------------------------------------------------------------------------------
    TestNG de test caseler test ismine alfabetik sıralamaya göre natural order çalıştrır.
    Çalışma sırasının istediğimiz gibi önceleyebiliriz sıralaması değiştirebiliriz.
    @Test(priority = 1)  şeklinde test case çalışma sıralaması yaparız.
     */
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test(priority = 2)
    public void test01() {

        System.out.println("Test 1");

    }

    @Test
    @Ignore
    public void test02() {

        System.out.println("Test 2");

    }

    @Test(enabled = false)
    public void test03() {

        System.out.println("Test 3");

    }

    @Test(priority = 1)
    public void test04() {

        System.out.println("Test 4");

    }

    @Test(priority = 4)
    public void test05() {

        System.out.println("Test 5");

    }

    @Test(priority = 3)
    public void test06() {

        System.out.println("Test 6");

    }
}
