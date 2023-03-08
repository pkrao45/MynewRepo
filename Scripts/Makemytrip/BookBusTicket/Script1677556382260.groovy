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

WebUI.navigateToUrl('https://www.makemytrip.com/bus-tickets/')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Makemytrip/Page_Online Bus Ticket Booking, Book Confir_a0abd1/input_From_fromCity'))

WebUI.setText(findTestObject('Object Repository/Makemytrip/Page_Online Bus Ticket Booking, Book Confir_a0abd1/input_From_react-autosuggest__input react-a_59584c'), 
    'Hyderabad')

WebUI.click(findTestObject('Object Repository/Makemytrip/Page_Online Bus Ticket Booking, Book Confir_a0abd1/p_Hyderabad, Telangana'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Makemytrip/Page_Online Bus Ticket Booking, Book Confir_a0abd1/input_To_react-autosuggest__input react-aut_f3e8a6'), 
    'Pune')

WebUI.click(findTestObject('Object Repository/Makemytrip/Page_Online Bus Ticket Booking, Book Confir_a0abd1/li_Pune, Maharashtra'))

WebUI.click(findTestObject('Object Repository/Makemytrip/Page_Online Bus Ticket Booking, Book Confir_a0abd1/div_30'))

WebUI.click(findTestObject('Object Repository/Makemytrip/Page_MakeMyTrip Bus/img_Showing 7 out of 7 buses from Hyderabad_101de7'))

WebUI.click(findTestObject('Object Repository/Makemytrip/Page_MakeMyTrip Bus/a_Select Seats'))

WebUI.closeBrowser()

