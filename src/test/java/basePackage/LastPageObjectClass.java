package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastPageObjectClass extends BaseClass{
	
	public LastPageObjectClass(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="business_name") WebElement websiteTitle;
	@FindBy(id="select2-category-container") WebElement businessCatagory;
	@FindBy(xpath="//li[@id='select2-category-result-hpvu-AGRICULTURE']") WebElement selectBusinessCatagory;
	@FindBy(id="domain") WebElement websiteSubDomain;
	@FindBy(id="select2-city-container") WebElement selectCity;
	@FindBy(xpath="//input[contains(@role,'textbox')]") WebElement enterCityText;
	@FindBy(xpath="//li[normalize-space()='Delhi, Delhi, India']") WebElement cityValue;
	//@FindBy(id="address_1") WebElement postalAddress;
	//@FindBy(id="pincode") WebElement postalCode;
	@FindBy(xpath="//input[@name='show_address']") WebElement showAdressCheckBox;
	@FindBy(xpath="//button[@type='submit']") WebElement createWebsiteButton;
	
	
	
	public void enterWebsiteTitle() {	
		websiteTitle.sendKeys(prop.getProperty("domainName"));
	}
	
	public void selectkBusinessCatagory() {
		businessCatagory.click();	
	}
	
	public void clickBusinessCatagory() {
		selectBusinessCatagory.click();	
	}
	
	public void enterWebsiteDomain() {
		websiteSubDomain.sendKeys("jhgajsdhgf");
		
	}
	public void clickCityTab() {
		selectCity.click();
	}
	
	public void enterCityInitials() {
		enterCityText.sendKeys("delhi");
	}
	
	public void confirmCity() {
		cityValue.click();
	}
	
	public void clickCheckBox() {
		showAdressCheckBox.click();
	}
	
	public void clickCreateWebsiteButton() {
		createWebsiteButton.click();
		
	}
	
	
	
	
}
