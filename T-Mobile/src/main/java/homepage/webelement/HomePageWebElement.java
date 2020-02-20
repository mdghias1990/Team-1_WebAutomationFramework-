package homepage.webelement;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageWebElement extends WebAPI {

 // MenuBar
    public static final String xpathOfSearchButton ="//span[@class='d-inline show-on-sm-modal ng-tns-c0-0 ng-star-inserted']";
    //public static final String xpathOfSearchBox ="//form[@class='navbar__search-form ng-pristine ng-invalid ng-touched']//input[@id='nav_search_text']";

    public static  final String xpathOfWirelessButton ="//a[@id='universal-menu-0']";
    public static final String xpathOfBusinessButton ="//a[@id='universal-menu-1']";
    public static final String xpathOfPrepaidButton ="//a[@id='universal-menu-2']";
    public static final String xpathOfTvButton ="//a[@id='universal-menu-3']";
    public static final String xpathOfBankingButton ="//a[@id='universal-menu-4']";


    // Bottom links
    public static final String xpathOfPhonesDevices ="//a[@id='digital-footer-category-name-0']";
    public static final String xpathOfPhones ="//a[@id='digital-footer-categorized-link-0-0']";
    public static final String xpathOfTablets ="//a[@id='digital-footer-categorized-link-0-1']";
    public static final String xpathOfSmartWatches ="//a[@id='digital-footer-categorized-link-0-2']";

    @FindBy(how= How.XPATH, using=xpathOfSearchButton)
    public static WebElement searchButton;



    @FindBy(how= How.XPATH, using=xpathOfWirelessButton)
    public static WebElement wirelessButton;

    @FindBy(how= How.XPATH, using=xpathOfBusinessButton)
    public static WebElement businessButton;

    @FindBy(how= How.XPATH, using=xpathOfPrepaidButton)
    public static WebElement prepaidButton;

    @FindBy(how= How.XPATH, using=xpathOfTvButton)
    public static WebElement tvButton;

    @FindBy(how= How.XPATH, using=xpathOfBankingButton)
    public static WebElement bankingButton;


    @FindBy(how= How.XPATH, using=xpathOfPhonesDevices)
    public static WebElement phonesDevices;

    @FindBy(how= How.XPATH, using=xpathOfPhones)
    public static WebElement phones;

    @FindBy(how= How.XPATH, using=xpathOfTablets)
    public static WebElement tablets;

    @FindBy(how= How.XPATH, using=xpathOfSmartWatches)
    public static WebElement smartWatches;


    //  Making webElement in this class instead of Home class

   public static final String xpathOfAccessories ="//a[@id='digital-footer-categorized-link-0-3']";
   @FindBy(how= How.XPATH, using=xpathOfAccessories)
   public static WebElement accessories;

   public static final String xpathOfAppsConnectedDevices ="//a[@id='digital-footer-category-name-1']";
   @FindBy(how= How.XPATH, using=xpathOfAppsConnectedDevices)
   public static WebElement appsConnectedDevices;


   public static final String linkTextOfFamilyMode ="FamilyMo";
   @FindBy(how= How.PARTIAL_LINK_TEXT, using=linkTextOfFamilyMode)
   public static WebElement familyMode;

   public static final String linkTextOfDIGITS ="DIGI";
 @FindBy(how= How.PARTIAL_LINK_TEXT, using=linkTextOfDIGITS)
   public static WebElement dIGITS;


   public static final String linkTextOfSyncUPDRIVE ="SyncUP DRI";
  @FindBy(how= How.PARTIAL_LINK_TEXT, using=linkTextOfSyncUPDRIVE)
   public static WebElement syncUPDRIVE;



    public static final String linkTextOfPlansInformation ="Plans & informati";
    @FindBy(how= How.PARTIAL_LINK_TEXT, using=linkTextOfPlansInformation)
    public static WebElement plansInformation;


    public static final String linkTextOfPlansHome ="Plans ho";
    @FindBy(how= How.PARTIAL_LINK_TEXT, using=linkTextOfPlansHome)
    public static WebElement plansHome;

    public static final String linkTextOfOver55 ="55+";
    @FindBy(how= How.PARTIAL_LINK_TEXT, using=linkTextOfOver55)
    public static WebElement over55;

    public static final String linkTextOfMilitaryVeterans="Military & Vetera";
    @FindBy(how= How.PARTIAL_LINK_TEXT, using=linkTextOfMilitaryVeterans)
    public static WebElement militaryVeterans;

    public static final String xpathOfPrepaid ="//a[@id='digital-footer-categorized-link-2-3']";
    @FindBy(how= How.XPATH, using=xpathOfPrepaid)
    public static WebElement prepaid;

    public static final String xpathOfInsurance ="//a[@id='digital-footer-categorized-link-2-4']";
    @FindBy(how= How.XPATH, using=xpathOfInsurance)
    public static WebElement insurance;

    public static final String xpathOfDataPass ="//a[@id='digital-footer-categorized-link-2-5']";
    @FindBy(how= How.XPATH, using=xpathOfDataPass)
    public static WebElement dataPass;

    public static final String xpathOfSwitchTMobile ="//a[@id='digital-footer-category-name-3']";
    @FindBy(how= How.XPATH, using=xpathOfSwitchTMobile)
    public static WebElement switchTMobile;

    public static final String xpathOfWe_ll_Help_You_Join ="//a[@id='digital-footer-categorized-link-3-0']";
    @FindBy(how= How.XPATH, using=xpathOfWe_ll_Help_You_Join)
    public static WebElement we_ll_Help_You_Join;

    public static final String xpathOfSavingsCalculator ="//a[@id='digital-footer-categorized-link-3-1']";
    @FindBy(how= How.XPATH, using=xpathOfSavingsCalculator)
    public static WebElement savingsCalculator;

    public static final String xpathOfBringYourOwnDevice ="//a[@id='digital-footer-categorized-link-3-2']";
    @FindBy(how= How.XPATH, using=xpathOfBringYourOwnDevice)
    public static WebElement bringYourOwnDevice;

    public static final String xpathOfTradeInProgram ="//a[@id='digital-footer-categorized-link-3-3']";
    @FindBy(how= How.XPATH, using=xpathOfTradeInProgram)
    public static WebElement tradeInProgram;

    public static final String xpathOfNumberPorting ="//a[@id='digital-footer-categorized-link-3-4']";
    @FindBy(how= How.XPATH, using=xpathOfNumberPorting)
    public static WebElement numberPorting;

    public static final String xpathOfTMobileBenefits ="//a[@id='digital-footer-category-name-4']";
    @FindBy(how= How.XPATH, using=xpathOfTMobileBenefits)
    public static WebElement tMobileBenefits;

    public static final String xpathOfMagentaPlanBenefits ="//a[@id='digital-footer-categorized-link-4-1']";
    @FindBy(how= How.XPATH, using=xpathOfMagentaPlanBenefits)
    public static WebElement magentaPlanBenefits;

    public static final String xpathOfTravel ="//a[@id='digital-footer-categorized-link-4-1']";
    @FindBy(how= How.XPATH, using=xpathOfTravel)
    public static WebElement travel;

    public static final String xpathOfOrderInfo ="//a[@id='digital-footer-category-name-5']";
    @FindBy(how= How.XPATH, using=xpathOfOrderInfo)
    public static WebElement orderInfo;

    public static final String xpathOfCheckOrderStatus ="//a[@id='digital-footer-categorized-link-5-0']";
    @FindBy(how= How.XPATH, using=xpathOfCheckOrderStatus)
    public static WebElement checkOrderStatus;

    public static final String xpathOfViewReturnPolicy="//a[@id='digital-footer-categorized-link-5-1']";
    @FindBy(how= How.XPATH, using=xpathOfViewReturnPolicy)
    public static WebElement viewReturnPolicy;

    public static final String xpathOfRedeemARebate="//a[@id='digital-footer-categorized-link-5-2']";
    @FindBy(how= How.XPATH, using=xpathOfRedeemARebate)
    public static WebElement redeemARebate;

    public static final String xpathOfSupport="//a[@id='digital-footer-category-name-6']";
    @FindBy(how= How.XPATH, using=xpathOfSupport)
    public static WebElement support;

    public static final String xpathOfContactUs="//a[@id='digital-footer-categorized-link-6-0']";
    @FindBy(how= How.XPATH, using=xpathOfContactUs)
    public static WebElement contactUs;

    public static final String  xpathOfPlans="//a[@id='digital-footer-categorized-link-6-2']";
    @FindBy(how= How.XPATH, using=xpathOfPlans)
    public static WebElement plans;

    public static final String  xpathOfBilling="//a[@id='digital-footer-categorized-link-6-3']";
    @FindBy(how= How.XPATH, using=xpathOfBilling)
    public static WebElement billing;

    public static final String  xpathOfInternational="//a[@id='digital-footer-categorized-link-6-4']";
    @FindBy(how= How.XPATH, using=xpathOfInternational)
    public static WebElement international;

    public static final String  xpathOfMyAccount="//a[@id='digital-footer-category-name-7']";
    @FindBy(how= How.XPATH, using=xpathOfMyAccount)
    public static WebElement myAccount;

    public static final String  xpathOfPayMyBill="//a[@id='digital-footer-categorized-link-7-0']";
    @FindBy(how= How.XPATH, using=xpathOfPayMyBill)
    public static WebElement payMyBill;

    public static final String  xpathOfUpgrade="//a[@id='digital-footer-categorized-link-7-1']";
    @FindBy(how= How.XPATH, using=xpathOfUpgrade)
    public static WebElement upgrade;

    public static final String  xpathOfAddALine="//a[@id='digital-footer-categorized-link-7-2']";
    @FindBy(how= How.XPATH, using=xpathOfAddALine)
    public static WebElement addALine;

    public static final String  xpathOfMoreThanWireless="//a[@id='digital-footer-categorized-link-8-0']";
    @FindBy(how= How.XPATH, using=xpathOfMoreThanWireless)
    public static WebElement moreThanWireless;

    public static final String  xpathOfBusiness="//a[@id='digital-footer-categorized-link-8-0']";
    @FindBy(how= How.XPATH, using=xpathOfBusiness)
    public static WebElement business;

    public static final String  xpathOfTVision="//a[@id='digital-footer-categorized-link-8-2']";
    @FindBy(how= How.XPATH, using=xpathOfTVision)
    public static WebElement tVision;

    public static final String  xpathOfTMobileMONEY="//a[@id='digital-footer-categorized-link-8-3']";
    @FindBy(how= How.XPATH, using=xpathOfTMobileMONEY)
    public static WebElement tMobileMONEY;

    public static final String  xpathOfHomeInternet="//a[@id='digital-footer-categorized-link-8-4']";
    @FindBy(how= How.XPATH, using=xpathOfHomeInternet)
    public static WebElement homeInternet;

    public static final String  xpathOfIoT="//a[@id='digital-footer-categorized-link-8-5']";
    @FindBy(how= How.XPATH, using=xpathOfIoT)
    public static WebElement ioT;

    public static final String  xpathOfAboutTMobile="//a[@id='digital-footer-category-name-9']";
    @FindBy(how= How.XPATH, using=xpathOfAboutTMobile)
    public static WebElement aboutTMobile;

    public static final String  xpathOfOurStory="//a[@id='digital-footer-categorized-link-9-0']";
    @FindBy(how= How.XPATH, using=xpathOfOurStory)
    public static WebElement ourStory;

    public static final String  xpathOfNewsRoom="//a[@id='digital-footer-categorized-link-9-1']";
    @FindBy(how= How.XPATH, using=xpathOfNewsRoom)
    public static WebElement newsRoom;

    public static final String  xpathOfInvestorRelations="//a[@id='digital-footer-categorized-link-9-2']";
    @FindBy(how= How.XPATH, using=xpathOfInvestorRelations)
    public static WebElement investorRelations;

    public static final String  xpathOfCorporateResponsibility="//a[@id='digital-footer-category-name-10']";
    @FindBy(how= How.XPATH, using=xpathOfCorporateResponsibility)
    public static WebElement corporateResponsibility;

    public static final String  xpathOfCommunity="//a[@id='digital-footer-categorized-link-10-0']";
    @FindBy(how= How.XPATH, using=xpathOfCommunity)
    public static WebElement community;

    public static final String xpathOfSustainability ="//a[@id='digital-footer-categorized-link-10-1']";
    @FindBy(how= How.XPATH, using=xpathOfSustainability)
    public static WebElement sustainability;

    public static final String  xpathOfPrivacyCenter="//a[@id='digital-footer-categorized-link-10-2']";
    @FindBy(how= How.XPATH, using=xpathOfPrivacyCenter)
    public static WebElement privacyCenter;

    public static final String  xpathOfCareers="//a[@id='digital-footer-category-name-11']";
    @FindBy(how= How.XPATH, using=xpathOfCareers)
    public static WebElement careers;

    public static final String  xpathOfTMobileCareers="//a[@id='digital-footer-categorized-link-11-0']";
    @FindBy(how= How.XPATH, using=xpathOfTMobileCareers)
    public static WebElement mobileCareers;


// Mouse Hover
    public static final String xpathAndDevices="//div[@class='nav__link-container ng-tns-c2-2 ng-star-inserted']//a[@id='digital-header-nav-link-head-1']";

    public static final String xpathCellPhone="//span[contains(text(),'Cell phones')]";
    @FindBy(how= How.XPATH, using=xpathCellPhone)
    public static WebElement cellPhone;

    public static final String xpathOfSearchBox ="/html[1]/body[1]/tmo-digital-header[1]/header[1]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[4]/div[1]/tmo-search-bar[1]/div[1]/form[1]/input[1]";
    @FindBy(how= How.XPATH, using=xpathOfSearchBox)
    public static WebElement SearchBox;


    // LogIn Test
    public static final String xpathOfmyAccountButton ="//button[@id='user-links-dropdown']";
    @FindBy(how= How.XPATH, using=xpathOfmyAccountButton)
    public static WebElement accountButton;

    public static final String xpathOfLogInButton ="//a[@id='user-link-dropdown-item-0-0-0']";
    @FindBy(how= How.XPATH, using=xpathOfLogInButton)
    public static WebElement logInButton;




public static final String xpathaccountButton2 = "//button[@id='user-links-dropdown']";

    @FindBy(how= How.XPATH, using=xpathaccountButton2)
    public static WebElement accuntButton2;










































}
