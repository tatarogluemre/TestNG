package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRantalCarHomePage {
    public BlueRantalCarHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@role='button'])[1]")
    public WebElement loginButton;



    @FindBy(id = "dropdown-basic-button")
    public WebElement loginAssert;
}
