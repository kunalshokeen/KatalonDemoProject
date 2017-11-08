import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.G_SiteURL)

CustomKeywords.'com.demo.utilities.CommonUtilities.waitForPageLoad'()

'Click on a_Make Appointment button'
CustomKeywords.'com.demo.utilities.CommonUtilities.clickOnElement'(findTestObject('Page_CuraHomePage/a_Make Appointment'))

CustomKeywords.'com.demo.utilities.CommonUtilities.waitForPageLoad'()

'Fill username'
CustomKeywords.'com.demo.utilities.CommonUtilities.setTextOnElement'(findTestObject('Page_Login/input_username'), 
    username)

'Fill password'
CustomKeywords.'com.demo.utilities.CommonUtilities.setTextOnElement'(findTestObject('Page_Login/input_password'), 
    password)

'Click on Login button'
CustomKeywords.'com.demo.utilities.CommonUtilities.clickOnElement'(findTestObject('Page_Login/button_Login'))

CustomKeywords.'com.demo.utilities.CommonUtilities.waitForPageLoad'()

'Wait for Facility select values to be visible in 10s'
WebUI.waitForElementVisible(findTestObject('Page_CuraAppointment/select_facility'), 10)

boolean flag = CustomKeywords.'com.demo.utilities.CommonUtilities.checkDropDownListElementExist'(findTestObject('Page_CuraAppointment/select_facility'), 
    'Hongkong CURA Healthcare Center')

if (flag) {
    WebUI.selectOptionByValue(findTestObject('Page_CuraAppointment/select_facility'), 'Hongkong CURA Healthcare Center', 
        true)
}

'Click on hospital readmission checkbox'
CustomKeywords.'com.demo.utilities.CommonUtilities.clickOnElement'(findTestObject('Page_CuraAppointment/input_hospital_readmission'))

'Click on hospital readmission checkbox'
CustomKeywords.'com.demo.utilities.CommonUtilities.clickOnElement'(findTestObject('Page_CuraAppointment/input_programs'))

'Click on VisitDate field'
CustomKeywords.'com.demo.utilities.CommonUtilities.clickOnElement'(findTestObject('Page_CuraAppointment/VisitDate'))

'Select 25th Nov'
CustomKeywords.'com.demo.utilities.CommonUtilities.clickOnElement'(findTestObject('Page_CuraAppointment/td_25'))

CustomKeywords.'com.demo.utilities.CommonUtilities.setTextOnElement'(findTestObject('Page_CuraAppointment/textarea_comment'), 
    'Booking appointment')

CustomKeywords.'com.demo.utilities.CommonUtilities.clickOnElement'(findTestObject('Page_CuraAppointment/button_Book Appointment'))

WebUI.verifyTextPresent(appointmentConfirmationText, true)

WebUI.closeBrowser()

