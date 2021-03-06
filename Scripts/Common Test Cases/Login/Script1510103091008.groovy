import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

CustomKeywords.'com.demo.utilities.CommonUtilities.waitForElementVisible'(findTestObject('Page_CuraHomePage/a_Make Appointment'))

CustomKeywords.'com.demo.utilities.CommonUtilities.clickOnElement'(findTestObject('Page_CuraHomePage/a_Make Appointment'))

CustomKeywords.'com.demo.utilities.CommonUtilities.waitForPageLoad'()

WebUI.delay(GlobalVariable.G_ShortTimeOut)

CustomKeywords.'com.demo.utilities.CommonUtilities.waitForElementVisible'(findTestObject('Page_Login/input_username'))

CustomKeywords.'com.demo.utilities.CommonUtilities.setTextOnElement'(findTestObject('Page_Login/input_username'), username)

CustomKeywords.'com.demo.utilities.CommonUtilities.waitForElementVisible'(findTestObject('Page_Login/input_password'))

CustomKeywords.'com.demo.utilities.CommonUtilities.setTextOnElement'(findTestObject('Page_Login/input_password'), password)

CustomKeywords.'com.demo.utilities.CommonUtilities.waitForElementVisible'(findTestObject('Page_Login/button_Login'))

CustomKeywords.'com.demo.utilities.CommonUtilities.clickOnElement'(findTestObject('Page_Login/button_Login'))

CustomKeywords.'com.demo.utilities.CommonUtilities.waitForPageLoad'()

WebUI.delay(GlobalVariable.G_ShortTimeOut)

