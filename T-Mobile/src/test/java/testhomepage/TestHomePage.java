package testhomepage;

import common.WebAPI;
import homepage.pageobject.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.nio.channels.SelectableChannel;
import java.security.PublicKey;

public class TestHomePage extends HomePage {



    public static void getInItElement() {
        PageFactory.initElements(driver,HomePage.class);
    }


    @Test(priority = 1)
    public static void testSearchButton() throws InterruptedException {
        getInItElement();
       clickOn(searchButton);
       sleepFor(2);
        //clickSearchButton(searchBox);
       // sendKeysSearchBox("mobile");
    }

    @Test(priority = 2)
    public  void testWirelessButton() throws InterruptedException {
        getInItElement();
        clickOn(wirelessButton);
        sleepFor(2);
    }

    @Test(priority = 3)
    public  void testbusinessButton() throws InterruptedException {
        getInItElement();
        clickOn(businessButton);
        sleepFor(2);
    }

    @Test(priority = 4)
    public  void testPrepaidButton() throws InterruptedException {
        getInItElement();
        clickOn(prepaidButton);
        sleepFor(2);
    }

  @Test(priority = 5)
    public  void testTvButton() throws InterruptedException {
        getInItElement();
      clickOn(tvButton);
        sleepFor(2);
    }

 @Test(priority = 6)
    public  void testBankingButton() throws InterruptedException {
        getInItElement();
     clickOn(bankingButton);
        sleepFor(2);

    }
 @Test(priority = 7)
    public  void testPhonesNDevicesLink() throws InterruptedException {
        getInItElement();
     clickOn(phonesDevices);
        sleepFor(2);

    }

 @Test(priority = 8)
    public  void testphonesLink() throws InterruptedException {
        getInItElement();
     clickOn(phones);
        sleepFor(2);

    }

 @Test(priority = 9)
    public  void testtabletsLink() throws InterruptedException {
        getInItElement();
     clickOn(tablets);
        sleepFor(2);

    }
@Test(priority = 10)
    public  void testsmartWatchesLink() throws InterruptedException {
        getInItElement();
     clickOn(smartWatches);
        sleepFor(2);

    }
    @Test(priority = 11)
    public  void testaccessoriesLink() throws InterruptedException {
        getInItElement();
        clickOn(accessories);
        sleepFor(2);

    }

   @Test(priority = 12)
    public  void testappsConnectedDevicesLink() throws InterruptedException {
        getInItElement();
        clickOn(appsConnectedDevices);
        sleepFor(2);

    }

   @Test(priority = 13)
    public  void testfamilyModeLink() throws InterruptedException {
        getInItElement();
        clickOn(familyMode);
        sleepFor(2);

    }

   @Test(priority = 14)
    public  void testdIGITSLink() throws InterruptedException {
        getInItElement();
        clickOn(dIGITS);
        sleepFor(2);

    }

   @Test(priority = 15)
    public  void testsyncUPDRIVELink() throws InterruptedException {
        getInItElement();
        clickOn(syncUPDRIVE);
        sleepFor(2);

    }

  @Test(priority = 16)
    public  void testplansInformationLink() throws InterruptedException {
        getInItElement();
        clickOn(plansInformation);
        sleepFor(2);

    }



  @Test(priority = 17)
    public  void testplansHomeLink() throws InterruptedException {
        getInItElement();
        clickOn(plansHome);
        sleepFor(2);

    }

  @Test(priority = 18)
    public  void testover55Link() throws InterruptedException {
        getInItElement();
        clickOn(over55);
        sleepFor(2);

    }

 @Test(priority = 19)
    public  void testmilitaryVeteransLink() throws InterruptedException {
        getInItElement();
        clickOn(militaryVeterans);
        sleepFor(2);

    }

 @Test(priority = 20)
    public  void testprepaidLink() throws InterruptedException {
        getInItElement();
        clickOn(prepaid);
        sleepFor(2);

    }

