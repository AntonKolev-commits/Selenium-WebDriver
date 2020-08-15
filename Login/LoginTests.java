package firstSeleniumTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class LoginTests {
    WebDriver driver;
    @After
    public void closeWebDriver(){
        driver.close();
    }
    @Before
    public void initializeWebDriver(){
        driver = HelpersForLogin.InitializeWebDriver();
    }

    @org.junit.Test
    public void loginSuccessfully() {
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.ClickOnRememberMeButton(driver);
        HelpersForLogin.login(driver, "santa1", "Santa1");
        HelpersForLogin.checkIfLoginSuccessfully(driver);
        HelpersForLogin.navigateToProfile(driver);

    }

    @org.junit.Test
    public void loginFailedWithIncorrectUsername() {
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.login(driver, "alabala", "Santa1");
        HelpersForLogin.checkIfLoginFailedMsgAppears(driver);

    }

    @org.junit.Test
    public void loginFailedWithIncorrectPassword() {
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.login(driver, "santa1", "Santa123");
        HelpersForLogin.checkIfLoginFailedMsgAppears(driver);
    }

    @org.junit.Test
    public void loginFailedWithBlankInUsername() {
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.login(driver, " santa1", "Santa1");
        HelpersForLogin.checkIfLoginFailedMsgAppears(driver);
    }

    @org.junit.Test
    public void loginFailedWithEmailInsteadUsername() {
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.login(driver, "santa1@abv.bg", "Santa1");
        HelpersForLogin.checkIfLoginFailedMsgAppears(driver);
    }

    @org.junit.Test
    public void loginFailedWithBGSymbolInsteadEN() {
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.login(driver, "sАnta1@abv.bg", "Santa1");
        HelpersForLogin.checkIfLoginFailedMsgAppears(driver);
    }

    @org.junit.Test
    public void loginFailedWithSmallLatterInPassword() {
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.login(driver, "sАnta1@abv.bg", "santa1");
        HelpersForLogin.checkIfLoginFailedMsgAppears(driver);
    }
    @org.junit.Test
    public void cantLoginWithoutPasswordOrUsername() {
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.login(driver, "sАnta1@abv.bg", "");
        HelpersForLogin.checkIfSignInButtonIsInActive(driver);
}

    @org.junit.Test
    public void loginSuccessfullyThenLogOutAndCheckRememberButtonIsWorking() {
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.ClickOnRememberMeButton(driver);
        HelpersForLogin.login(driver, "santa1", "Santa1");
        HelpersForLogin.checkIfLoginSuccessfully(driver);
        HelpersForLogin.navigateToProfile(driver);
        HelpersInHomepage.ClickOnLogOutButton(driver);
        HelpersForLogin.CheckIfRememberMeButtonIsWorkingCorrectly(driver);
    }
    @org.junit.Test
    public void checkSignInButtonIsItWorkingWithoutUsername() {
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.CheckSignInButtonIsItEnable(driver);
    }
}