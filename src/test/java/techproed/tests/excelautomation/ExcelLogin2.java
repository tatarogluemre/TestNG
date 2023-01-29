package techproed.tests.excelautomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import techproed.pages.BlueRantalCarHomePage;
import techproed.pages.BlueRentalCarLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class ExcelLogin2 {
    BlueRentalCarLoginPage blueRentalCarLoginPage;
    BlueRantalCarHomePage blueRantalCarHomePage;
    ExcelUtils excelUtils;
    List<Map<String, String>> excelDatalari;
    @Test
    public void testLogin() {
        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_car_url"));
        blueRantalCarHomePage = new BlueRantalCarHomePage();
        blueRentalCarLoginPage = new BlueRentalCarLoginPage();
        excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
         excelDatalari = excelUtils.getDataList();
        for(Map<String,String> data : excelDatalari ){
            blueRantalCarHomePage.loginButton.click();
            blueRentalCarLoginPage.email.sendKeys(data.get("username"));
            blueRentalCarLoginPage.password.sendKeys(data.get("password"));
            blueRentalCarLoginPage.getLoginButton.click();
            ReusableMethods.waitFor(2);
            blueRantalCarHomePage.userID.click();
            ReusableMethods.waitFor(2);
            ReusableMethods.verifyElementDisplayed(blueRantalCarHomePage.userID);
            ReusableMethods.getScreenshot("EkranGoruntusu");
            blueRantalCarHomePage.logOutLink.click();
            ReusableMethods.waitFor(2);
            blueRantalCarHomePage.okButton.click();
            ReusableMethods.waitFor(2);

        }

    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
