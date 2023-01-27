package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class OpenSource {

    //page objelerini bu sınıfta buluruz

    public OpenSource(){
        //PageFactory seleniumdan gelen ve bu sayfa elementlerini instantiate(yüklemek) etmek için kullanılır.
        //sayfa objeleri çağrıldığında null pointer exception alınmaz.

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

}
