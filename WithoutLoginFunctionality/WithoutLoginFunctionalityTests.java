package firstSeleniumTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WithoutLoginFunctionalityTests {
    WebDriver driver;
    @After
    public void closeWebDriver(){
        driver.close();
    }

    @Before
    public void initializeWebDriver(){
    driver = HelpersForLogin.InitializeWebDriver();
     HelpersForLogin.navigateToMainPage(driver);
}
    @org.junit.Test
    public  void IsPublicPostsAreVisibileWithoutLogin(){
        HelpersWithoutLoginFunctionality.withoutLoginSeeFirstPost(driver);
        HelpersWithoutLoginFunctionality.scrollThePage(driver);
        HelpersWithoutLoginFunctionality.withoutLoginSeeFirstPost(driver);
        HelpersWithoutLoginFunctionality.scrollThePage(driver);
        HelpersWithoutLoginFunctionality.withoutLoginSeeFirstPost(driver);
    }
    @org.junit.Test
    public void CheckWithoutLoginLimitedVisibilityOfUserInfo(){
        HelpersWithoutLoginFunctionality.withoutLoginSeeFirstPost(driver);
        HelpersWithoutLoginFunctionality.clickOnProfileWithoutLogin(driver);
        HelpersWithoutLoginFunctionality.redirectedToTheLoginForm(driver);
    }
    @org.junit.Test
    public void CheckCanYouCommentPostWithoutLogin(){
        HelpersInHomepage.clickOnFirstPost(driver);
        HelpersInHomepage.CheckIfFirstPostIsOpened(driver);
        HelpersWithoutLoginFunctionality.commentPost(driver);
        HelpersWithoutLoginFunctionality.redirectedToTheLoginForm(driver);
    }
    @org.junit.Test
    public void CheckCanYouLikePostsWithoutLogin(){
        HelpersInHomepage.clickOnFirstPost(driver);
        HelpersInHomepage.CheckIfFirstPostIsOpened(driver);
        HelpersWithoutLoginFunctionality.isItDisableLikeButton(driver);
    }
    @org.junit.Test
    public void CheckDoYouSeeCountOfLikes(){
        HelpersForLogin.InitializeWebDriver();
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.login(driver,"santa1","Santa1");
        HelpersForLogin.checkIfLoginSuccessfully(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HelpersInHomepage.SendKeysToSearchBarAndSubmitit(driver);
        HelpersWithoutLoginFunctionality.clickOnSomePostInUserProfile(driver);
        HelpersWithoutLoginFunctionality.likePostInTheUsernameProfile(driver);
        HelpersWithoutLoginFunctionality.checkIfPostIsLiked(driver);

    }
}
