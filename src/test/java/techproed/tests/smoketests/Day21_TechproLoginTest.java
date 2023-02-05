package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.pages.TechproedHomePage;
import techproed.pages.TechproedLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_TechproLoginTest {

    TechproedLoginPage techproLoginPage = new   TechproedLoginPage();
    TechproedHomePage techproedHomePage = new TechproedHomePage();
    @Test(groups = "regression-tests")
    public void openSourcesLogin2(){

        //1- Page object Model kullanarak sayfaya giriş yapildigini test edin.
        Driver.getDriver().get(ConfigReader.getProperty("techpro_url"));


        techproLoginPage.username.sendKeys(ConfigReader.getProperty("Techpro_test_userName"));
        techproLoginPage.password.sendKeys(ConfigReader.getProperty("Techpro_test_password"));
        techproLoginPage.submitButton.click();
        Assert.assertTrue(techproedHomePage.homeHeader.isDisplayed());


        //2- Sayfadan cikis yap ve cikis yapildigini test et.

        techproedHomePage.homeLogoutButton.click();
        Assert.assertTrue(techproLoginPage.LoginHeader.isDisplayed());

        //3- Driver'ı kapat.
        Driver.closeDriver();

    }
}
