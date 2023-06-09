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

WebUI.setText(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/input_Username_username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.takeElementScreenshotAsCheckpoint('LoginPage Check', findTestObject('OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/li_Job'))

WebUI.click(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/li_Job Titles'))

WebUI.click(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/button_Add'))

WebUI.takeScreenshotAsCheckpoint('After login page')

WebUI.setText(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--focus'), 
    'Aaaaa1')

WebUI.setText(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/textarea_Job Description_oxd-textarea oxd-t_4f7bba'), 
    'Aaaaa1')

WebUI.click(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/i_Actions_oxd-icon bi-check oxd-checkbox-in_fe61ad'))

WebUI.click(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/button_Aaa_oxd-icon-button oxd-table-cell-a_ab31f4'))

WebUI.click(findTestObject('Object Repository/OHRM_add_delete/OrangeHRM_Job_Title_add_del/Page_OrangeHRM/button_Yes, Delete'))

WebUI.closeBrowser()

