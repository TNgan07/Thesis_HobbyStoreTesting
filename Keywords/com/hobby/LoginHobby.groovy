package com.hobby

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class LoginHobby {

	@Keyword
	def LogintoHobby(String email, String password) {
		WebUI.sendKeys(findTestObject('Object Repository/Page_Hobby_Login/Hobby_Login_inputEmail'), email)
		WebUI.sendKeys(findTestObject('Object Repository/Page_Hobby_Login/Hobby_Login_inputPassword'), password)
	}

	@Keyword
	def clickLogin(String buttonName) {
		String xPath = "//button[@type = 'submit' and (text() = 'Login' or . = 'Login')]"
		TestObject testObject =  new TestObject().addProperty('xpath', ConditionType.EQUALS, xPath)
		WebUI.click(testObject)
	}
	@Keyword
	def LogoutHobby() {
		WebUI.click(findTestObject('Object Repository/Page_Hobby_Login/Hobby_Logout_Account'))
	}
	@Keyword
	def clickLogOut(String buttonName) {
		WebUI.click(findTestObject('Object Repository/Page_Hobby_E2E_Testing/Hobby_Logout_imgAccount'))
		String xPath = "//li[(text() = 'Logout' or . = 'Logout')]"
		TestObject testObject =  new TestObject().addProperty('xpath', ConditionType.EQUALS, xPath)
		WebUI.click(testObject)
	}
}

