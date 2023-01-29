package techproed.tests.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRantalCarHomePage;
import techproed.pages.BlueRentalCarLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

public class ExcelDataProvider {

    @DataProvider
    public Object[][] excel(){
        ExcelUtils excelUtils= new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
        Object excel[][]= excelUtils.getDataArrayWithoutFirstRow();

        return excel;
    }
    @Test(dataProvider = "excel")
    public void testLogin(String mail,String password) {
        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_car_url"));
        BlueRantalCarHomePage blueRantalCarHomePage = new BlueRantalCarHomePage();
        BlueRentalCarLoginPage blueRentalCarLoginPage = new BlueRentalCarLoginPage();
            blueRantalCarHomePage.loginButton.click();
            blueRentalCarLoginPage.email.sendKeys(mail);
            blueRentalCarLoginPage.password.sendKeys(password);
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
            Driver.closeDriver();


    }
}
