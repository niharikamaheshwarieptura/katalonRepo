import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

int RN = ((Math.random() * 10000) as int)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Users/NCLCON9657_single character in last name/Page_Connect/input_Device Hub_form-control ng-untouched _ee8278'), 
    GlobalVariable.UserName)

WebUI.click(findTestObject('Object Repository/Users/NCLCON9657_single character in last name/Page_Connect/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Users/NCLCON9657_single character in last name/Page_Sign in/input_Forgot your password_Password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Users/NCLCON9657_single character in last name/Page_Sign in/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Users/NCLCON9657_single character in last name/Page_Connect/em_Users_icon-connect-users'))

WebUI.click(findTestObject('Object Repository/Users/NCLCON9657_single character in last name/Page_Connect/a_Add user'))

WebUI.setText(findTestObject('Object Repository/Users/NCLCON9657_single character in last name/Page_Connect/input_First name_firstName'), 
    'singlech')

WebUI.setText(findTestObject('Object Repository/Users/NCLCON9657_single character in last name/Page_Connect/input_Last name_lastName'), 
    'c')

WebUI.setText(findTestObject('Object Repository/Users/NCLCON9657_single character in last name/Page_Connect/input_Email_email'), 
    ('singlech' + RN) + '@katalon.com')

WebUI.setText(findTestObject('Object Repository/Users/NCLCON9657_single character in last name/Page_Connect/input_Mobile phone number_mobilePhoneNumber'), 
    '123')

WebUI.click(findTestObject('Object Repository/Users/NCLCON9657_single character in last name/Page_Connect/user_button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Users/NCLCON9657_single character in last name/Page_Connect/div_User Added'), 
    'User Added')

WebUI.closeBrowser()

