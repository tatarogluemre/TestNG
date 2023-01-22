package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day02_SoftAssertion {
    @Test
    public void testSoftAssertion() {
    //soft assertrion test kalsa bile çalışmayı devam ettirir.
        //1- softassert objesi oluştur
        SoftAssert softAssert = new SoftAssert();
        System.out.println("satır 12");
        softAssert.assertEquals(2,5);
        System.out.println("satır14");
        softAssert.assertTrue("Java".contains("u"));
        System.out.println("satır16");
        softAssert.assertTrue(true);
        System.out.println("Satır 18");
        softAssert.assertAll();//en son bu method kullanılmalıdır hangi testin geçtiğini ve kaldığını işaretler

    }
}
