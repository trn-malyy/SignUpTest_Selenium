package core;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sign_Up_Selenium {
	public static void main(String[] args) {

		// WebDriver driver = new HtmlUnitDriver();
		WebDriver driver = new FirefoxDriver();
		String text_case_id_01 = "TC-001.01";
		String text_case_id_02 = "TC-001.02";
		String text_case_id_03 = "TC-001.03";
		String text_case_id_04 = "TC-001.04";
		String text_case_id_05 = "TC-001.05";
		String text_case_id_06 = "TC-001.06";
		String text_case_id_07 = "TC-001.07";
		String text_case_id_08 = "TC-001.08";
		String text_case_id_09 = "TC-001.09";
		String text_case_id_10 = "TC-001.10";
		String text_case_id_11 = "TC-001.11";
		String text_case_id_12 = "TC-001.12";
		String text_case_id_13 = "TC-001.13";
		String text_case_id_14 = "TC-001.14";
		String text_case_id_15 = "TC-001.15";
		String text_case_id_16 = "TC-001.16";
		String text_case_id_17 = "TC-001.17";
		String text_case_id_18 = "TC-001.18";
		String text_case_id_19 = "TC-001.19";
		String text_case_id_20 = "TC-001.20";
		String text_case_id_21 = "TC-001.21";
		String text_case_id_22 = "TC-001.22";
		String text_case_id_23 = "TC-001.23";
		String text_case_id_24 = "TC-001.24";
		String text_case_id_25 = "TC-001.25";
		String text_case_id_26 = "TC-001.26";
		String text_case_id_27 = "TC-001.27";
		String text_case_id_28 = "TC-001.28";
		
		String fname = "Alex";
		String lname = "Moore";
		String email = "alexmoore@gmail.com";
		String ivalid_email = "e@gmail.com";
		String invalid_phone = "(415)374-";
		String phone = "415 555-1212";
		String url = "http://learn2test.net/qa/apps/sign_up/v1/";
		String title_sign_up_expected = "Welcome to Sign Up";
		String title_facebook_expected = "Welcome to Facebook - Log In, Sign Up or Learn More";
		String title_twitter_expected = "Twitter";
		String title_flickr_expected = "Welcome to Flickr - Photo Sharing";
		String title_YouTube_expected = "YouTube";
		String error_fname_empty_expected = "Please enter First Name";
		String error_lname_empty_expected = "Please enter Last Name";
		String error_emali_empty_expected = "Please enter Email Address";
		String error_phone_empty_expected = "Please enter Phone Number";
		String error_fname_invalid_expected = "Invalid First Name: [a-zA-Z,.'-]{3,30}";
		String error_lname_invalid_expected = "Invalid Last Name: [a-zA-Z,.'-]{3,30}";
		String error_email_invalid_expected = "Invalid Email Address: xx[min2]@x[min1].xx[2-6]";
		String error_phone_invalid_expected = "Invalid Phone Number: should be 10 digits";
		String[] specialChars = { "+", "&", "|", "!", "(", ")", "{", "}", "[", "]", "^",
	            "~", "*", "?", ":","\"","\\","@","#",">","<",".", };
		
		
		//TESTING STARTS BELOW
		
		// TC-001.01

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title_sign_up_actual = driver.getTitle();

		if (title_sign_up_expected.equals(title_sign_up_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_01
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_01
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=======================================");
		}

		// TC-001.02

		driver.findElement(By.id("id_img_facebook")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		String title_facebook_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_facebook_expected.equals(title_facebook_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_02
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_02
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("=======================================");
		}
		
		// TC-001.03

		driver.findElement(By.id("id_img_twitter")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		allTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		String title_twitter_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_twitter_expected.equals(title_twitter_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_03
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_twitter_expected + "/" + title_twitter_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_03
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_twitter_expected + "/" + title_twitter_actual);
			System.out.println("=======================================");
		}
		// TC-001.04

		driver.findElement(By.id("id_img_flickr")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		allTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		String title_flickr_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_flickr_expected.equals(title_flickr_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_04
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_flickr_expected + "/" + title_flickr_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_04
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_flickr_expected + "/" + title_flickr_actual);
			System.out.println("=======================================");
		}
		// TC-001.05

		driver.findElement(By.id("id_img_youtube")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		allTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		String title_YouTube_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_YouTube_expected.equals(title_YouTube_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_05
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_YouTube_expected + "/" + title_YouTube_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_05
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_YouTube_expected + "/" + title_YouTube_actual);
			System.out.println("=======================================");
		}
		

		// TC-001.06

		//driver.findElement(By.id("id_quotes")).getText();
		String quote = driver.findElement(By.id("id_quotes")).getText();
		if (quote != null && quote.length() < 103 && quote.length() > 36) {
			System.out.println("Test Case ID: \t\t" + text_case_id_06
					+ " - PASSED");
			System.out.println("Quote length: " + quote.length());
			System.out.println(" Your Quote: " + quote);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_06
					+ " - FAILED");
			System.out.println("Quote length: " + quote.length());
			System.out.println("=======================================");
		}
		
		// TC-001.07

		//String acctual_temp = driver.findElement(By.id("id_temperature")).getText();
		String temperature = driver.findElement(By.id("id_temperature")).getText();
		if (temperature != null && temperature.length() > 0) {
			System.out.println("Test Case ID: \t\t" + text_case_id_07
					+ " - PASSED");
			System.out.println("Client’s current temperature, in Fahrenheit: " + temperature);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_07
					+ " - FAILED");
			System.out.println("Client’s current temperature, in Fahrenheit: " + temperature);
			System.out.println("=======================================");
		}
		
		
		// TC-001.08

		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_reset_button")).click();

		String fname_actual = driver.findElement(By.id("id_fname"))
				.getText();
		String lname_actual = driver.findElement(By.id("id_lname"))
				.getText();
		String email_actual = driver.findElement(By.id("id_email"))
				.getText();
		String phone_actual = driver.findElement(By.id("id_phone"))
				.getText();

		if (fname_actual.equals("") && lname_actual.equals("") && email_actual.equals("") && phone_actual.equals("")) {
			System.out.println("Test Case ID: \t\t" + text_case_id_08
					+ " - PASSED");
			System.out.println("First Expected/Actual:  BLANK / "+ fname_actual);
			System.out.println("Last Expected/Actual:  BLANK / "+ lname_actual);
			System.out.println("Email Expected/Actual:  BLANK / "+ email_actual);
			System.out.println("Phone Expected/Actual:  BLANK / "+ phone_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_08
					+ " - FAILED");
			System.out.println("First Expected/Actual: \t" + fname + "/"
					+ fname_actual);
			System.out.println("Last Expected/Actual: \t" + lname + "/"
					+ lname_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_actual);
			System.out.println("=======================================");
			
		}
		
		// TC-001.09

		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_submit_button")).click();

		String fname_conf_actual = driver.findElement(By.id("id_fname_conf"))
				.getText();
		String lname_conf_actual = driver.findElement(By.id("id_lname_conf"))
				.getText();
		String email_conf_actual = driver.findElement(By.id("id_email_conf"))
				.getText();
		String phone_conf_actual = driver.findElement(By.id("id_phone_conf"))
				.getText();

		if (fname.equals(fname_conf_actual) && lname.equals(lname_conf_actual)
				&& email.equals(email_conf_actual)
				&& phone.equals(phone_conf_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_09
					+ " - PASSED");
			System.out.println("First Expected/Actual: \t" + fname + "/"
					+ fname_conf_actual);
			System.out.println("Last Expected/Actual: \t" + lname + "/"
					+ lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_09
					+ " - FAILED");
			System.out.println("First Expected/Actual: \t" + fname + "/"
					+ fname_conf_actual);
			System.out.println("Last Expected/Actual: \t" + lname + "/"
					+ lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
			System.out.println("=======================================");
		}
		
		//CLICK BACK 
		driver.findElement(By.id("id_back_button")).click();
		
		// TC-001.10
		List<WebElement> MyElement_FirstName = driver.findElements(By.id("id_fname"));
	
		if (MyElement_FirstName.isEmpty()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_10
					+ " - FAILED");
			System.out.println("Web Element First Name Not Found" );
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_10
					+ " - PASSED");
			
			System.out.println("Web Element First Name  Found");
			System.out.println("=======================================");
		}
		
		
		// TC-001.11
		List<WebElement> MyElement_Last_Name = driver.findElements(By.id("id_lname"));
		
		if (MyElement_Last_Name.isEmpty()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_11
					+ " - FAILED");
			System.out.println("Web Element Las Name Not Found" );
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_11
					+ " - PASSED");
			System.out.println("Web Element Last Name  Found");
			System.out.println("=======================================");
		}
		
		// TC-001.12
		
		List<WebElement> MyElement_Email = driver.findElements(By.id("id_email"));
		
		if (MyElement_Email.isEmpty()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_12
					+ " - FAILED");
			System.out.println("Web Element eMail Not Found" );
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_12
					+ " - PASSED");
			System.out.println("Web Element eMail  Found");
			System.out.println("=======================================");
		}
		
		// TC-001.13
		List<WebElement> MyElement_PhoneNumber = driver.findElements(By.id("id_phone"));
		
		if (MyElement_PhoneNumber.isEmpty()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_13
					+ " - FAILED");
			System.out.println("Web Element Phone Number Not Found" );
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_13
					+ " - PASSED");
			System.out.println("Web Element Phone Number  Found");
			System.out.println("=======================================");
		}
		
		// TC-001.14
		List<WebElement> MyElement_State = driver.findElements(By.id("id_state"));
		
		if (MyElement_State.isEmpty()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_14
					+ " - FAILED");
			System.out.println("Web Element State Not Found" );
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_14
					+ " - PASSED");
			System.out.println("Web Element State Found");
			System.out.println("=======================================");
		}
	
		// TC-001.15
		List<WebElement> MyElement_Agree_Check = driver.findElements(By.id("id_checkbox"));
		
		if (MyElement_Agree_Check.isEmpty()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_15
					+ " - FAILED");
			System.out.println("Web Element Agree Checkbox Not Found" );
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_15
					+ " - PASSED");
			System.out.println("Web Element  Agree Checkbox Found");
			System.out.println("=======================================");
		}
		
		// TC-001.16
		List<WebElement> MyElement_Reset = driver.findElements(By.id("id_reset_button"));
		
		if (MyElement_Reset.isEmpty()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_16
					+ " - FAILED");
			System.out.println("Web Element Reset Button Not Found" );
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_16
					+ " - PASSED");
			System.out.println("Web Element Reset Button Found");
			System.out.println("=======================================");
		}
		
		// TC-001.17
		List<WebElement> MyElement_Submit = driver.findElements(By.id("id_submit_button"));
		
		if (MyElement_Submit.isEmpty()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_17
					+ " - FAILED");
			System.out.println("Web Element Submit Button Not Found" );
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_17
					+ " - PASSED");
			System.out.println("Web Element Submit Button Found");
			System.out.println("=======================================");
		}
		
		
		// TC-001.18
		List<WebElement> MyElement_Gender_Male = driver.findElements(By.id("id_g_radio_01"));
		
		if (MyElement_Gender_Male.isEmpty()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_18
					+ " - FAILED");
			System.out.println("Web Element Male Radio Button Not Found" );
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_18
					+ " - PASSED");
			System.out.println("Web Element Male Radio Button Found");
			System.out.println("=======================================");
		}
		
		// TC-001.19
		List<WebElement> MyElement_Gender_Female = driver.findElements(By.id("id_g_radio_02"));
		
		if (MyElement_Gender_Female.isEmpty()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_19
					+ " - FAILED");
			System.out.println("Web Element Female Radio Button Not Found" );
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_19
					+ " - PASSED");
			System.out.println("Web Element Female Radio Button Found");
			System.out.println("=======================================");
		}
		
		
		
