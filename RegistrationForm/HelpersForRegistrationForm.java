package firstSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class HelpersForRegistrationForm {
    public static void goToRegistrationForm(WebDriver driver){
        WebElement registrationFormClick = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registrationFormClick.click();
    }
    public static void fillTheFieldUsername(WebDriver driver,String username){
        WebElement usernameFieldInRegistrationForm = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        usernameFieldInRegistrationForm.sendKeys(username);
    }
    public static void fillTheFieldPassword(WebDriver driver , String password){
        WebElement passwordFieldInRegistrationForm = driver.findElement(By.id("defaultRegisterFormPassword"));
        passwordFieldInRegistrationForm.sendKeys(password);
    }
    public static void fillTheFieldEmail(WebDriver driver , String email){
        WebElement emailFieldInRegistrationForm = driver.findElement(By.xpath("//input[@placeholder='email']"));
        emailFieldInRegistrationForm.sendKeys(email);
    }
    public static void fillTheFieldConfirmPass(WebDriver driver, String password){
        WebElement confirmPasswordFieldInRegistrationForm = driver.findElement(By.xpath("//input[@id='defaultRegisterPhonePassword']"));
        confirmPasswordFieldInRegistrationForm.sendKeys(password);
    }
    public static void fillTheBirthDate (WebDriver driver, String month , String day , String year){
        WebElement fieldBirthDate = driver.findElement(By.xpath("//input[@placeholder='Birth date']"));
        fieldBirthDate.sendKeys(month,day,year);
    }
    public static void fillThePublicInfoField (WebDriver driver, String publicInfo){
        WebElement publicInfoField = driver.findElement(By.xpath("//textarea[@placeholder='Public info']"));
        publicInfoField.sendKeys(publicInfo);
    }
    public static void clickOnSignInButton (WebDriver driver){
        WebElement signInButtonInRegistrationForm = driver.findElement(By.xpath("//button[@id='sign-in-button']"));
       boolean active = signInButtonInRegistrationForm.isEnabled();
       assertTrue(active);
        signInButtonInRegistrationForm.click();
    }
    public static void emailTakenMsgAppear(WebDriver driver){
        WebElement emailTakenMsg = driver.findElement(By.xpath("//div[@class='toast-message ng-star-inserted']"));
        emailTakenMsg.isDisplayed();
    }
    public static void usernameTakenMsgAppear(WebDriver driver){
        WebElement usernameTakenMsg = driver.findElement(By.xpath("//div[@class='toast-message ng-star-inserted']"));
        usernameTakenMsg.isDisplayed();
    }
    public static void checkUsernameIsItInvalid(WebDriver driver){
        WebElement invalidUsername = driver.findElement(By.className("form-control ng-dirty ng-touched is-invalid ng-invalid"));
        invalidUsername.isDisplayed();
    }
    public static void validationIfEmailIsAgreed(WebDriver driver){
        WebElement validationFieldValid = driver.findElement(By.className("input-filed has-success"));
        validationFieldValid.isDisplayed();
    }
    public static void validationIfEmailIsInvalid(WebDriver driver){
        WebElement validationFieldInvalid = driver.findElement(By.xpath("//div[@class='input-filed has-danger']"));
        validationFieldInvalid.isDisplayed();
    }
    public static void validationIfUsernameIsInvalid(WebDriver driver){
        WebElement validationFieldInvalid = driver.findElement(By.className("invalid-feedback ng-star-inserted"));
        validationFieldInvalid.isDisplayed();
    }

    public static void   SignInButtonIsDisable (WebDriver driver){
        WebElement signInButtonInRegistrationForm = driver.findElement(By.xpath("//button[@id='sign-in-button']"));
        boolean disable = signInButtonInRegistrationForm.isEnabled();
        assertFalse(disable);
    }
    public static void invalidPasswordAlert(WebDriver driver){
        WebElement passwordAlert = driver.findElement(By.xpath("//input[@id='defaultRegisterFormPassword']"));
        boolean alert = passwordAlert.isDisplayed();
        assertTrue(alert);
    }


}
