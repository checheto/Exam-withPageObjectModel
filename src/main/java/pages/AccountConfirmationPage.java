package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.WaitTool;

public class AccountConfirmationPage extends BasePage {
    static {
        PageFactory.initElements(driver, AccountConfirmationPage.class);
    }
    @FindBy(css = "#content>h1")
    private static WebElement confirmationLabel;

public static void verifyRegistrationSuccess(String expectedText){
    WaitTool.waitForElementVisibility(By.cssSelector("#content>h1"), 10);
    Assert.assertEquals(confirmationLabel.getText(), expectedText);
}


}
