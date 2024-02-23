import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:3000/pages/login/')

WebUI.setText(findTestObject('Page_Failed/input_Email_username'), 'demo1@gmail.com')

WebUI.setText(findTestObject('Page_Failed/input_Password_password'), '1234')

WebUI.click(findTestObject('Page_Hobby_Login/Hobby_Login_buttonLogin'))

WebUI.setText(findTestObject('Page_Hobby_Searching/Hobby_Searching_inputProduct'), 'sofa')

WebUI.click(findTestObject('Page_Hobby_Searching/Hobby_Searching_buttonSearch'))

WebUI.click(findTestObject('Page_Hobby_Searching/Hobby_Searching_buttonSeeMore'))

WebUI.click(findTestObject('Page_Hobby_Cart/Hobby_buttonAddToCart'))

WebUI.click(findTestObject('Page_Hobby_Cart/Hobby_spanCart'))

WebUI.click(findTestObject('Page_Hobby_E2E_Testing/Hobby_buttontheNumberofProduct'))

WebUI.click(findTestObject('Page_Hobby_E2E_Testing/Hobby_buttonPurchase'))

WebUI.click(findTestObject('Page_Hobby_E2E_Testing/Hobby_inputPaybyPaypal'))

WebUI.click(findTestObject('Page_Failed/Page_Hobby - Material Design React Admin Template/div_Debit or Credit Card'))

WebUI.closeBrowser()

