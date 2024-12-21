package testClass;

import java.util.Scanner;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import basePackage.FirstPageObjectClass;
import basePackage.LastPageObjectClass;
import basePackage.OTPPageObjectCLass;

public class ExecuteRegistrationFlow extends BaseClass {
	
	@Test
	public void testValidData() {
		
		FirstPageObjectClass fpoc = new FirstPageObjectClass(driver);
		fpoc.clearFullName();
		fpoc.enterFullName();
		fpoc.clearEmailId();
		fpoc.validEmailAddress();
		fpoc.enterCountryCodeDropDown();
		fpoc.countryCodeField();
		fpoc.clickCountryCode();
		fpoc.clearPhoneNo();
		fpoc.enterPhoneNumber();
		fpoc.clearPassword();
		fpoc.enterCorrectPassword();
		fpoc.clickSignupButton();	
		
		OTPPageObjectCLass enterOtp = new OTPPageObjectCLass(driver);
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the OTP received: ");
	        String otp = scanner.nextLine();
	        enterOtp.otpValidation(otp);
	        
	        LastPageObjectClass finalPage = new LastPageObjectClass(driver);
	        finalPage.enterWebsiteTitle();
	        finalPage.selectkBusinessCatagory();
	        finalPage.enterWebsiteDomain();
	        finalPage.clickCityTab();
	        finalPage.enterCityInitials();
	        finalPage.confirmCity();
	        finalPage.clickCheckBox();
	        finalPage.clickCreateWebsiteButton();
	
	}
	
	
	
		

}
