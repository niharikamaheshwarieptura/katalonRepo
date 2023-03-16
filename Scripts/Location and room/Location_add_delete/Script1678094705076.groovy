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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/input_Device Hub_form-control ng-untouched _ee8278'), 
    GlobalVariable.UserName)

WebUI.click(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/span_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/location and room/Location_add_delete/Page_Sign in/input_Forgot your password_Password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/location and room/Location_add_delete/Page_Sign in/button_Sign in'))

WebUI.click(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/span_Locations'))

WebUI.click(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/a_Add location'))

WebUI.selectOptionByValue(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/select_Afghanistanland IslandsAlbaniaAlgeri_0c4dfd'), 
    'IND', true)

WebUI.setText(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/input_Town Or City_TownOrCity'), 'haryana' + 
    RN)

WebUI.setText(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/input_Site_LocationName'), 'gurugram')

WebUI.setText(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/input_Building Name_Building'), 'dlf')

WebUI.setText(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/input_Floors_form-control ng-untouched ng-p_7c4cf3'), 
    '1')

WebUI.click(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/location_button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/div_Location Added'), 'Location Added')

WebUI.setText(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/input_RESULTS_searchQuery'), 'haryana' + 
    RN)

WebUI.click(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/button_dlf_btn lnr lnr-trash deleteBtn'))

WebUI.click(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/location and room/Location_add_delete/Page_Connect/div_Location successfully deleted'), 
    'Location successfully deleted')

WebUI.closeBrowser()

