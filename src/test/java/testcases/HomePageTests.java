package testcases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class HomePageTests extends BaseTest {

    @Test
    public void SearchByNonExistingProduct()
    {
        HomePage hp = new HomePage(getDriver());
        hp.searchByName("pppppppp");
        Assert.assertTrue(hp.backButton.isDisplayed() && hp.emptyResultPageMessage.isDisplayed(),"Back button or empty result message are not displayed!");


    }
}
