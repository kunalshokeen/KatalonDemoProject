package com.demo.utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import org.stringtemplate.v4.compiler.STParser.option_return

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class CommonUtilities {

	@Keyword
	boolean checkDropDownListElementExist(TestObject testObj,String option) {
		boolean flag = false;
		WebElement element = WebUiCommonHelper.findWebElement(testObj,20);
		Select ddl = new Select(element);
		List<WebElement> options = ddl.getOptions();
		for(WebElement ele :options) {
			if(ele.getText().equalsIgnoreCase(option)) {
				System.out.println("Element exist !");
				flag =true;
			}
			else {
				System.out.println("Element does not exist");
			}
		}
		return flag;
	}

	@Keyword
	void clickOnElement(TestObject testObj) {
		'Wait for Element to be visible in 10s'
		WebUI.waitForElementVisible(testObj,10)
		WebUI.click(testObj)
	}

	@Keyword
	void setTextOnElement(TestObject testObj,String text) {
		'Wait for Element to be visible in 10s'
		WebUI.waitForElementVisible(testObj, 10)
		'Clear element text no cleartext method in WebUI'
		WebUI.setText(testObj,'')
		WebUI.setText(testObj,text)
	}
}
