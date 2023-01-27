package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.OpenSource;
import techproed.pages.OpenSourceDashboardPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day03_OpenSourceLogin {

    @Test
    public void testLogin() throws InterruptedException {
//        https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));
//        Page Class : OpenSourcePage
//        kullaniciAdi, kullaniciSifre, submitButton elementlerini bul
        OpenSource openSource = new OpenSource();
        openSource.username.sendKeys(ConfigReader.getProperty("open_source_username"));
        openSource.password.sendKeys(ConfigReader.getProperty("open_source_password"));
        openSource.loginButton.click();
//        Test Class : OpenSourceLogin
//        Page objesi olustur
//        Login Testini basarili oldugunu test et
        OpenSourceDashboardPage openSourceDashboardPage = new OpenSourceDashboardPage();
        Thread.sleep(3000);
        assert openSourceDashboardPage.dashboard.getText().equals("Dashboard");
        Driver.closeDriver();

    }
}