// NEGATIVE TESTING STARTS HERE 
		// TC-001.20

	driver.findElement(By.id("id_submit_button")).click();
	String error_fname_empty_actual = driver
				.findElement(By.id("ErrorLine")).getText();

	if (error_fname_empty_expected.equals(error_fname_empty_actual)) {
		System.out.println("Test Case ID: \t\t" + text_case_id_20
				+ " - PASSED");
		System.out.println("Error Expected/Actual: \t"
				+ error_fname_empty_expected + "/"
				+ error_fname_empty_actual);
		System.out.println("=======================================");
	} else {
		System.out.println("Test Case ID: \t\t" + text_case_id_20
				+ " - FAILED");
		System.out.println("Error Expected/Actual: \t"
				+ error_fname_empty_expected + "/"
				+ error_fname_empty_actual);
		System.out.println("=======================================");
	}

	// TC-001.21
	
	driver.findElement(By.id("id_fname")).sendKeys(fname);
	//driver.findElement(By.id("id_lname")).sendKeys(lname);
	//driver.findElement(By.id("id_email")).sendKeys(email);
	//driver.findElement(By.id("id_phone")).sendKeys(phone);
	//driver.findElement(By.id("id_submit_button")).click();
	
	//String error_emali_empty_expected = "Please enter Email Address";
	//String error_phone_empty_expected = "Please enter Phone Number";

	driver.findElement(By.id("id_submit_button")).click();
	String error_lname_empty_actual = driver
				.findElement(By.id("ErrorLine")).getText();

	if (error_lname_empty_expected.equals(error_lname_empty_actual)) {
		System.out.println("Test Case ID: \t\t" + text_case_id_21
				+ " - PASSED");
		System.out.println("Error Expected/Actual: \t"
				+ error_lname_empty_expected + "/"
				+ error_lname_empty_actual);
		System.out.println("=======================================");
	} else {
		System.out.println("Test Case ID: \t\t" + text_case_id_21
				+ " - FAILED");
		System.out.println("Error Expected/Actual: \t"
				+ error_lname_empty_expected + "/"
				+ error_lname_empty_actual);
		System.out.println("=======================================");
	}
	
	
	// TC-001.22
	
	driver.findElement(By.id("id_lname")).sendKeys(lname);

	driver.findElement(By.id("id_submit_button")).click();
	String error_email_empty_actual = driver
				.findElement(By.id("ErrorLine")).getText();

	if (error_emali_empty_expected.equals(error_email_empty_actual)) {
		System.out.println("Test Case ID: \t\t" + text_case_id_22
				+ " - PASSED");
		System.out.println("Error Expected/Actual: \t"
				+ error_emali_empty_expected + "/"
				+ error_email_empty_actual);
		System.out.println("=======================================");
	} else {
		System.out.println("Test Case ID: \t\t" + text_case_id_22
				+ " - FAILED");
		System.out.println("Error Expected/Actual: \t"
				+ error_emali_empty_expected + "/"
				+ error_email_empty_actual);
		System.out.println("=======================================");
	}
	
	
	
	// TC-001.23
	
		
		 driver.findElement(By.id("id_email")).sendKeys(email);
	
		driver.findElement(By.id("id_submit_button")).click();
		String error_phone_empty_actual = driver
					.findElement(By.id("ErrorLine")).getText();

		if (error_phone_empty_expected.equals(error_phone_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_23
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_phone_empty_expected + "/"
					+ error_phone_empty_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_23
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_phone_empty_expected + "/"
					+ error_phone_empty_actual);
			System.out.println("=======================================");
		}
		
		
		
		 driver.findElement(By.id("id_phone")).sendKeys("dsfsdfsfsf");
	
		driver.findElement(By.id("id_submit_button")).click();
		error_phone_empty_actual = driver
					.findElement(By.id("ErrorLine")).getText();

		if (error_phone_invalid_expected.equals(error_phone_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_24
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_phone_invalid_expected + "/"
					+ error_phone_empty_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_24
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_phone_invalid_expected + "/"
					+ error_phone_empty_actual);
			System.out.println("=======================================");
		}
		
				
		// TC-001.25+
		driver.findElement(By.id("id_reset_button")).click();
		
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);

		
		for( int i = 0; i < specialChars.length - 1; i++)
		{
		
		String sac_element = specialChars[i];	
		
		driver.findElement(By.id("id_fname")).clear();
		driver.findElement(By.id("id_fname")).sendKeys(fname + sac_element );
		driver.findElement(By.id("id_submit_button")).click();
		
		String error_fname_invalid_actual = driver
					.findElement(By.id("ErrorLine")).getText();

		if (error_fname_invalid_expected.equals(error_fname_invalid_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_25 + "." +i
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_lname_empty_expected + "/"
					+ error_fname_invalid_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_25 + "." +i
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_fname_invalid_expected + "/"
					+ error_fname_invalid_actual);
			System.out.println("=======================================");
		}
		
		}
		
		// TC-001.26 +
		driver.findElement(By.id("id_reset_button")).click();
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_email")).sendKeys(email);
 
		for( int i = 0; i < specialChars.length - 1; i++)
		{
		
		String sac_element2 = specialChars[i];	
		
		driver.findElement(By.id("id_lname")).clear();
		driver.findElement(By.id("id_lname")).sendKeys(lname + sac_element2 );
		driver.findElement(By.id("id_submit_button")).click();
		
		String error_lname_invalid_actual = driver
					.findElement(By.id("ErrorLine")).getText();

		if (error_lname_invalid_expected.equals(error_lname_invalid_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_26 + "." +i
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_lname_empty_expected + "/"
					+ error_lname_invalid_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_26 + "." +i
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_lname_invalid_expected + "/"
					+ error_lname_invalid_actual);
			System.out.println("=======================================");
		}
		
		}
		
		
		
		// TC-001.27
		driver.findElement(By.id("id_reset_button")).click();
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(ivalid_email);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		
		
		driver.findElement(By.id("id_submit_button")).click();
		String error_email_ivalid_actual = driver
					.findElement(By.id("ErrorLine")).getText();

		if (error_email_invalid_expected.equals(error_email_ivalid_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_27
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_email_invalid_expected + "/"
					+ error_email_ivalid_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_27
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_email_invalid_expected + "/"
					+ error_email_ivalid_actual);
			System.out.println("=======================================");
		}
		
		

		// TC-001.28
		driver.findElement(By.id("id_reset_button")).click();
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(invalid_phone);
		
		
		driver.findElement(By.id("id_submit_button")).click();
		String error_phone_ivalid_actual = driver
					.findElement(By.id("ErrorLine")).getText();

		if (error_phone_invalid_expected.equals(error_phone_ivalid_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_28
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_phone_invalid_expected + "/"
					+ error_phone_ivalid_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_28
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_phone_invalid_expected + "/"
					+ error_phone_ivalid_actual);
			System.out.println("=======================================");
		}
		
		System.out.println("=================================THE END================================");
		
	
		driver.quit();
	}

}
