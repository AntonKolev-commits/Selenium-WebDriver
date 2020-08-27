package firstSeleniumTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ModifyYourProfileTests {
    WebDriver driver;
    @After
    public void closeWebDriver(){
        driver.close();
    }

    @Before
    public void loginInSiteAndEnterInProfileAndOpenModifyOption(){
        driver = HelpersForLogin.InitializeWebDriver();
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.login(driver,"Dadada","Dadada1");
        HelpersForLogin.navigateToProfile(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HelpersInHomepage.ClickOnModifyYourProfileButton(driver);
        ModifyYourProfileHelpers.checkIsModifyYourProfileIsOpened(driver);
}
    @org.junit.Test
    public void ModifyYourProfileSuccessfully() {
    ModifyYourProfileHelpers.usernameFieldModifyProfile(driver,"DrunDrun");
    ModifyYourProfileHelpers.passwordFieldModifyProfile(driver,"Drun1234");
    ModifyYourProfileHelpers.emailFieldModifyProfile(driver,"drun@abv.bg");
    ModifyYourProfileHelpers.confirmPasswordFieldModifyProfile(driver,"Drun1234");
    ModifyYourProfileHelpers.clickOnSaveButton(driver);

}
    @org.junit.Test
    public void ModifyYourProfileWithAlreadyTakenUsername() {
        ModifyYourProfileHelpers.usernameFieldModifyProfile(driver,"santa1");
        ModifyYourProfileHelpers.passwordFieldModifyProfile(driver,"Drun1234");
        ModifyYourProfileHelpers.emailFieldModifyProfile(driver,"drun@abv.bg");
        ModifyYourProfileHelpers.confirmPasswordFieldModifyProfile(driver,"Drun1234");
        ModifyYourProfileHelpers.clickOnSaveButton(driver);
        HelpersForRegistrationForm.usernameTakenMsgAppear(driver);
}
    @org.junit.Test
    public void ModifyYourProfileWithoutAdherePasswordPolicyWithBigLatter() {
        ModifyYourProfileHelpers.usernameFieldModifyProfile(driver,"DrunDrun");
        ModifyYourProfileHelpers.passwordFieldModifyProfile(driver,"drun1234");
        ModifyYourProfileHelpers.emailFieldModifyProfile(driver,"drun@abv.bg");
        ModifyYourProfileHelpers.confirmPasswordFieldModifyProfile(driver,"drun1234");
        ModifyYourProfileHelpers.clickOnSaveButton(driver);
        HelpersForRegistrationForm.invalidPasswordAlert(driver);
    }

    @org.junit.Test
    public void ModifyYourProfileWithoutAdherePasswordPolicyWithoutDigit() {
    ModifyYourProfileHelpers.usernameFieldModifyProfile(driver,"DrunDrun");
    ModifyYourProfileHelpers.passwordFieldModifyProfile(driver,"DrunDrun");
    ModifyYourProfileHelpers.emailFieldModifyProfile(driver,"drun@abv.bg");
    ModifyYourProfileHelpers.confirmPasswordFieldModifyProfile(driver,"DrunDrun");
    ModifyYourProfileHelpers.clickOnSaveButton(driver);
    HelpersForRegistrationForm.invalidPasswordAlert(driver);
}
    @org.junit.Test
    public void ModifyYourProfileWithoutWriteYourPassword() {
        ModifyYourProfileHelpers.usernameFieldModifyProfile(driver,"DrunDrun");
        ModifyYourProfileHelpers.passwordFieldModifyProfile(driver,"");
        ModifyYourProfileHelpers.emailFieldModifyProfile(driver,"drun@abv.bg");
        ModifyYourProfileHelpers.confirmPasswordFieldModifyProfile(driver,"");
        ModifyYourProfileHelpers.clickOnSaveButton(driver);
        HelpersForRegistrationForm.invalidPasswordAlert(driver);
    }
    @org.junit.Test
    public void ModifyYourProfilePasswordToBeOnlyBlanks() {
        ModifyYourProfileHelpers.usernameFieldModifyProfile(driver,"DrunDrun");
        ModifyYourProfileHelpers.passwordFieldModifyProfile(driver,"      ");
        ModifyYourProfileHelpers.emailFieldModifyProfile(driver,"drun@abv.bg");
        ModifyYourProfileHelpers.confirmPasswordFieldModifyProfile(driver,"      ");
        ModifyYourProfileHelpers.clickOnSaveButton(driver);
        HelpersForRegistrationForm.invalidPasswordAlert(driver);
    }
}




