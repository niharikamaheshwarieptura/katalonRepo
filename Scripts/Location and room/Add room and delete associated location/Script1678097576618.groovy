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

WebUI.setText(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/input_Device Hub_form-control ng-untouched _ee8278'), 
    GlobalVariable.UserName)

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/span_Log in'))

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Sign in/div_Email Address                          _406958'))

WebUI.setEncryptedText(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Sign in/input_Forgot your password_Password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Sign in/button_Sign in'))

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/span_Locations'))

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/a_Add location'))

WebUI.selectOptionByValue(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/select_Afghanistanland IslandsAlbaniaAlgeri_0c4dfd'), 
    'IND', true)

WebUI.setText(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/input_Town Or City_TownOrCity'), 
    'gurgram' + RN)

WebUI.setText(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/input_Site_LocationName'), 
    'delhi' + RN)

WebUI.setText(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/input_Building Name_Building'), 
    'dlf' + RN)

WebUI.setText(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/input_Floors_form-controlPrimary select-box_d26880'), 
    '1')

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/location_button_Save'))

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/span_Rooms  Screens'))

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/button_Add room'))

WebUI.selectOptionByValue(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/select_Please select            IndiaAustralia'), 
    'IND', true)

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/div_Country                    Please selec_8f13fc'))

WebUI.selectOptionByValue(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/select_Please select            gurgram'), 
    'gurgram' + RN, true)

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/div_Country                    Please selec_8f13fc_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/select_Please select            dlf'), 
    'dlf' + RN, true)

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/div_Country                    Please selec_8f13fc_1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/select_Please select            1'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/input_Room Name_name'), 
    'katalon room' + RN)

WebUI.setText(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/input_Capacity_capacity'), 
    '1')

WebUI.setText(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/input_Room Mailbox_mailbox'), 
    'abc')

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/room_button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/div_Room Added'), 
    'Room Added')

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/span_Locations'))

WebUI.setText(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/input_RESULTS_searchQuery'), 
    'gurgram' + RN)

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/location_button_dlf_btn lnr lnr-trash deleteBtn'))

WebUI.click(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/location and room/Add room and delete associated location/Page_Connect/div_Can not delete location. There are room_42111b'), 
    'Can not delete location. There are rooms associated with it.')

WebUI.closeBrowser()

