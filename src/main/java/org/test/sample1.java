package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class sample1 {
public static WebDriver driver; 
@Given("The user launchs browser and click add customer")
public void the_user_launchs_browser_and_click_add_customer() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-11\\Desktop\\gow\\Day1\\driv\\chromedriver.exe");
	driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	   
}

@When("The user enters firstnamelastname,email,address,mobile and click submit button")
public void the_user_enters_firstnamelastname_email_address_mobile_and_click_submit_button(DataTable dataTable) {
	List<String> a=dataTable.asList(String.class);
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	 driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(a.get(0));
	 driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(a.get(1));
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(a.get(2));
	 driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(a.get(3));
	 driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(a.get(4));
	 driver.findElement(By.xpath("//input[@name='submit']")).click();

}

@Then("The user navigates to the page")
public void the_user_navigates_to_the_page() {
	WebElement t = driver.findElement(By.xpath("//b[text()='Please Note Down Your CustomerID']"));
	String text = t.getText();
    if(text.contains("CustomerID")) {
    	System.out.println("success");
    }
    else {
    	System.out.println("fail");
    }
    
}

}
