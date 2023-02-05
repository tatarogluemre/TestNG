package techproed.tests.smoketest;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import techproed.pages.BlueRantalCarHomePage;
import techproed.pages.BlueRentalCarLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.time.Duration;

public class NegativeLoginTest {

    BlueRantalCarHomePage blueRantalCarHomePage;
    BlueRentalCarLoginPage blueRentalCarLoginPage;

//    Name:
//    US100208_Negative_Login
//    Description:
//    User should not be able login with incorrect credentials
//    Acceptance Criteria:
//    As customer, I should not be able to log in the application
//    Customer email: fake@bluerentalcars.com
//    Customer password: fakepass
//    Error: User with email fake@bluerentalcars.com not found


    @Test
    public void US100208_Negative_Login() {
        ReusableMethods.waitFor(5);
        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_car_url"));
        blueRantalCarHomePage=new BlueRantalCarHomePage();
        blueRentalCarLoginPage=new BlueRentalCarLoginPage();
        blueRantalCarHomePage.loginButton.click();
        blueRentalCarLoginPage.email.sendKeys(ConfigReader.getProperty("blue_rental_car_fakemail"));
        blueRentalCarLoginPage.password.sendKeys(ConfigReader.getProperty("blue_rental_car_fakepassword"));
        blueRentalCarLoginPage.getLoginButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(blueRentalCarLoginPage.assertNotLogin));
        assert blueRentalCarLoginPage.assertNotLogin.getText().contains("not found");
        Driver.closeDriver();

    }
}
