package com.hrms.lib;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
// std rule:to provide all resualbe funtion:/METHOD
	public void openApplication () {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);	
		System.out.println("Application opened");//console
		Reporter.log("Application opened");//html report
		Log.info("Application opened");//logfile
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		Log.info("Application closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys("Admin");
		driver.findElement(By.name(txt_password)).sendKeys("admin123");
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login completed");
		Log.info("Login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout completed");
		Log.info("Logout completed");
	}
}
