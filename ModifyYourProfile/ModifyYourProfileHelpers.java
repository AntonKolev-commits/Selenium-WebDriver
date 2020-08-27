package firstSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class ModifyYourProfileHelpers {
    public static void checkIsModifyYourProfileIsOpened(WebDriver driver){
        WebElement sectionModify = driver.findElement(By.xpath("//h4[contains(text(),'Modify Your Profile')]"));
        sectionModify.isDisplayed();
    }
    public static void usernameFieldModifyProfile(WebDriver driver, String username){
        WebElement usernameField = driver.findElement(By.xpath("//div[@class='container profile-edit-container']//div[1]//div[1]//input[1]"));
        usernameField.clear();
        usernameField.sendKeys(username);
    }
    public static void emailFieldModifyProfile(WebDriver driver, String email){
        WebElement usernameField = driver.findElement(By.xpath("//ngb-modal-window[@class='modal fade show d-block profile-edit-modal']//div[2]//div[1]//input[1]"));
        usernameField.clear();
        usernameField.sendKeys(email);
    }
    public static void passwordFieldModifyProfile(WebDriver driver, String password){
        WebElement usernameField = driver.findElement(By.xpath("//div[3]//div[1]//input[1]"));
        usernameField.sendKeys(password);
    }
    public static void confirmPasswordFieldModifyProfile(WebDriver driver, String password){
        WebElement usernameField = driver.findElement(By.xpath("//div[4]//div[1]//input[1]"));
        usernameField.sendKeys(password);
    }
    public static void publicInfoFieldModifyProfile(WebDriver driver, String publicInfo){
        WebElement usernameField = driver.findElement(By.xpath("//div[@class='row mt-3']//div[@class='col-8']"));
        usernameField.sendKeys(publicInfo);
    }
    public static void clickOnSaveButton(WebDriver driver){
        WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
        if(saveButton.isEnabled()){
           assertTrue("Save button is enabled!", true);
        }else{
            assertFalse("Save button is disable!", false);
        }
        saveButton.click();
    }

}
