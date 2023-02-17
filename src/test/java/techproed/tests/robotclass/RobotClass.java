package techproed.tests.robotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.pages.RobotClassPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static techproed.utilities.ReusableMethods.uploadFilePath;

public class RobotClass {
    RobotClassPage robotClassPage;

    @Test
    public void testFileUpload() {
        Driver.getDriver().get(ConfigReader.getProperty("hubcomfy_url"));
        robotClassPage = new RobotClassPage();
        robotClassPage.sign.click();
        robotClassPage.usename.sendKeys(ConfigReader.getProperty("hub_email"));
        robotClassPage.password.sendKeys(ConfigReader.getProperty("hub_password"));
        robotClassPage.loginButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickWithTimeOut(robotClassPage.myAccount,10);
        ReusableMethods.clickWithTimeOut(robotClassPage.store,10);
        ReusableMethods.clickWithTimeOut(robotClassPage.products,10); //Products linki
        ReusableMethods.clickWithTimeOut(robotClassPage.addNew,10);  //Add new linki
        ReusableMethods.clickWithTimeOut(robotClassPage.img,10); //büyük fotoğraf ekleme alanı
        ReusableMethods.clickWithTimeOut(robotClassPage.select,10);
        uploadFilePath(System.getProperty("user.home")+"\\Desktop\\logo.jpeg");
        ReusableMethods.waitFor(4);
        Driver.closeDriver();



    }
}
