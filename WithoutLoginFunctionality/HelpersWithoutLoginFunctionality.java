package firstSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class HelpersWithoutLoginFunctionality {

    public static void withoutLoginSeeFirstPost(WebDriver driver){
        WebElement seeIMGFirstPost = driver.findElement(By.className("post-feed-img"));
        seeIMGFirstPost.isDisplayed();
        WebElement seePostDate = driver.findElement(By.className("post-date"));
        seePostDate.isDisplayed();
        WebElement seePostInfo = driver.findElement(By.className("post-info"));
        seePostInfo.isDisplayed();
    }
    public static void scrollThePage(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void clickOnProfileWithoutLogin(WebDriver driver){
        WebElement publicUsername = driver.findElement(By.className("post-user"));
        publicUsername.click();
    }
    public static void redirectedToTheLoginForm(WebDriver driver){
        WebElement singInButton = driver.findElement(By.id("sign-in-button"));
        singInButton.isDisplayed();
    }
    public static void commentPost (WebDriver driver){
        WebElement commentField = driver.findElement(By.xpath("//input[@placeholder='Comment here']"));
        commentField.sendKeys("abc");
        commentField.submit();
    }
    public static  void isItDisableLikeButton (WebDriver driver){
        WebElement disableLikeButton = driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-post-modal[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/i[1]"));
        boolean disable = disableLikeButton.isEnabled();
        if (disable == true){
            System.out.println("IsEnable");
        }else {
            System.out.println("IsDisable");
        }
        assertFalse(disable);
    }
    public static void clickOnSomePostInUserProfile(WebDriver driver){
        WebElement postInProfile = driver.findElement(By.className("gallery-item-info"));
        postInProfile.click();
    }
    public static void likePostInTheUsernameProfile(WebDriver driver){
        WebElement likeButtonInProfile = driver.findElement(By.className("like far fa-heart fa-2x ng-star-inserted"));
        likeButtonInProfile.click();
    }
    public static void checkIfPostIsLiked(WebDriver driver){
        WebElement greenMsgAppear = driver.findElement(By.xpath("//div[contains(text(),'Post liked')]"));
        greenMsgAppear.isDisplayed();
    }
}
