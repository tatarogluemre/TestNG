package techproed.tests.excelautomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import techproed.pages.BlueRantalCarHomePage;
import techproed.pages.BlueRentalCarLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

public class ExcelDeneme {
    BlueRentalCarLoginPage blueRentalCarLoginPage;
    BlueRantalCarHomePage blueRantalCarHomePage;
    ExcelUtils excelUtils;

    @Test(groups="regression-tests")
    public void testLogin() {
         Driver.getDriver().get(ConfigReader.getProperty("blue_rental_car_url"));
        blueRantalCarHomePage = new BlueRantalCarHomePage();
        blueRentalCarLoginPage = new BlueRentalCarLoginPage();
        excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");

        for(int i= 1 ; i<excelUtils.rowCount();i++){
            blueRantalCarHomePage.loginButton.click();
            blueRentalCarLoginPage.email.sendKeys(excelUtils.getCellData(i,0));
            blueRentalCarLoginPage.password.sendKeys(excelUtils.getCellData(i,1));
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
