

Move to Inbox More 
1 of 186
 
SQA Test 
Inbox
x 

Tannya Tomar <tannyatomar@gmail.com>
Jun 2 (3 days ago)
to Rajeev 
Challenge Testing



The main goal of this challenge is to evaluate your knowledge and
abilities in software automation testing using Selenium Webdriver

(preferably using the following languages: Java or C#). It will be
considered good points if you use good practicals implementation and

design patterns (like Page Objects (https://goo.gl/Dobccr), for example).



We hope that the following scenario testing has been considered in
your implementation:

1) Choose a site. Preferably choose a site that must contain the
following requirements:

    a) A login page;

    b) A form with varied fields (checkbox, combo box, textbox, etc.);

    c) In your code, is necessary that it contains asserts and verify;

    d) The form that you chose should be submitted and save;

    e) The logout testing (when you get out in a session) should be executed;

    f) In every test case, you should create a valid and invalid test
case. For example, in a login page, you can access a page using a
valid user

(a valid test case) and an invalid user (an invalid test case)



2) We have some suggestions of sites that you can use in your
challenge: E-commerce (http://demo.cs-cart.com/), Amazon

(https://www.amazon.com/), eBay (https://www.ebay.com/). However, the
final choice is on your own.



Remember that the following requirements will be analysed: coverage
applied in the tests, techniques, design and the way like you codify

your automation testing. Is necessary that all actions developed
during the challenge are justified.



Every question that you have, please, don't hesitate to contact us. We
hope that you have fun. Have a nice day.


Rajeev Ranjan		Attachments10:06 PM (1 hour ago)
On Sat, Jun 2, 2018 at 4:45 PM, Tannya Tomar <tannyatomar@gmail.com> wrote: >...

Tannya Tomar <tannyatomar@gmail.com>
11:28 PM (2 minutes ago)
to Pulkit 


Tannya Tomar <tannyatomar@gmail.com>
Attachments11:31 PM (0 minutes ago)
to Pulkit 

2 Attachments
	
Click here to Reply or Forward
1.3 GB (7%) of 17 GB used
Manage
Terms - Privacy
Last account activity: 2 minutes ago
Details


package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProjectOne {
	
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajeev.k.ranjan\\Desktop\\Rajeev DNDelete\\AllDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		WebElement Username = driver.findElement(By.name("log"));
		WebElement Password = driver.findElement(By.name("pwd"));
		WebElement chckbx = driver.findElement(By.id("rememberme"));
		WebElement logIn = driver.findElement(By.name("wp-submit"));
		
		Username.sendKeys("admin");
		Password.sendKeys("demo123");
		chckbx.click();
		logIn.click();
		
		String titletext = driver.getTitle();
		System.out.println(titletext);
		
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath(".//*[@id='wp-admin-bar-my-account']/a"))).build().perform();
		Thread.sleep(3000);
		builder.moveToElement(driver.findElement(By.xpath(".//*[@id='wp-admin-bar-logout']/a"))).click().build().perform();
		
		
	}

}