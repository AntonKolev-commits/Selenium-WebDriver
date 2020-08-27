package firstSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class HelpersForNewPost {

    public static void clickOnNewPostButton (WebDriver driver){
        WebElement newPostButton = driver.findElement(By.xpath("//a[@id='nav-link-new-post']"));
        newPostButton.click();
    }
    public static void uploadAnIMG (WebDriver driver) {
        WebElement browseButton = driver.findElement(By.xpath("//input[@class='file ng-untouched ng-pristine ng-invalid']"));
        browseButton.sendKeys("C:\\Users\\Anton Kolev\\Desktop\\Screenshot_1.png");
        WebElement imageUploaded = driver.findElement(By.xpath("//img[@class='image-preview']"));
        assertTrue(imageUploaded.isDisplayed());
    }
    public static void enterCaption(WebDriver driver, String caption){
        WebElement captionOfThePost = driver.findElement(By.xpath("//input[@placeholder='Enter you post caption here']"));
        captionOfThePost.sendKeys(caption);
    }
    public static void makePostPrivate(WebDriver driver){
        WebElement postPrivate = driver.findElement(By.xpath("//label[@class='post-status-label custom-control-label active']"));
        postPrivate.click();
    }
    public static void createPostButtonClick(WebDriver driver){
        WebElement createPost = driver.findElement(By.xpath("//button[@id='create-post']"));
        createPost.click();
    }
    public static void failMsgCantCreatePost(WebDriver driver){
        WebElement attentionYouCantCreatePost = driver.findElement(By.xpath("//div[@class='toast-message ng-star-inserted']"));
        attentionYouCantCreatePost.isDisplayed();
    }
    public static void authorizationForCreatedPostSuccessfully(WebDriver driver){
        WebElement profile = driver.findElement(By.xpath("//div[@class='edit-profile-pic ng-star-inserted']"));
        profile.isDisplayed();
    }
    public static void clickingOnXButton(WebDriver driver){
        WebElement escapeButton = driver.findElement(By.xpath("//i[@class='fas fa-times']"));
        escapeButton.click();
    }
    public static void redirectedToTheProfile(WebDriver driver){
        WebElement profile = driver.findElement(By.xpath("//div[@class='edit-profile-pic ng-star-inserted']"));
        profile.isDisplayed();
    }
    public static void checkPostIsItPrivate(WebDriver driver){
        WebElement privateButton = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[2]/app-profile[1]/div[1]/div[2]/app-profile-posts-section" +
                "[1]/div[1]/div[1]/div[2]/div[1]/label[3]/input[1]"));
        privateButton.click();
        //WebElement img = driver.findElement(By.xpath("//app-post[1]//div[1]//div[2]//div[1]//i[1]"));
       // img.isDisplayed();
    }
    public static void newPostButtonFromProfile(WebDriver driver){
        WebElement newPostButtonFromProfile = driver.findElement(By.xpath("//i[@class='far fa-plus-square fa-lg']"));
        newPostButtonFromProfile.click();
    }
    }


