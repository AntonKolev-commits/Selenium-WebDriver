package firstSeleniumTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class RegistrationFormTests {
    WebDriver driver;

     @After
     public void closeWebDriver(){
         driver.close();
     }
    @Before
    public void initializeWebDriver() {
        driver = HelpersForLogin.InitializeWebDriver();
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForRegistrationForm.goToRegistrationForm(driver);

    }

    @org.junit.Test
    public void makeRegistrationSuccessfully() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.clickOnSignInButton(driver);
    }
    @org.junit.Test
    public void makeRegistrationUsernameFirstLatterToBeInBGWhichIsAlreadyTaken() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Мrun12345");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.SignInButtonIsDisable(driver);
    }

    @org.junit.Test
    public void TryToMakeRegistrationUsernameWith21Symbols() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "TestUserUserUserUserU");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.SignInButtonIsDisable(driver);
    }
    @org.junit.Test
    public void TryToMakeRegistrationAlreadyTakenUsernameButWithBlankAtLast() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Test123 ");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.SignInButtonIsDisable(driver);
    }
    @org.junit.Test
    public void TryToMakeRegistrationAlreadyTakenUsernameButWithBlankAtFirst() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, " Test123");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.SignInButtonIsDisable(driver);
    }

    @org.junit.Test
    public void TryToMakeRegistrationUsernameWith3Symbols() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Tes");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.SignInButtonIsDisable(driver);
    }
    @org.junit.Test
    public void TryToMakeRegistrationUsernameTheSameLikeEmail() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.SignInButtonIsDisable(driver);
    }

    @org.junit.Test
    public void TryToMakeRegistrationUsernameWith20Symbols() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "TestUserUserUserUses");

        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.clickOnSignInButton(driver);
    }

    @org.junit.Test
    public void TryToMakeRegistrationWithAlreadyTakenEmail() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Mrun12345213");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.clickOnSignInButton(driver);
        HelpersForRegistrationForm.emailTakenMsgAppear(driver);
    }

    @org.junit.Test
    public void TryToMakeRegistrationWithInvalidEmail() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Mrun1234512");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.validationIfEmailIsInvalid(driver);

    }

    @org.junit.Test
    public void TryToMakeRegistrationWithInvalidEmail1() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Mrun1234512");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.validationIfEmailIsInvalid(driver);
    }
    @org.junit.Test
    public void TryToMakeRegistrationWithValidEmailButWithBlankAtLast() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Mrun1234512");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg ");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.validationIfEmailIsInvalid(driver);
    }
    @org.junit.Test
    public void TryToMakeRegistrationWithValidEmailButWithBlankAtFirst() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Mrun1234512");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, " mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.validationIfEmailIsInvalid(driver);
    }
    @org.junit.Test
    public void TryToMakeRegistrationWithInvalidPasswordWithoutBigLatter() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Mrun1234512");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "mrun12345");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "mrun12345");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.invalidPasswordAlert(driver);
        HelpersForRegistrationForm.SignInButtonIsDisable(driver);
    }
    @org.junit.Test
    public void TryToMakeRegistrationWithInvalidPasswordWithoutDigit() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Mrun1234512");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrunmrun");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrunmrun");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.invalidPasswordAlert(driver);
        HelpersForRegistrationForm.SignInButtonIsDisable(driver);
    }
    @org.junit.Test
    public void TryToMakeRegistrationWithInvalidPasswordWith5Symbols() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Mrun1234512");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrunm");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrunm");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.invalidPasswordAlert(driver);
        HelpersForRegistrationForm.SignInButtonIsDisable(driver);
    }
    @org.junit.Test
    public void TryToMakeRegistrationWithInvalidConfirmPassword() {
        HelpersForRegistrationForm.fillTheFieldUsername(driver, "Mrun1234512");
        HelpersForRegistrationForm.fillTheFieldPassword(driver, "Mrun1234");
        HelpersForRegistrationForm.fillTheFieldEmail(driver, "mrun12453@abv.bg");
        HelpersForRegistrationForm.fillTheFieldConfirmPass(driver, "Mrun1111");
        HelpersForRegistrationForm.fillTheBirthDate(driver, "10", "10", "1958");
        HelpersForRegistrationForm.fillThePublicInfoField(driver, "mrunmrun");
        HelpersForRegistrationForm.invalidPasswordAlert(driver);
        HelpersForRegistrationForm.SignInButtonIsDisable(driver);
    }
}
