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
import com.kms.katalon.core.testcase.Variable
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class AddProducttotheCart {

	@Keyword
	def seeDescription(String buttonName) {
		buttonName = WebUI.click(findTestObject('Object Repository/Page_Hobby_Searching/Hobby_Searching_buttonSeeMore'))
		WebUI.waitForAlert(3)
	}

	@Keyword
	def addToCart(String buttonName) {
		buttonName = WebUI.click(findTestObject('Object Repository/Page_Hobby_Cart/Hobby_buttonAddToCart'))
		WebUI.waitForAlert(3)
	}

	@Keyword
	def seeCart(String buttonName) {
		buttonName = WebUI.click(findTestObject('Object Repository/Page_Hobby_Cart/Hobby_spanCart'))
		WebUI.waitForAlert(3)
	}
	@Keyword
	def removeProduct() {
		WebUI.click(findTestObject('Object Repository/Page_Hobby_Cart/Hobby_Cart_RemoveProduct'))
	}
}

