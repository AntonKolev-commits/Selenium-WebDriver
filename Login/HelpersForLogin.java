package firstSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelpersForLogin {
    public static WebDriver InitializeWebDriver(){
        System.setProperty("webdriver.chrome.driver" , "D:\\IT\\ChromeDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public static void login(WebDriver driver , String username, String password){
        WebElement usernameField = driver.findElement(By.name("usernameOrEmail"));
        usernameField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.id("defaultLoginFormPassword"));
        passwordField.sendKeys(password);
        WebElement signInButton = driver.findElement(By.xpath("//button[@id='sign-in-button']"));
        signInButton.click();


    }
    public static void navigateToLogin(WebDriver driver){
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement usernameField;
        usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-login")));
        usernameField.isDisplayed();
        loginLink.click();

    }
    public static void navigateToProfile(WebDriver driver){
        WebElement profileLink = driver.findElement(By.linkText("Profile"));
        profileLink.click();
    }
    public static void navigateToMainPage(WebDriver driver){
        driver.get("http://training.skillo-bg.com:4300/posts/all\r\n");
        String webPageTitle = driver.getTitle();
        assertEquals("ISkillo", webPageTitle);
    }
    public static void checkIfLoginSuccessfully(WebDriver driver){
        WebElement searchField = driver.findElement(By.id("search-bar"));
        boolean displayed = searchField.isDisplayed();
        assertTrue(displayed);
    }
    public static void checkIfLoginFailedMsgAppears(WebDriver driver){
        WebElement failedLoginMsg = driver.findElement(By.xpath("//*[contains(text(),'Wrong username or password!')]"));
        failedLoginMsg.isDisplayed();
    }
    public static void checkIfSignInButtonIsInActive(WebDriver driver){
        WebElement signInButton = driver.findElement(By.xpath("//button[@id='sign-in-button']"));
        signInButton.isEnabled();
    }
    public static void ClickOnRememberMeButton(WebDriver driver){
        WebElement checkboxRememberMe = driver.findElement(By.xpath("//input[@formcontrolname='rememberMe']"));
        checkboxRememberMe.click();
        assertTrue(checkboxRememberMe.isSelected());
    }
    public static void CheckIfRememberMeButtonIsWorkingCorrectly(WebDriver driver){
        WebElement usernameField = driver.findElement(By.name("usernameOrEmail"));
        String usernameText = usernameField.getText();
        assertEquals("" ,usernameText);
    }
    public static void CheckSignInButtonIsItEnable(WebDriver driver){
        WebElement signInButton = driver.findElement(By.xpath("//button[@id='sign-in-button']"));
        signInButton.isEnabled();
    }

}
