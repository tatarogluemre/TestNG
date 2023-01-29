package techproed.tests.dataprovider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GoogleHome;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

public class DataProviderTest1 {

    /*
 Data Provider Nedir?
 ***Veri deposudur. Bir cok veriyi Test Caselere loop kullanmadan aktarmak icin kullanilir
 ***Data provider 2D(2 boyutlu) object return eder
 ***Data provider TestNG den gelen bir ozellikdir
 Data Provider ne icin kullanilir?
 ***Data provider DDT(Data Driven Testing) icin kullanilir. Birden fazla datayi test caselerde kullanmak icin kullanilir
 Data Provider i nasil kullanirsin?
 ***@DataProvider annotasyonu ile veri havuzu olusturulur.
 @Test metotlariaa bu data havuzu dataProvider parametresi ile baglanir.
 Data provider da 2 tane parametre vardir:
 ***name : metot ismini override etmek icin, yani farkli bir isim ile data provider i cagirmak icin kullanir
 ***parallel : parallel test case ler olusturmak icin kullanilir
  */
    //Data Provider
   @DataProvider(name = "smoke_test_data")
    public Object[][] urunler(){
        Object urunListesi[][]={
                {"tesla"},
                {"bmw"},
                {"mercedes"},
                {"honda"},
                {"toyota"},
                {"volvo"}
        };

    return urunListesi;
    }

    @Test(dataProvider = "urunler")
    public void testDataProvider(String data) {

        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        GoogleHome googleHome = new GoogleHome();
        googleHome.searchBox.sendKeys(data, Keys.ENTER);
        assert Driver.getDriver().getTitle().contains(data);
        Driver.closeDriver();
    }
    @Test(dataProvider = "smoke_test_data")
    public void testDataProviderName(String data) {

        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        GoogleHome googleHome = new GoogleHome();
        googleHome.searchBox.sendKeys(data, Keys.ENTER);
        assert Driver.getDriver().getTitle().contains(data);
        Driver.closeDriver();
    }
    @DataProvider
    public Object[][] excel(){
        ExcelUtils excelUtils= new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
        Object excel[][]= excelUtils.getDataArrayWithoutFirstRow();

        return excel;
    }
    @Test(dataProvider = "excel")
    public void testDataProviderExcel(String data,String password) {

        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        GoogleHome googleHome = new GoogleHome();
        googleHome.searchBox.sendKeys(data, Keys.ENTER);
        googleHome.searchBox.sendKeys(password, Keys.ENTER);
        Driver.closeDriver();
    }



}