 @Test(priority = 21)
    public  void testinsuranceLink() throws InterruptedException {
        getInItElement();
        clickOn(insurance);
        sleepFor(2);

    }

 @Test(priority = 22)
    public  void testdataPassLink() throws InterruptedException {
        getInItElement();
        clickOn(dataPass);
        sleepFor(2);

    }

 @Test(priority = 23)
    public  void testswitchTMobileLink() throws InterruptedException {
        getInItElement();
        clickOn(switchTMobile);
        sleepFor(2);

    }

 @Test(priority = 24)
    public  void testwe_ll_Help_You_JoinLink() throws InterruptedException {
        getInItElement();
        clickOn(we_ll_Help_You_Join);
        sleepFor(2);

    }

 @Test(priority = 25)
    public  void testsavingsCalculatorLink() throws InterruptedException {
        getInItElement();
        clickOn(savingsCalculator);
        sleepFor(2);

    }

 @Test(priority = 26)
    public  void testFooterPrepaidLink() throws InterruptedException {
        getInItElement();
        clickOn(prepaid);
        sleepFor(2);

    }

 @Test(priority = 27)
    public  void testbringYourOwnDeviceLink() throws InterruptedException {
        getInItElement();
        clickOn(bringYourOwnDevice);
        sleepFor(2);

    }

 @Test(priority = 28)
    public  void testtradeInProgramLink() throws InterruptedException {
        getInItElement();
        clickOn(tradeInProgram);
        sleepFor(2);

    }

 @Test(priority = 29)
    public  void testnumberPortingLink() throws InterruptedException {
        getInItElement();
        clickOn(numberPorting);
        sleepFor(2);

    }

 @Test(priority = 30)
    public  void testtMobileBenefitsLink() throws InterruptedException {
        getInItElement();
        clickOn(tMobileBenefits);
        sleepFor(2);

    }

 @Test(priority = 31)
    public  void testmagentaPlanBenefitsLink() throws InterruptedException {
        getInItElement();
        clickOn(magentaPlanBenefits);
        sleepFor(2);

    }

 @Test(priority = 32)
    public  void testtravelLink() throws InterruptedException {
        getInItElement();
        clickOn(travel);
        sleepFor(2);

    }

 @Test(priority = 33)
    public  void testorderInfoLink() throws InterruptedException {
        getInItElement();
        clickOn(orderInfo);
        sleepFor(2);

    }

 @Test(priority = 34)
    public  void testcheckOrderStatusLink() throws InterruptedException {
        getInItElement();
        clickOn(checkOrderStatus);
        sleepFor(2);

    }

 @Test(priority = 35)
    public  void testviewReturnPolicyLink() throws InterruptedException {
        getInItElement();
        clickOn(viewReturnPolicy);
        sleepFor(2);

    }

 @Test(priority = 36)
    public  void testredeemARebateLink() throws InterruptedException {
        getInItElement();
        clickOn(redeemARebate);
        sleepFor(2);

    }

 @Test(priority = 37)
    public  void testsupportLink() throws InterruptedException {
        getInItElement();
        clickOn(support);
        sleepFor(2);

    }

 @Test(priority = 38)
    public  void testcontactUsLink() throws InterruptedException {
        getInItElement();
        clickOn(contactUs);
        sleepFor(2);

    }

 @Test(priority = 39)
    public  void testplansLink() throws InterruptedException {
        getInItElement();
        clickOn(plans);
        sleepFor(2);

    }

 @Test(priority = 40)
    public  void testbillingLink() throws InterruptedException {
        getInItElement();
        clickOn(billing);
        sleepFor(2);

    }

 @Test(priority = 41)
    public  void testinternationalLink() throws InterruptedException {
        getInItElement();
        clickOn(international);
        sleepFor(2);

    }

 @Test(priority = 42)
    public  void testmyAccountLink() throws InterruptedException {
        getInItElement();
        clickOn(myAccount);
        sleepFor(2);

    }

 @Test(priority = 43)
    public  void testpayMyBillLink() throws InterruptedException {
        getInItElement();
        clickOn(payMyBill);
        sleepFor(2);

    }

