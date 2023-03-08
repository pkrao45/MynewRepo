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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/li_Organization'))

WebUI.click(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/a_General Information'))

WebUI.click(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/span_Edit_oxd-switch-input oxd-switch-input_e15d3c'))

WebUI.setText(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/input_Organization Name_oxd-input oxd-input--focus'), 
    'O')

WebUI.setText(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/input_Organization Name_oxd-input oxd-input_a8d73f'), 
    '')

WebUI.setText(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/input_Organization Name_oxd-input oxd-input--focus'), 
    'OrangeHRM')

WebUI.click(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/p_44'))

WebUI.click(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/p_44'))

WebUI.click(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/p_44'))

WebUI.doubleClick(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/p_44'))

WebUI.setText(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/input_Registration Number_oxd-input oxd-inp_2b4816'), 
    'info@orangehrm.c')

WebUI.setText(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/input_Email_oxd-input oxd-input--focus oxd-_252afc'), 
    'i')

WebUI.setText(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/input_Registration Number_oxd-input oxd-inp_2b4816'), 
    '')

WebUI.setText(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/input_Email_oxd-input oxd-input--focus oxd-_252afc'), 
    'info@orangehrm.')

WebUI.setText(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/input_Registration Number_oxd-input oxd-inp_2b4816'), 
    '100020')

WebUI.click(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/div_United States'))

WebUI.click(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/div_United States'))

WebUI.click(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/div_United States'))

WebUI.setText(findTestObject('Object Repository/OrangeHRMGeneralInformation/Page_OrangeHRM/textarea_Notes_oxd-textarea oxd-textarea--f_0ce0e8'), 
    'HRM Software test')

WebUI.closeBrowser()

