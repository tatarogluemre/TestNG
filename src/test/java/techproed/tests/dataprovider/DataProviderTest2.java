package techproed.tests.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;
import techproed.utilities.ExcelUtils;

public class DataProviderTest2 {
    //Bu örnekte dataprovider metodumuz util classdan gelecek



    @Test(dataProvider = "musteriVerileri",dataProviderClass = DataProviderUtils.class)
    public void testDataProviderMusteriVerileri(String name , String password) {
        System.out.println("Username = "+name+" Password = "+password);

    }

    @Test(dataProvider = "musteriHizmetleriVerileri",dataProviderClass = DataProviderUtils.class)
    public void testDataProviderMusteriHizmetleri(String name , String password) {
        System.out.println("Username = "+name+" Password = "+password);
    }

    @Test(dataProvider = "personelVerileri",dataProviderClass = DataProviderUtils.class)
    public void testDataProviderPersonelVerileri(String name , String password) {
        System.out.println("Username = "+name+" Password = "+password);
    }
    //Excelden Dataprovidera dataları çekme

    @Test(dataProvider = "customerData",dataProviderClass = DataProviderUtils.class)
    public void testExcelDataProvider(String name , String password) {

        System.out.println("Username = "+name+" Password = "+password);

    }
}
