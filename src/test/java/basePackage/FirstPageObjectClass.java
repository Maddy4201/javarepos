package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FirstPageObjectClass extends BaseClass {
	
	public FirstPageObjectClass(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name") WebElement fullName;
	@FindBy(id="email") WebElement emailId;
	//@FindBy(id = "iframe_id") WebElement iframe; // Replace "iframe_id" with the actual iframe ID or locator
	@FindBy(xpath="//span[@role='presentation']") WebElement countryCodeDropDown;
	@FindBy(xpath="//span[contains(text(),'+91 (IN)')]") WebElement countryCode;
	@FindBy(xpath="//input[@role='textbox']") WebElement countryCodeField;
	@FindBy(id="phone") WebElement phoneNo;
	@FindBy(id="password") WebElement passwordField;
	@FindBy(xpath="//button[@id='register']") WebElement signupButton;
	
	//For capturing error message
	
	@FindBy(id="validation-suggestion-name") WebElement fullNameError;
	@FindBy(id = "validation-suggestion-email") WebElement emailError;
	@FindBy(id="validation-suggestion-phone") WebElement phoneNoError;
	@FindBy(id = "validation-suggestion-password") WebElement passwordError;
	
	
	// Positive data validation
	

	
	public void enterFullName() {
		fullName.sendKeys(prop.getProperty("validFullName"));
	}
	
	public void validEmailAddress() {
		emailId.sendKeys(prop.getProperty("validEmailId"));
	}
	
	public void enterCountryCodeDropDown() {   
      countryCodeDropDown.click();
    }
	
	public void countryCodeField() {	
		countryCodeField.sendKeys(prop.getProperty("correctCountryText"));
	}
	
	public void clickCountryCode() {
		countryCode.click();
	}

	
	public void enterPhoneNumber() {
		phoneNo.sendKeys(prop.getProperty("validPhoneNumber"));
		
	}
    public void enterCorrectPassword() {
    	passwordField.sendKeys(prop.getProperty("validPassword"));
    }
	
    public void clickSignupButton() {
    	
    	signupButton.click();
    }
    
    //To Clear the data
    public void clearFullName() {
		fullName.clear();;
	}
    
    public void clearEmailId() {
    	emailId.clear();;
	}
	
    public void clearPhoneNo() {
    	phoneNo.clear();
	}
    
    public void clearPassword() {
    	passwordField.clear();
	}
    
    //Negative test data
    
    public void enterInvalidFullName() {
		fullName.sendKeys(prop.getProperty("invalidFullName"));
	}
	
	public void invalidEmailAddress() {
		emailId.sendKeys(prop.getProperty("invalidEmailId"));
	}
	
	public void invalidPhoneNo() {
		phoneNo.sendKeys(prop.getProperty("invalidPhoneNumber"));
	}
	
	public void invalidPassord() {
		emailId.sendKeys(prop.getProperty("invalidPassword"));
	}
    
    
      // Validation for error messages
    
    public String getFullNameError() {
        return fullNameError.getText();
    }

    public String getEmailError() {
        return emailError.getText();
    }
    
    public String getPhoneNoError() {
        return phoneNoError.getText();
   
    }
    

    public String getPasswordError() {
        return passwordError.getText();
    }
	
 

}
