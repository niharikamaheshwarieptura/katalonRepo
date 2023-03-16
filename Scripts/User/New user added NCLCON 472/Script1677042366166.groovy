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

int RN = ((Math.random() * 10000) as int)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://connectv2-qa.condecodev.com/SelfService/')

WebUI.click(findTestObject('Object Repository/Users/NCLCON 472/Page_Connect/input_Device Hub_form-control ng-untouched _ee8278'))

WebUI.setText(findTestObject('Object Repository/Users/NCLCON 472/Page_Connect/input_Device Hub_form-control ng-untouched _ee8278'), 
    'Katalon_Niharika@coneptura.onmicrosoft.com')

WebUI.sendKeys(findTestObject('Object Repository/Users/NCLCON 472/Page_Connect/input_Device Hub_form-control ng-untouched _ee8278'), 
    Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Users/NCLCON 472/Page_Sign in/input_Forgot your password_Password'), 'FKLLH7TQYnb8WzLg1ZpP6Q==')

WebUI.click(findTestObject('Object Repository/Users/NCLCON 472/Page_Sign in/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Users/NCLCON 472/Page_Connect/em_Users_icon-connect-users'))

WebUI.click(findTestObject('Object Repository/Users/NCLCON 472/Page_Connect/a_Add user'))

WebUI.setText(findTestObject('Object Repository/Users/NCLCON 472/Page_Connect/input_First name_firstName'), 'Katalon' + RN)

WebUI.setText(findTestObject('Object Repository/Users/NCLCON 472/Page_Connect/input_Last name_lastName'), 'Automation')

WebUI.setText(findTestObject('Object Repository/Users/NCLCON 472/Page_Connect/input_Email_email'), 'niharikatesting'+RN+'@katalon.com')

WebUI.setText(findTestObject('Object Repository/Users/NCLCON 472/Page_Connect/input_Mobile phone number_mobilePhoneNumber'), '2635')

WebUI.click(findTestObject('Object Repository/Users/NCLCON 472/Page_Connect/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Users/NCLCON 472/Page_Connect/div_User Added'), 'User Added')

WebUI.closeBrowser()