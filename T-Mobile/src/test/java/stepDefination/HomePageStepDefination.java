package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testhomepage.TestHomePage;

public class HomePageStepDefination extends TestHomePage {

    @Given("I am at T-Mobile home page")
    public void i_am_at_T_Mobile_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "/Users/mdghiasuddin/Desktop/PNT/Team-1_WebAutomationFramework/Generic/BrowserDriver/Mac/chromedriver");
        //getLocalDriver("mac","chrome");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.t-mobile.com");

    }





    @Given("I click on search button")
    public void i_click_on_search_button() throws InterruptedException {
        testSearchButton();

    }

    @Then("I close the browser")
    public void i_close_the_browser()  {
        // Write code here that turns the phrase above into concrete actions
      driver.quit();
    }



    @Given("I click on Wireless button")
    public void i_click_on_Wireless_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testWirelessButton();
    }




    @Given("I click on business button")
    public void i_click_on_business_button()  throws InterruptedException{
        // Write code here that turns the phrase above into concrete actions
        testbusinessButton();
    }


    @Given("I click on Prepaid button")
    public void i_click_on_Prepaid_button()throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testPrepaidButton();
    }



    @Given("I click on Tv button")
    public void i_click_on_Tv_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testTvButton();
    }



    @Given("I click on Banking button")
    public void i_click_on_Banking_button()throws InterruptedException {

        testBankingButton();

    }


    @Given("I click on PhonesNDevices button")
    public void i_click_on_PhonesNDevices_button()throws InterruptedException {

        testPhonesNDevicesLink();

    }



    @Given("I click on phones button")
    public void i_click_on_phones_button()throws InterruptedException {
        testphonesLink();
    }



    @Given("I click on tablets button")
    public void i_click_on_tablets_button()throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testtabletsLink();
    }



    @Given("I click on smartWatches button")
    public void i_click_on_smartWatches_button()throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testsmartWatchesLink();
    }


}