 @Test(priority = 44)
    public  void testupgradeLink() throws InterruptedException {
        getInItElement();
        clickOn(upgrade);
        sleepFor(2);

    }

 @Test(priority = 45)
    public  void testaddALineLink() throws InterruptedException {
        getInItElement();
        clickOn(addALine);
        sleepFor(2);

    }

 @Test(priority = 46)
    public  void testmoreThanWirelessLink() throws InterruptedException {
        getInItElement();
        clickOn(moreThanWireless);
        sleepFor(2);

    }

 @Test(priority = 47)
    public  void testbusinessLink() throws InterruptedException {
        getInItElement();
        clickOn(business);
        sleepFor(2);

    }

 @Test(priority = 48)
    public  void testtVisionLink() throws InterruptedException {
        getInItElement();
        clickOn(tVision);
        sleepFor(2);

    }

 @Test(priority = 49)
    public  void testtMobileMONEYLink() throws InterruptedException {
        getInItElement();
        clickOn(tMobileMONEY);
        sleepFor(2);

    }


 @Test(priority =50 )
    public  void testhomeInternetLink() throws InterruptedException {
        getInItElement();
        clickOn(homeInternet);
        sleepFor(2);

    }

 @Test(priority =51 )
    public  void testioTLink() throws InterruptedException {
        getInItElement();
        clickOn(ioT);
        sleepFor(2);

    }

 @Test(priority =52 )
    public  void testaboutTMobileLink() throws InterruptedException {
        getInItElement();
        clickOn(aboutTMobile);
        sleepFor(2);

    }

 @Test(priority =53 )
    public  void testourStoryLink() throws InterruptedException {
        getInItElement();
        clickOn(ourStory);
        sleepFor(2);

    }

 @Test(priority =54 )
    public  void testnewsRoomLink() throws InterruptedException {
        getInItElement();
        clickOn(newsRoom);
        sleepFor(2);

    }

 @Test(priority =55 )
    public  void testinvestorRelationsLink() throws InterruptedException {
        getInItElement();
        clickOn(investorRelations);
        sleepFor(2);

    }

 @Test(priority =56 )
    public  void testcorporateResponsibilityLink() throws InterruptedException {
        getInItElement();
        clickOn(corporateResponsibility);
        sleepFor(2);

    }

 @Test(priority =57 )
    public  void testcommunityLink() throws InterruptedException {
        getInItElement();
        clickOn(community);
        sleepFor(2);

    }

 @Test(priority =58 )
    public  void testsustainabilityLink() throws InterruptedException {
        getInItElement();
        clickOn(sustainability);
        sleepFor(2);

    }

 @Test(priority =59 )
    public  void testprivacyCenterLink() throws InterruptedException {
        getInItElement();
        clickOn(privacyCenter);
        sleepFor(2);

    }

 @Test(priority =60 )
    public  void testcareersLink() throws InterruptedException {
        getInItElement();
        clickOn(careers);
        sleepFor(2);

    }

 @Test(priority =61 )
    public  void testmobileCareersLink() throws InterruptedException {
        getInItElement();
        scrollUpDown(1);
        sleepFor(10);
        clickOn(mobileCareers);
        sleepFor(2);

    }



    @Test(priority = 62)
    public static void testSearchButton1() throws InterruptedException {
        getInItElement();
        clickOn(searchButton);
        sleepFor(2);
        //clickSearchButton(searchBox);
        // sendKeysSearchBox("mobile");
    }

    @Test(priority = 63)
    public  void testWirelessButton1() throws InterruptedException {
        getInItElement();
        clickOn(wirelessButton);
        sleepFor(2);
    }

    @Test(priority = 64)
    public  void testbusinessButton1() throws InterruptedException {
        getInItElement();
        clickOn(businessButton);
        sleepFor(2);
    }

    @Test(priority = 65)
    public  void testPrepaidButton1() throws InterruptedException {
        getInItElement();
        clickOn(prepaidButton);
        sleepFor(2);
    }

