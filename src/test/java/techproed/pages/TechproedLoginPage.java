package techproed.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TechproedLoginPage {

    public TechproedLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "exampleInputEmail1")
    public WebElement username;

    @FindBy(id = "exampleInputPassword1")
    public WebElement password;

    @FindBy(xpath = "//*[.='Submit']")
    public  WebElement submitButton;

    @FindBy(xpath = "//h2[.='Login Page']")
    public WebElement LoginHeader;


}
