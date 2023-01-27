package techproed.tests.smoketest;

import org.testng.annotations.Test;
import techproed.pages.BlueRantalCarHomePage;
import techproed.pages.BlueRentalCarLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class PositiveLoginTest {

   BlueRentalCarLoginPage blueRentalCarLoginPage;
   BlueRantalCarHomePage blueRantalCarHomePage;


    @Test
    public void US100201_Admin_Login() {

//    Name: US100201_Admin_Login
//    Description:
//    Admin bilgileriyle giriş
//    Acceptance Criteria:
//    Admin olarak, uygulamaya giriş yapabilmeliyim
//    https://www.bluerentalcars.com/
//    Admin password: 12345
//    Admin email: jack@gmail.com

        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_car_url"));
        blueRantalCarHomePage=new BlueRantalCarHomePage();
        blueRentalCarLoginPage=new BlueRentalCarLoginPage();
        blueRantalCarHomePage.loginButton.click();
        blueRentalCarLoginPage.email.sendKeys(ConfigReader.getProperty("blue_rental_car_mail"));
        blueRentalCarLoginPage.password.sendKeys(ConfigReader.getProperty("blue_rental_car_password"));
        blueRentalCarLoginPage.getLoginButton.click();
        assert blueRantalCarHomePage.loginAssert.isDisplayed();
        Driver.getDriver().close();


    }

}
