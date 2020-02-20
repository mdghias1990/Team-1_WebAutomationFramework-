package homepage.pageobject;

import homepage.webelement.HomePageWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends HomePageWebElement {

// ====================PageFactory Approach==============



    public  static void clickOn(WebElement element) {
        driver.manage().window().maximize();
        element.click();
    }
//    public static void sendKeysSearchBox(String key) {
//        searchBox.sendKeys(key);
//    }

    public static void clickWirelessButton() {
        wirelessButton.click();
  }

    public static void clickBusinessButton() {
        businessButton.click();
  }

    public static void clickPrepaidButton() {
        prepaidButton.click();
  }

   public static void clickTvButton() {
        tvButton.click();
  }

    public static void clickBankingButton() {
        bankingButton.click();
  }


    public static void mouseHover(String xPath) {
        Actions action=new Actions(driver);
        WebElement target=driver.findElement(By.xpath(xPath));
        action.moveToElement(target).perform();

        clickOn(cellPhone);
    }

    public static void clickOnSearch() {
        clickOn(searchButton);
    }

    public static void writeInsideBox(String value) {
        SearchBox.sendKeys(value, Keys.ENTER);
    }
    public static void searchMobile() {
        writeInsideBox("Mobile");
    }



//    @FindBy(how= How.XPATH, using=xpathOfSearchButton)
//    public static WebElement searchButton;
//    public static WebElement getSearchButton() {
//        return searchButton;
//    }
//    public static void setSearchButton() {
//        getSearchButton().click();
//    }    @FindBy(how= How.XPATH, using=xpathOfSearchButton)
//    public static WebElement searchButton;
//    public static WebElement getSearchButton() {
//        return searchButton;
//    }
//    public static void setSearchButton() {
//        getSearchButton().click();
//    }
}
