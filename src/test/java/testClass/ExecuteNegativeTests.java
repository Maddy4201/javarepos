package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import basePackage.FirstPageObjectClass;

public class ExecuteNegativeTests extends BaseClass{
	
	@Test(priority=1)
    public void testInvalidEmail() {
		
		FirstPageObjectClass fpoc = new FirstPageObjectClass(driver);
		fpoc.enterFullName();
        fpoc.invalidEmailAddress();
        
        Assert.assertEquals(fpoc.getEmailError(), "Please enter a valid email address.");
    }
	
	@Test(priority=2)
	public void testInvalidPhoneNo() {
		
		FirstPageObjectClass fpoc = new FirstPageObjectClass(driver);
		fpoc.clearFullName();
		fpoc.enterFullName();
		fpoc.clearEmailId();
		//fpoc.validEmailAddress();
		fpoc.clearPhoneNo();
		fpoc.invalidPhoneNo();	
		
		Assert.assertEquals(fpoc.getPhoneNoError(), "Please enter a valid phone number.");
		
	}
	
	@Test(priority=3)
	public void testWeakPassword() {
		FirstPageObjectClass fpoc = new FirstPageObjectClass(driver);
		fpoc.clearFullName();
		fpoc.enterFullName();
		fpoc.clearEmailId();
		fpoc.validEmailAddress();
		fpoc.clearPhoneNo();
		fpoc.enterPhoneNumber();
        fpoc.clearPassword();
		fpoc.invalidPassord();
		
		//Assert.assertEquals(fpoc.getPasswordError(), "Enter a strong password to continue (eg. Str0ng@098). ");
	}


}
