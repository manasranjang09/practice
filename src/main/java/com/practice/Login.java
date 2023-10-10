package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String args[])
	{
	
	 // System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");  
      
      // Instantiate a ChromeDriver class.       
   WebDriver driver=new ChromeDriver(); 
          driver.get("https://www.tutorialspoint.com/");
          driver.quit();
	}

}
