package techproed.tests.smoketest;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import techproed.pages.TechProLoginPage;
import techproed.pages.TechproLogOut;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class TechProLoginTest {

    @Test
    public void testLogin(){

//    https://testcenter.techproeducation.com/index.php?page=form-authentication

        Driver.getDriver().get(ConfigReader.getProperty("techpro_url"));
        TechProLoginPage techProLoginPage = new TechProLoginPage();
        techProLoginPage.username.sendKeys(ConfigReader.getProperty("techpro_username"));
        techProLoginPage.password.sendKeys(ConfigReader.getProperty("techpro_password"));
        techProLoginPage.submitButton.click();
        TechproLogOut techproLogOut = new TechproLogOut();
//    Page object Model kullanarak sayfaya giriş yapildigini test edin
        assert techproLogOut.login.isDisplayed();
        techproLogOut.logoutButton.click();
        assert techProLoginPage.logoutAssert.getText().equals("Login Page");

              Driver.closeDriver();




    }



}
