package firstSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class HelpersInHomepage {
    public static WebDriver InitializeWebDriver(){
        System.setProperty("webdriver.chrome.driver" , "D:\\IT\\ChromeDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public static void ClickOnLogOutButton(WebDriver driver){
        WebElement logOutButton = driver.findElement(By.xpath("//i[@class='fas fa-sign-out-alt fa-lg']"));
        logOutButton.click();
    }
    public static void CheckIfSearchBarIsAvailable(WebDriver driver){
        WebElement searchBar = driver.findElement(By.id("search-bar"));
        searchBar.isDisplayed();
    }
    public static void CheckCanYouLikeThePost(WebDriver driver){
        WebElement likeButton = driver.findElement(By.className("far fa-heart fa-2x"));
        likeButton.click();
    }
    public static void CheckIfItsDisplayLikeMsg(WebDriver driver){
        WebElement postLikeDisplayedMsg = driver.findElement(By.id("toast-container"));
        postLikeDisplayedMsg.isDisplayed();
    }
    public static void clickOnFirstPost(WebDriver driver){
        WebElement postClicked = driver.findElement(By.className("post-feed-img"));
        postClicked.click();
    }
    public static void CheckIfFirstPostIsOpened(WebDriver driver){
       WebElement commentField = driver.findElement(By.xpath("//input[@placeholder='Comment here']"));
       commentField.isDisplayed();
    }
    public static void CheckIfCreationDateIsDisplayed(WebDriver driver){
        WebElement creationDate = driver.findElement(By.xpath("//input[@placeholder='Comment here']"));
        creationDate.isDisplayed();
    }
    public static void CheckPostUserIsDisplayed(WebDriver driver){
        WebElement postUser = driver.findElement(By.className("post-user"));
        postUser.isDisplayed();
    }
    public static void ClickOnProfileButton(WebDriver driver){
        WebElement profileButton = driver.findElement(By.id("nav-link-profile"));
        profileButton.click();
    }
    public static void ClickOnModifyYourProfileButton(WebDriver driver){
        WebElement modifyYourProfileButton = driver.findElement(By.xpath("//i[@class='fas fa-user-edit ng-star-inserted']"));
        modifyYourProfileButton.click();
    }
    public static void CheckModifyProfileOptionIsOpened(WebDriver driver){
        WebElement modifyProfileWindow = driver.findElement(By.className("modal-content"));
        modifyProfileWindow.isDisplayed();
    }
    public static void ModifyYourProfile(WebDriver driver){
        WebElement username = driver.findElement(By.className("col-8"));
        username.sendKeys("santa1");
        //WebElement email = driver.findElement(By.className(""))
    }
    public static void ClickOnYourAllPosts(WebDriver driver){
        WebElement buttonAll = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[2]/app-profile[1]/div[1]/div[2]/app-profile-posts-section[1]/div[1]/div[1]/div[2]/div[1]"));
        //Sorry for the xpath but I can't locate it better!
        buttonAll.click();
    }
    public static void CheckAllYourPostsIsDisplayed(WebDriver driver){
        WebElement allYourPosts = driver.findElement(By.className("overlay-container"));
        allYourPosts.isDisplayed();
    }
    public static void ClickOnHomepageButton(WebDriver driver){
        WebElement logoButton = driver.findElement(By.id("homeIcon"));
        logoButton.click();
    }
    public static void VersionOfTheSite(WebDriver driver){
        WebElement version = driver.findElement(By.xpath("//*[contains(text(),'Version: 2020.3.2.4300')]"));
        version.isDisplayed();
        String version1 = version.getText();
        assertEquals("Version: 2020.3.2.4300",version1);
    }
    public static void TechnologiesOfTheSite(WebDriver driver){
        WebElement technologies = driver.findElement(By.xpath("//h6[contains(text(),'Technologies:')]"));
        technologies.isDisplayed();
        String technologies1 = technologies.getText();
        assertEquals("Technologies:", technologies1);
    }
    public static void SendKeysToSearchBar(WebDriver driver){
        WebElement searchBar = driver.findElement(By.id("search-bar"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchBar.sendKeys("anton");

    }
    public static void CheckSearchIsItDisplayUsers(WebDriver driver){
        WebElement usersInSearchBar = driver.findElement(By.xpath("//a[contains(text(),'AntonKolev')]"));
        String usersSearchBar = usersInSearchBar.getText();
        assertEquals("AntonKolev", usersSearchBar);
    }
    public static void SendKeysToSearchBarAndSubmitit(WebDriver driver){
        WebElement searchBar = driver.findElement(By.id("search-bar"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchBar.sendKeys("GolemPustinqk");
        searchBar.click();
    }

}
