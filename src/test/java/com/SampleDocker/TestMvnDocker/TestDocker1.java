package com.SampleDocker.TestMvnDocker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestDocker1 extends BaseClassDocker{
	
	
	@Test
	public void gotoGmail() throws Exception
	{
		PageFactory.initElements(driver,TestDocker1PO.class);
		
		TestDocker1PO.gmailLink.click();
		Thread.sleep(5000);
		TestDocker1PO.createAccnt.click();
		System.out.println("The create account is opened");
		
//		driver.findElement(By.linkText("Gmail")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.partialLinkText("Create an account")).click();
//		System.out.println("The create account is opened");
		
	}

}
