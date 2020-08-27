package firstSeleniumTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class NewPostsTest {
    WebDriver driver;

    @After
    public void closeWebDriver() {
        driver.close();
    }

    @Before
    public void loginInSiteAndEnterInNewPostFunctionality() {
        driver = HelpersForLogin.InitializeWebDriver();
        HelpersForLogin.navigateToMainPage(driver);
        HelpersForLogin.navigateToLogin(driver);
        HelpersForLogin.login(driver, "santa1", "Santa1");
        HelpersForLogin.navigateToProfile(driver);

    }

    @org.junit.Test
    public void makeNewPostSuccessfully() {
        HelpersForNewPost.clickOnNewPostButton(driver);
        HelpersForNewPost.uploadAnIMG(driver);
        HelpersForNewPost.enterCaption(driver, "My first Selenium post!");
        HelpersForNewPost.createPostButtonClick(driver);
        HelpersForNewPost.authorizationForCreatedPostSuccessfully(driver);
    }

    @org.junit.Test
    public void tryToMakeNewPostWithoutCaption() {
        HelpersForNewPost.clickOnNewPostButton(driver);
        HelpersForNewPost.uploadAnIMG(driver);
        HelpersForNewPost.enterCaption(driver, "");
        HelpersForNewPost.createPostButtonClick(driver);
        HelpersForNewPost.failMsgCantCreatePost(driver);
    }

    @org.junit.Test
    public void tryToMakePostCaptionWith101symbols() {
        HelpersForNewPost.clickOnNewPostButton(driver);
        HelpersForNewPost.uploadAnIMG(driver);
        HelpersForNewPost.enterCaption(driver, "alalalalallalalalalallalalalalalalalallalalalalalalalala" +
                "lalalalalalalalallaalallalalalalalalaalallala");
        HelpersForNewPost.createPostButtonClick(driver);
        HelpersForNewPost.failMsgCantCreatePost(driver);

    }

    @org.junit.Test
    public void tryToMakePostCaptionWith99symbols() {
        HelpersForNewPost.clickOnNewPostButton(driver);
        HelpersForNewPost.uploadAnIMG(driver);
        HelpersForNewPost.enterCaption(driver, "alalalalallalalalalallalalalalalalalallalalalalalalalala" +
                "lalalalalalalalallaalallalalalalalalaalalla");
        HelpersForNewPost.createPostButtonClick(driver);
        HelpersForNewPost.authorizationForCreatedPostSuccessfully(driver);

    }
    @org.junit.Test
    public void fillTheFieldsOfNewPostThenClickX() {
        HelpersForNewPost.clickOnNewPostButton(driver);
        HelpersForNewPost.uploadAnIMG(driver);
        HelpersForNewPost.enterCaption(driver, "My first Selenium post!");
        HelpersForNewPost.clickingOnXButton(driver);
        HelpersForNewPost.redirectedToTheProfile(driver);
    }
    @org.junit.Test
    public void makeNewPostSuccessfullyButToBePrivate() {
        HelpersForNewPost.clickOnNewPostButton(driver);
        HelpersForNewPost.uploadAnIMG(driver);
        HelpersForNewPost.enterCaption(driver, "My first Selenium post!!");
        HelpersForNewPost.makePostPrivate(driver);
        HelpersForNewPost.createPostButtonClick(driver);
        HelpersForNewPost.authorizationForCreatedPostSuccessfully(driver);
    }
    @org.junit.Test
    public void checkPostIsItPrivate(){
        HelpersForLogin.navigateToProfile(driver);
        HelpersForNewPost.checkPostIsItPrivate(driver);
    }
    @org.junit.Test
    public void makeNewPostWithProfileNewPostButton(){
        HelpersForNewPost.newPostButtonFromProfile(driver);
        HelpersForNewPost.uploadAnIMG(driver);
        HelpersForNewPost.enterCaption(driver, "My first Selenium post!");
        HelpersForNewPost.createPostButtonClick(driver);
        HelpersForNewPost.authorizationForCreatedPostSuccessfully(driver);
    }
    @org.junit.Test
    public void makeNewPostWithProfileNewPostButtonButCaptionToBeMoreThan100symbols(){
        HelpersForNewPost.newPostButtonFromProfile(driver);
        HelpersForNewPost.uploadAnIMG(driver);
        HelpersForNewPost.enterCaption(driver, "lalalalalalalalallaalallalalalalalalaalallal" +
                "alalalalalalalalallaalallalalalalalalaalallalalalalalalalalalallaalallalalalalalalaalallala");
        HelpersForNewPost.createPostButtonClick(driver);
        HelpersForNewPost.failMsgCantCreatePost(driver);
}
    @org.junit.Test
    public void tryToMakeNewPostWithoutCaptionInProfileForm() {
        HelpersForNewPost.newPostButtonFromProfile(driver);
        HelpersForNewPost.uploadAnIMG(driver);
        HelpersForNewPost.enterCaption(driver, "");
        HelpersForNewPost.createPostButtonClick(driver);
        HelpersForNewPost.failMsgCantCreatePost(driver);
    }
}
