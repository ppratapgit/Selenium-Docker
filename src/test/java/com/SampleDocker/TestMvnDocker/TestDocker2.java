package com.SampleDocker.TestMvnDocker;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestDocker2 extends BaseClassDocker {
	

	@Test
	public void gotoImages() throws Exception
	{
		
		PageFactory.initElements(driver, TestDocker2PO.class);
		
		TestDocker2PO.imageLink.click();
		Thread.sleep(5000);
		TestDocker2PO.SignInLink.click();
		System.out.println("The sign in is opened");
		
		
		//Thread.sleep(4000);
//		driver.findElement(By.linkText("Images")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("Sign in")).click();
//		System.out.println("The sign in is opened");
	}

}