    @Test(priority = 66)
    public  void testTvButton1() throws InterruptedException {
        getInItElement();
        clickOn(tvButton);
        sleepFor(2);
    }

    @Test(priority = 67)
    public  void testBankingButton1() throws InterruptedException {
        getInItElement();
        clickOn(bankingButton);
        sleepFor(2);

    }
    @Test(priority = 68)
    public  void testPhonesNDevicesLink1() throws InterruptedException {
        getInItElement();
        clickOn(phonesDevices);
        sleepFor(2);

    }

    @Test(priority = 69)
    public  void testphonesink1() throws InterruptedException {
        getInItElement();
        clickOn(phones);
        sleepFor(2);

    }

    @Test(priority = 70)
    public  void testtabletsLink1() throws InterruptedException {
        getInItElement();
        clickOn(tablets);
        sleepFor(2);

    }
    @Test(priority = 71)
    public  void testsmartWatchesLink1() throws InterruptedException {
        getInItElement();
        clickOn(smartWatches);
        sleepFor(2);

    }
    @Test(priority = 72)
    public  void testaccessoriesLink1() throws InterruptedException {
        getInItElement();
        clickOn(accessories);
        sleepFor(2);

    }

    @Test(priority = 73)
    public  void testappsConnectedDevicesLink1() throws InterruptedException {
        getInItElement();
        clickOn(appsConnectedDevices);
        sleepFor(2);

    }

    @Test(priority = 78)
    public  void testfamilyModeLink1() throws InterruptedException {
        getInItElement();
        clickOn(familyMode);
        sleepFor(2);

    }

    @Test(priority = 79)
    public  void testdIGITSLink1() throws InterruptedException {
        getInItElement();
        clickOn(dIGITS);
        sleepFor(2);

    }

    @Test(priority = 80)
    public  void testsyncUPDRIVELink1() throws InterruptedException {
        getInItElement();
        clickOn(syncUPDRIVE);
        sleepFor(2);

    }

    @Test(priority = 81)
    public  void testplansInformationLink1() throws InterruptedException {
        getInItElement();
        clickOn(plansInformation);
        sleepFor(2);

    }



    @Test(priority = 82)
    public  void testplansHomeLink1() throws InterruptedException {
        getInItElement();
        clickOn(plansHome);
        sleepFor(2);

    }

    @Test(priority = 83)
    public  void testover55Link1() throws InterruptedException {
        getInItElement();
        clickOn(over55);
        sleepFor(2);

    }

    @Test(priority = 84)
    public  void testmilitaryVeteransLink1() throws InterruptedException {
        getInItElement();
        clickOn(militaryVeterans);
        sleepFor(2);

    }

    @Test(priority = 85)
    public  void testprepaidLink1() throws InterruptedException {
        getInItElement();
        clickOn(prepaid);
        sleepFor(2);

    }

    @Test(priority = 86)
    public  void testinsuranceLink1() throws InterruptedException {
        getInItElement();
        clickOn(insurance);
        sleepFor(2);

    }

    @Test(priority = 87)
    public  void testdataPassLink1() throws InterruptedException {
        getInItElement();
        clickOn(dataPass);
        sleepFor(2);

    }

    @Test(priority = 88)
    public  void testswitchTMobileLink1() throws InterruptedException {
        getInItElement();
        clickOn(switchTMobile);
        sleepFor(2);

    }

    @Test(priority = 89)
    public  void testwe_ll_Help_You_JoinLink1() throws InterruptedException {
        getInItElement();
        clickOn(we_ll_Help_You_Join);
        sleepFor(2);

    }

    @Test(priority = 90)
    public  void testsavingsCalculatorLink1() throws InterruptedException {
        getInItElement();
        clickOn(savingsCalculator);
        sleepFor(2);

    }

    @Test(priority = 91)
    public  void testFooterPrepaidLink1() throws InterruptedException {
        getInItElement();
        clickOn(prepaid);
        sleepFor(2);

    }

