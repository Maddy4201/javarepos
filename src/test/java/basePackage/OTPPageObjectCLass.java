package basePackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OTPPageObjectCLass extends BaseClass{
	
   public	OTPPageObjectCLass(WebDriver driver) {
	   
	   this.driver = driver;
       PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath = "//input[@class='codeBox']") List<WebElement> otpBoxes;
   @FindBy(xpath = "//button[normalize-space()='Verify']") WebElement verifyButton;
	
   public void otpValidation(String otp) {
	   
	   char[] otpDigits = otp.toCharArray(); // Split the OTP into individual digits
       for (int i = 0; i < otpDigits.length; i++) {
           otpBoxes.get(i).sendKeys(String.valueOf(otpDigits[i])); // Enter each digit
       }
       //verifyButton.click(); // Click the verify button
   }
   
   
   
}
