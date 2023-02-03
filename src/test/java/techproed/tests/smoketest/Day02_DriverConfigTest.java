package techproed.tests.smoketest;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day02_DriverConfigTest {

    @Test
    public void testFirsTest() {
        //amazona git
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        //title ın amazon içerdiğini test et
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("amazon"));

        Driver.closeDriver();
    }
}