    @Test(priority = 92)
    public  void testbringYourOwnDeviceLink1() throws InterruptedException {
        getInItElement();
        clickOn(bringYourOwnDevice);
        sleepFor(2);

    }

    @Test(priority = 93)
    public  void testtradeInProgramLink1() throws InterruptedException {
        getInItElement();
        clickOn(tradeInProgram);
        sleepFor(2);

    }

    @Test(priority = 94)
    public  void testnumberPortingLink1() throws InterruptedException {
        getInItElement();
        clickOn(numberPorting);
        sleepFor(2);

    }

    @Test(priority = 95)
    public  void testtMobileBenefitsLink1() throws InterruptedException {
        getInItElement();
        clickOn(tMobileBenefits);
        sleepFor(2);

    }

    @Test(priority = 96)
    public  void testmagentaPlanBenefitsLink1() throws InterruptedException {
        getInItElement();
        clickOn(magentaPlanBenefits);
        sleepFor(2);

    }

    @Test(priority = 97)
    public  void testtravelLink1() throws InterruptedException {
        getInItElement();
        clickOn(travel);
        sleepFor(2);

    }

    @Test(priority = 98)
    public  void testorderInfoLink1() throws InterruptedException {
        getInItElement();
        clickOn(orderInfo);
        sleepFor(2);

    }

    @Test(priority = 99)
    public  void testcheckOrderStatusLink1() throws InterruptedException {
        getInItElement();
        clickOn(checkOrderStatus);
        sleepFor(2);

    }

    @Test(priority = 100)
    public  void testviewReturnPolicyLink1() throws InterruptedException {
        getInItElement();
        clickOn(viewReturnPolicy);
        sleepFor(2);

    }

    @Test(priority = 101)
    public  void testredeemARebateLink1() throws InterruptedException {
        getInItElement();
        clickOn(redeemARebate);
        sleepFor(2);

    }

    @Test(priority = 102)
    public  void testsupportLink1() throws InterruptedException {
        getInItElement();
        clickOn(support);
        sleepFor(2);

    }

    @Test(priority = 103)
    public  void testcontactUsLink1() throws InterruptedException {
        getInItElement();
        clickOn(contactUs);
        sleepFor(2);

    }

    @Test(priority = 104)
    public  void testplansLink1() throws InterruptedException {
        getInItElement();
        clickOn(plans);
        sleepFor(2);

    }

    @Test(priority = 105)
    public  void testbillingLink1() throws InterruptedException {
        getInItElement();
        clickOn(billing);
        sleepFor(2);

    }

    @Test(priority = 106)
    public  void testinternationalLink1() throws InterruptedException {
        getInItElement();
        clickOn(international);
        sleepFor(2);

    }

    @Test(priority = 107)
    public  void testmyAccountLink1() throws InterruptedException {
        getInItElement();
        clickOn(myAccount);
        sleepFor(2);

    }

    @Test(priority = 108)
    public  void testpayMyBillLink1() throws InterruptedException {
        getInItElement();
        clickOn(payMyBill);
        sleepFor(2);

    }

    @Test(priority = 109)
    public  void testupgradeLink1() throws InterruptedException {
        getInItElement();
        clickOn(upgrade);
        sleepFor(2);

    }

    @Test(priority = 110)
    public  void testaddALineLink1() throws InterruptedException {
        getInItElement();
        clickOn(addALine);
        sleepFor(2);

    }

    @Test(priority = 111)
    public  void testmoreThanWirelessLink1() throws InterruptedException {
        getInItElement();
        clickOn(moreThanWireless);
        sleepFor(2);

    }

    @Test(priority = 112)
    public  void testbusinessLink1() throws InterruptedException {
        getInItElement();
        clickOn(business);
        sleepFor(2);

    }

    @Test(priority = 113)
    public  void testtVisionLink1() throws InterruptedException {
        getInItElement();
        clickOn(tVision);
        sleepFor(2);

    }

    @Test(priority = 114)
    public  void testtMobileMONEYLink1() throws InterruptedException {
        getInItElement();
        clickOn(tMobileMONEY);
        sleepFor(2);

    }


