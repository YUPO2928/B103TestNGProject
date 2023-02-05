package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourceDashboardPage;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_OpenSourceLogin {

    @Test
    public void openSourcesLogin() throws InterruptedException {

        //1- Sayfaya gidelim.
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));

        //2- Page Objesi Oluştur.
        OpenSourcePage openSourcePage = new OpenSourcePage();

        //3- Bu Objeyi kullanarak  o class daki objelere ulas
        openSourcePage.username.sendKeys(ConfigReader.getProperty("open_source_username"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("open_source_password"));
        openSourcePage.submitButton.click();

        //4- Assertion
        OpenSourceDashboardPage openSourceDashboardPage = new OpenSourceDashboardPage();
        Thread.sleep(10000);
        Assert.assertTrue(openSourceDashboardPage.dashBoardheader.isDisplayed());

        //5- Close Driver
        Driver.closeDriver();

    }


}
