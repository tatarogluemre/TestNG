package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TechproLogOut {

    public TechproLogOut(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


@FindBy(xpath = "//div[@role='alert']")
    public WebElement login;

    @FindBy(xpath = "//a[@class='btn btn-dark']")
    public WebElement logoutButton;

}
