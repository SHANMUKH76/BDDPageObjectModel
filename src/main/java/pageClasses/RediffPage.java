package pageClasses;


import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RediffPage {
	
	@FindBy(how = How.LINK_TEXT, using = "Sign in") WebElement signIn;
	@FindBy(how = How.XPATH, using = "//a[@title='Create new Rediffmail account']") WebElement createAccount;
	@FindBy(how = How.XPATH, using = "//div[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input[@type='text']") WebElement username;
	@FindBy(how = How.XPATH, using = "//td[@valign='bottom']/input[@type='text']") WebElement rediffID;
	@FindBy(how = How.XPATH, using = "//td[@valign='bottom']/input[@type='button']") WebElement checkAvailability;
	
	@FindBy(how = How.ID, using = "newpasswd") WebElement password;
	@FindBy(how = How.ID, using = "newpasswd1") WebElement retypePassword;
	@FindBy(how = How.CLASS_NAME, using = "nomargin") WebElement checkbox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='div_hintQS']/table[1]/tbody/tr[2]/td[3]/select") WebElement securityQuestion;
	@FindBy(how = How.XPATH, using = "//div[@id='div_hintQS']/table[1]/tbody/tr[4]/td[3]/input") WebElement answer;
	@FindBy(how = How.XPATH, using = "//div[@id='div_hintQS']/table[1]/tbody/tr[6]/td[3]/input") WebElement hint;
	
	@FindBy(how = How.ID, using = "mobno") WebElement mobileNumber;
	@FindBy(how = How.ID, using = "country") WebElement country;
	@FindBy(how = How.XPATH, using = "//tbody/tr[22]/td[3]/select[1]") WebElement day;
	@FindBy(how = How.XPATH, using = "//tbody/tr[22]/td[3]/select[2]") WebElement month;
	@FindBy(how = How.XPATH, using = "//tbody/tr[22]/td[3]/select[3]") WebElement year;
	@FindBy(how = How.XPATH, using = "//input[@value='m']") WebElement gender;
	
	@FindBy(how = How.CLASS_NAME, using = "captcha") WebElement captcha;
	@FindBy(how = How.ID, using = "Register") WebElement register;
	
	
	public void signIn() {
		signIn.click();
	}
	
	public void createAccount() {
		createAccount.click();
	}
	
	public void enterDetails() {
		Scanner sc = new Scanner(System.in);
		
		username.sendKeys("Shanmukh Nakkella");
		rediffID.sendKeys("shanmukhN16");
		checkAvailability.click();
		password.sendKeys("Password123");
		retypePassword.sendKeys("Password123");
		checkbox.click();
		
		Select s = new Select(securityQuestion);
		s.selectByIndex(2);
		
		answer.sendKeys("Answer");
		hint.sendKeys("dont know");
		mobileNumber.sendKeys("4879567890");
		
		Select s1 = new Select(country);
		s1.selectByVisibleText("Canada");
		
		Select d = new Select(day);
		d.selectByValue("15");
		
		Select m = new Select(month);
		m.selectByVisibleText("APR");
		
		Select y = new Select(year);
		y.selectByValue("2003");
		
		gender.click();
		
//		System.out.println("Enter the captcha: ");
//		captcha.sendKeys(sc.nextLine());
//		
//		register.click();
		
		sc.close();
	}
	
	

}