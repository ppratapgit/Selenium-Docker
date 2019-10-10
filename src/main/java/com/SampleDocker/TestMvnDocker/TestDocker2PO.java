package com.SampleDocker.TestMvnDocker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestDocker2PO {
	
	
	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	 
	 static WebElement SignInLink;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Images")
	 
	 static WebElement imageLink;

}
