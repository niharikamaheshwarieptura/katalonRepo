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

WebUI.navigateToUrl('https://connectv2-qa.condecodev.com/SelfService/')

WebUI.setText(findTestObject('Object Repository/User access domain validations/Page_Connect/input_Device Hub_form-control ng-untouched _ee8278'), 
    'Katalon_Niharika@coneptura.onmicrosoft.com')

WebUI.click(findTestObject('Object Repository/User access domain validations/Page_Connect/span_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/User access domain validations/Page_Sign in/input_Forgot your password_Password'), 
    'FKLLH7TQYnb8WzLg1ZpP6Q==')

WebUI.click(findTestObject('Object Repository/User access domain validations/Page_Sign in/button_Sign in'))

WebUI.click(findTestObject('Object Repository/User access domain validations/Page_Connect/span_User Access'))

WebUI.click(findTestObject('Object Repository/User access domain validations/Page_Connect/button_Add another'))

WebUI.click(findTestObject('Object Repository/User access domain validations/Page_Connect/input__form-control ng-untouched ng-pristin_3ca2b9'))

WebUI.click(findTestObject('Object Repository/User access domain validations/Page_Connect/div_Save                Cancel'))

WebUI.verifyElementText(findTestObject('Object Repository/User access domain validations/Page_Connect/p_This field is required'), 
    'This field is required')

WebUI.setText(findTestObject('Object Repository/User access domain validations/Page_Connect/input__form-control ng-untouched ng-pristin_3ca2b9'), 
    'kat')

WebUI.click(findTestObject('Object Repository/User access domain validations/Page_Connect/p_Invalid characters'))

WebUI.verifyElementText(findTestObject('Object Repository/User access domain validations/Page_Connect/p_Invalid characters'), 
    'Invalid characters')

WebUI.verifyElementText(findTestObject('Object Repository/User access domain validations/Page_Connect/p_Field too short'), 
    'Field too short')

WebUI.closeBrowser()