    @Test(priority =115 )
    public  void testhomeInternetLink1() throws InterruptedException {
        getInItElement();
        clickOn(homeInternet);
        sleepFor(2);

    }

    @Test(priority =116 )
    public  void testioTLink1() throws InterruptedException {
        getInItElement();
        clickOn(ioT);
        sleepFor(2);

    }

    @Test(priority =117 )
    public  void testaboutTMobileLink1() throws InterruptedException {
        getInItElement();
        clickOn(aboutTMobile);
        sleepFor(2);

    }

    @Test(priority =118 )
    public  void testourStoryLink1() throws InterruptedException {
        getInItElement();
        clickOn(ourStory);
        sleepFor(2);

    }

    @Test(priority =119 )
    public  void testnewsRoomLink1() throws InterruptedException {
        getInItElement();
        clickOn(newsRoom);
        sleepFor(2);

    }

    @Test(priority =120 )
    public  void testinvestorRelationsLink1() throws InterruptedException {
        getInItElement();
        clickOn(investorRelations);
        sleepFor(2);

    }

    @Test(priority =121 )
    public  void testcorporateResponsibilityLink1() throws InterruptedException {
        getInItElement();
        clickOn(corporateResponsibility);
        sleepFor(2);

    }

    @Test(priority =122 )
    public  void testcommunityLink1() throws InterruptedException {
        getInItElement();
        clickOn(community);
        sleepFor(2);

    }

    @Test(priority =123 )
    public  void testsustainabilityLink1() throws InterruptedException {
        getInItElement();
        clickOn(sustainability);
        sleepFor(2);

    }

    @Test(priority =124 )
    public  void testprivacyCenterLink1() throws InterruptedException {
        getInItElement();
        clickOn(privacyCenter);
        sleepFor(2);

    }

    @Test(priority =125 )
    public  void testcareersLink1() throws InterruptedException {
        getInItElement();
        clickOn(careers);
        sleepFor(2);

    }

    @Test(priority =126 )
    public  void testmobileCareersLink1() throws InterruptedException {
        getInItElement();
        scrollUpDown(1);
        sleepFor(10);
        clickOn(mobileCareers);
        sleepFor(2);

    }






@Test(priority =127 )
public void phoneNDevise() {
        getInItElement();
        mouseHover(xpathAndDevices);
}

// Send Keys
@Test(priority =128 )
public void testSearchMobile() throws InterruptedException {
        getInItElement();
        clickOnSearch();
        sleepFor(1);
        searchMobile();
}

     // Scroll

     public void scrollUpDown(int scroll){
         JavascriptExecutor Scroll = (JavascriptExecutor) driver;
         Scroll.executeScript("window.scrollBy(0,"+scroll+")");
     }
public void sendMyKeys(String xpath, String value) {
    driver.findElement(By.xpath(xpath)).sendKeys(value);
}
     @Test
     public void signUp() {
        driver.manage().window().maximize();
//         WebElement login =driver.findElement(By.xpath("//button[@id='user-links-dropdown']"));
//         Select oselect=new Select(login);
//          oselect.selectByIndex(0);
         driver.findElement(By.xpath("//button[@id='user-links-dropdown']")).click();
        driver.findElement(By.xpath("//a[@id='user-link-dropdown-item-0-0-0']")).click();

        driver.findElement(By.xpath("//button[@id='lp1-signup-btn']")).click();
        sendMyKeys("//input[@id='firstName']","MD GHIAS");
        sendMyKeys("//input[@id='lastName']","UDDIN");
        sendMyKeys("//input[@id='PhoneNumber']","3475367504");
        sendMyKeys("//input[@id='Email']","ghias.uddin.ny@gmail.com");
        sendMyKeys("//input[@id='password']","kollol1234");
        driver.findElement(By.xpath("//button[@class='btn button-bg is-valid']")).click();
     }

    // Drop Down

    //calender

    //Frame Handle

    // Alart Handle
    //



}
