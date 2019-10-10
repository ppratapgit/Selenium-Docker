package com.SampleDocker.TestMvnDocker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestDocker1PO {
	

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Create an account")
	 
	 static WebElement createAccnt;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Gmail")
	 
	 static WebElement gmailLink;
 
    
}
