package com.hobby

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class OrderAndPayment {

	@Keyword
	def purchase(String buttonName) {
		buttonName = WebUI.click(findTestObject('Object Repository/Page_Hobby_E2E_Testing/Hobby_buttonPurchase'))
		WebUI.waitForAlert(3)
	}

	@Keyword
	def paybyCash(String checkboxName) {
		checkboxName = WebUI.click(findTestObject('Object Repository/Page_Hobby_E2E_Testing/Hobby_inputPaybyCash'))
		WebUI.waitForAlert(3)
	}

	@Keyword
	def theNumberofProducts() {
		WebUI.click(findTestObject('Object Repository/Page_Hobby_E2E_Testing/Hobby_buttontheNumberofProduct'))
	}

	@Keyword
	def paybyPaypal(String checkboxName) {
		checkboxName = WebUI.click(findTestObject('Object Repository/Page_Hobby_E2E_Testing/Hobby_inputPaybyPaypal'))
		WebUI.waitForAlert(3)
		WebUI.switchToWindowTitle('Hobby - Material Design React Admin Template')
		WebUI.click(findTestObject('Object Repository/Page_Hobby_E2E_Testing/Hobby_PaypalCreditCart'))
	}
	
	@Keyword
	def fillFormPaypal() {
		//		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)
		//		String xPath = "//input[@id='"+value+"']"
		//		TestObject testObject =  new TestObject().addProperty('xpath', ConditionType.EQUALS, xPath)
		//		WebUI.setText(testObject)
		//
		String credit_card_number = findTestData('Data Files/Test Data E2E').getValue(4, 1)

		String expiryDate = findTestData('Data Files/Test Data E2E').getValue(5, 1)

		String creditCardSecurity = findTestData('Data Files/Test Data E2E').getValue(6, 1)

		String firstName = findTestData('Data Files/Test Data E2E').getValue(7, 1)

		String lastName = findTestData('Data Files/Test Data E2E').getValue(8, 1)

		String Street1 = findTestData('Data Files/Test Data E2E').getValue(9, 1)

		String Street2 = findTestData('Data Files/Test Data E2E').getValue(10, 1)

		String City = findTestData('Data Files/Test Data E2E').getValue(11, 1)

		String zipCode = findTestData('Data Files/Test Data E2E').getValue(12, 1)

		String numberPhone = findTestData('Data Files/Test Data E2E').getValue(13, 1)

		String emailPaypal = findTestData('Data Files/Test Data E2E').getValue(14, 1)

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.sendKeys(findTestObject('Page_Hobby_TestPayment/Hobby_Paypal_inputCardNumber'), credit_card_number)

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.sendKeys(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_inputCardNumber_expiry_date'), expiryDate)

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.sendKeys(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_inputExpires_creditCardSecurity'), creditCardSecurity)

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.sendKeys(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_input_firstName'), firstName)

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.sendKeys(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_input_lastName'), lastName)

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.sendKeys(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_input_Street1'), Street1)

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.sendKeys(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_input_Street2'), Street2)

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.sendKeys(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_input_City'), City)

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_selectItem'), 'CA', true)

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.click(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_input_Postcode'))

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.sendKeys(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_input_Zip_postcode'), zipCode)

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.sendKeys(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_input_Numberphone'), numberPhone)

		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)

		WebUI.sendKeys(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_input_email'), emailPaypal)

		//		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)
		//
		//		WebUI.click(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_button_PayNow'))

	}

	@Keyword
	def paypalPayNow(String buttonName) {
		WebUI.switchToFrame(findTestObject('Page_Hobby_E2E_Testing/Hobby_iFramePaypal'), 1)
		buttonName = WebUI.click(findTestObject('Object Repository/Page_Hobby_TestPayment/Hobby_Paypal_button_PayNow'))
		WebUI.waitForAlert(3)
	}

	@Keyword
	def orderProduct(String buttonName) {
		buttonName = WebUI.click(findTestObject('Object Repository/Page_Hobby_E2E_Testing/Hobby_buttonOrder'))
		WebUI.waitForAlert(3)
	}

	@Keyword
	def confirmOrder(String buttonName) {
		buttonName = WebUI.click(findTestObject('Object Repository/Page_Hobby_E2E_Testing/Hobby_buttonConfirm'))
		WebUI.waitForAlert(3)
	}

	@Keyword
	def seeOrderDetails() {
		WebUI.click(findTestObject('Object Repository/Page_Hobby_E2E_Testing/Hobby_buttonSeeOrder'))
		WebUI.waitForAlert(3)
	}
}

