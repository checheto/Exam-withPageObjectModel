package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.AccountConfirmationPage;
import pages.RegistrationPage;
import pages.ShoppingPage;

public class UserRegistrationTest extends BaseTest {
    @Test
    public static void userRegistrationTest() {
        ShoppingPage.goToShoppingPage();
        ShoppingPage.clickOnMyAccountElement();
        ShoppingPage.clickOnRegisterElement();
        RegistrationPage.writeInFirstNameField();
        RegistrationPage.writeInLastNameField();
        RegistrationPage.writeInEmailInputField();
        RegistrationPage.writeInTelephoneInputField();
        RegistrationPage.writeInPasswordInputField("parola123!");
        RegistrationPage.writeInConfirmPasswordInputField("parola123!");
        RegistrationPage.clickOnPrivacyPolicyCheckBox();
        RegistrationPage.clickOnContinueButton();
        AccountConfirmationPage.verifyRegistrationSuccess("Your Account Has Been Created!");
    }
}
