package firstSeleniumTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomepageTests {
    WebDriver driver;
   @After
    public void closeWebDriver(){
        driver.close();
    }

    @Before
    public void loginInSite(){
        driver = HelpersForLogin.InitializeWebDriver();
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.login(driver,"santa1","Santa1");
    }
    @org.junit.Test
    public void checkCanYouLikePosts(){
        HelpersInHomepage.CheckCanYouLikeThePost(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HelpersInHomepage.CheckIfItsDisplayLikeMsg(driver);
    }
    @org.junit.Test
    public void CheckWhenYouClickOnPostIfItsDisplayedNewWindow(){
        HelpersInHomepage.clickOnFirstPost(driver);
        HelpersInHomepage.CheckIfFirstPostIsOpened(driver);
    }
    @org.junit.Test
    public void CheckThatYouCanSeeTheCreationDateOfThePostAndUserCreated(){
        HelpersInHomepage.clickOnFirstPost(driver);
        HelpersInHomepage.CheckIfFirstPostIsOpened(driver);
        HelpersInHomepage.CheckIfCreationDateIsDisplayed(driver);
        HelpersInHomepage.CheckPostUserIsDisplayed(driver);
    }
    @org.junit.Test
    public void CheckHaveYouGotOptionToModifyYourProfile(){
       HelpersInHomepage.ClickOnProfileButton(driver);
        HelpersInHomepage.ClickOnModifyYourProfileButton(driver);
        HelpersInHomepage.CheckModifyProfileOptionIsOpened(driver);
    }
    @org.junit.Test
    public void CheckCanYouSeeAllYourPosts(){
       HelpersInHomepage.ClickOnProfileButton(driver);
       HelpersInHomepage.ClickOnYourAllPosts(driver);
       HelpersInHomepage.CheckAllYourPostsIsDisplayed(driver);
    }
    @org.junit.Test
    public void CheckLogoWhenYouClickedAreYouRedirectedToTheHomepage(){
       HelpersInHomepage.ClickOnProfileButton(driver);
       HelpersInHomepage.ClickOnHomepageButton(driver);
       HelpersInHomepage.clickOnFirstPost(driver);
    }
    @org.junit.Test
    public void CheckIsItDisplayVersionOfTheSiteAndTechnologies(){
       HelpersInHomepage.VersionOfTheSite(driver);
       HelpersInHomepage.TechnologiesOfTheSite(driver);
    }
    @org.junit.Test
    public void checkSearchFunctionality(){
       HelpersInHomepage.CheckIfSearchBarIsAvailable(driver);
        HelpersInHomepage.SendKeysToSearchBar(driver);
        HelpersInHomepage.CheckSearchIsItDisplayUsers(driver);
    }
}
