package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitTool;
import org.apache.commons.lang3.RandomStringUtils;

public class RegistrationPage extends BasePage {
    static {
        PageFactory.initElements(driver, RegistrationPage.class);
    }

    @FindBy(id = "input-firstname")
    private static WebElement firstNameElementInputField;
    @FindBy(id = "input-lastname")
    private static WebElement lastNameElementInputField;
    @FindBy(id = "input-email")
    private static WebElement emailElementInputField;
    @FindBy(id = "input-telephone")
    private static WebElement telephoneElementInputField;
    @FindBy(id = "input-password")
    private static WebElement passwordInputField;
    @FindBy(id = "input-confirm")
    private static WebElement confirmPasswordInputField;
    @FindBy(xpath = "//*[@type='checkbox']")
    private static WebElement privacyPolicyCheckBox;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    private static WebElement continueButtonElement;

    public static void writeInFirstNameField() {
        WaitTool.waitForElementVisibility(By.id("input-firstname"), 10);
        String firstNameInput = RandomStringUtils.randomAlphabetic(7);
        firstNameElementInputField.sendKeys(firstNameInput);
    }
    public static void writeInLastNameField() {
        String lastNameInput = RandomStringUtils.randomAlphabetic(9);
        lastNameElementInputField.sendKeys(lastNameInput);
    }
    public static void writeInEmailInputField(){
        String prefix = RandomStringUtils.randomAlphabetic(7);
        String sufix = RandomStringUtils.randomAlphabetic(5);
        String domain = RandomStringUtils.randomAlphabetic(3);
        String emailAddress = prefix + "@" + sufix + "." + domain;
        emailElementInputField.sendKeys(emailAddress);
    }
    public static void writeInTelephoneInputField(){
        String telephoneNumber = RandomStringUtils.randomNumeric(10);
        telephoneElementInputField.sendKeys(telephoneNumber);
    }
    public static void writeInPasswordInputField(String password){
        passwordInputField.sendKeys(password);
    }
    public static void writeInConfirmPasswordInputField(String password){
        confirmPasswordInputField.sendKeys(password);
    }
    public static void clickOnPrivacyPolicyCheckBox(){
        clickOnElement(privacyPolicyCheckBox);
    }
    public static void clickOnContinueButton(){
        clickOnElement(continueButtonElement);
    }

}
