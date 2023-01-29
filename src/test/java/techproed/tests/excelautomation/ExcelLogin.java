package techproed.tests.excelautomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import techproed.pages.BlueRantalCarHomePage;
import techproed.pages.BlueRentalCarLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelLogin {
    BlueRantalCarHomePage blueRantalCarHomePage;
    BlueRentalCarLoginPage blueRentalCarLoginPage;
    ExcelUtils excelUtils;
    List<Map<String, String>> excelDatalari;


    public void login(){
        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_car_url"));
        blueRantalCarHomePage=new BlueRantalCarHomePage();
        blueRentalCarLoginPage=new BlueRentalCarLoginPage();
       //------İlk Giriş----
        //Sadece ilk girişte login butonu görünür olduğu için try catch yaptık
        // daha sonraki girişlerde login button görünür olamdığından no such element exception alınacağı için
        // bu exception ı handle edip hata almamak programın çalışmasını devam ettirmek için try catch kullandık.
        try {
            blueRantalCarHomePage.loginButton.click();

        } catch (Exception e) {
        }
        //----------sonraki Girişler-------
        try{

            blueRantalCarHomePage.userID.click();
            blueRantalCarHomePage.logOutLink.click();
            blueRantalCarHomePage.okButton.click();
            blueRantalCarHomePage.loginButton.click();

            //Login sayfasındayız.

        }catch (Exception e){

        }

    }
    @Test
    public void customerLogin() {
         String path ="./src/test/java/resources/mysmoketestdata.xlsx";
         String sayfa="customer_info";
         excelUtils= new ExcelUtils(path,sayfa);
         excelDatalari=excelUtils.getDataList();
          for(Map<String,String> data :excelDatalari){
              login();
              blueRentalCarLoginPage.email.sendKeys(data.get("username"));
              blueRentalCarLoginPage.password.sendKeys(data.get("password"));
              blueRentalCarLoginPage.getLoginButton.click();
              ReusableMethods.waitFor(1);
              ReusableMethods.verifyElementDisplayed(blueRantalCarHomePage.userID);
              ReusableMethods.getScreenshot("EkranGoruntusu");

        }

   }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
/*
sam.walker@bluerentalcars.com   c!fas_art
kate.brown@bluerentalcars.com   tad1$Fas
raj.khan@bluerentalcars.com v7Hg_va^
pam.raymond@bluerentalcars.com  Nga^g6!
 İŞLEM ADIMLARI

------ILK GIRIS---------
HOME PAGE DEYIZ
home page logine tikla --->>> try catch
LOGIN PAGE DEYIZ
kullanici adini gir(excelden al)
kullanici sifresini git(excelden al)
login page login buttonuna tikla
------2. GIRIS-----
HOME PAGE DEYIZ
kullanici ID ye tikla      --->>> try catch
Logout linkine tikla       --->>> try catch
OK e tikla                --->>> try catch
home page logine tikla    --->>> try catch
LOGIN PAGE DEYIZ
kullanici adini gir(excelden al)
kullanici sifresini git(excelden al)
login page login buttonuna tikla
------3. GIRIS---------
HOME PAGE DEYIZ
kullanici ID ye tikla
Logout linkine tikla
OK e tikla
home page logine tikla
LOGIN PAGE DEYIZ
kullanici adini gir(excelden al)
kullanici sifresini git(excelden al)
login page login buttonuna tikla
---------4. GIRIS------------
HOME PAGE DEYIZ
kullanici ID ye tikla
Logout linkine tikla
OK e tikla
home page logine tikla
LOGIN PAGE DEYIZ
kullanici adini gir(excelden al)
kullanici sifresini git(excelden al)
login page login buttonuna tikla
 */