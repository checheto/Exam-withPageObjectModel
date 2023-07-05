package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage extends BasePage {
    @FindBy(css = "#top-links li[class='dropdown']>a")
    private static WebElement myAccountElement;
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    private static WebElement registerElement;
    private static String ShoppingPageUrl = "http://shop.pragmatic.bg/";

    static {
        PageFactory.initElements(driver, ShoppingPage.class);
    }
public static void goToShoppingPage(){
        driver.get(ShoppingPageUrl);
}
    public static void clickOnMyAccountElement() {
        clickOnElement(myAccountElement);
    }

    public static void clickOnRegisterElement() {
        clickOnElement(registerElement);
    }
}
