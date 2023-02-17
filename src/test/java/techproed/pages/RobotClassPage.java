package techproed.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import static org.openqa.selenium.By.partialLinkText;

public class RobotClassPage {

    public RobotClassPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Sign In")
    public WebElement sign;
    @FindBy(id="username")
    public WebElement usename;
    @FindBy(id="password")
    public WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton;
    @FindBy(linkText = "Store Manager")
    public WebElement store;
    @FindBy(linkText = "My Account")
    public WebElement myAccount;
    @FindBy(xpath = "//a[@href='https://hubcomfy.com/store-manager/products/']")
    public WebElement products;
    @FindBy(partialLinkText="Add New")
    public WebElement addNew;
    @FindBy(id = "featured_img_display")
    public WebElement img;
    @FindBy(xpath = "//button[@class='browser button button-hero']")
    public WebElement select;
    @FindBy(xpath = "//button[text()='Select']")
    public WebElement selectButton;

}
