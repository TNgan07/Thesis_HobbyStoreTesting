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

String email = findTestData('Data Files/Test Data E2E').getValue(1, 1)

String password = findTestData('Data Files/Test Data E2E').getValue(2, 1)

String nameProduct = findTestData('Data Files/Test Data E2E').getValue(3, 1)

String emailPaypal = findTestData('Data Files/Test Data E2E').getValue(1, 2)

String pwdPaypal = findTestData('Data Files/Test Data E2E').getValue(2, 2)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:3000/pages/login/')

CustomKeywords.'com.hobby.LoginHobby.LogintoHobby'(email, password)

CustomKeywords.'com.hobby.LoginHobby.clickLogin'('Login')

CustomKeywords.'com.hobby.SearchProductHobby.SearchingProduct'(nameProduct)

CustomKeywords.'com.hobby.SearchProductHobby.clickSearching'()

CustomKeywords.'com.hobby.AddProducttotheCart.seeDescription'('Xem thêm')

CustomKeywords.'com.hobby.AddProducttotheCart.addToCart'('Thêm vào giỏ')

CustomKeywords.'com.hobby.AddProducttotheCart.seeCart'('Giỏ hàng')

CustomKeywords.'com.hobby.OrderAndPayment.theNumberofProducts'()

CustomKeywords.'com.hobby.OrderAndPayment.purchase'('Mua hàng')

CustomKeywords.'com.hobby.OrderAndPayment.paybyPaypal'('Thanh toán qua paypal')

CustomKeywords.'com.hobby.OrderAndPayment.fillFormPaypal'()
CustomKeywords.'com.hobby.OrderAndPayment.paypalPayNow'('Pay Now')
CustomKeywords.'com.hobby.OrderAndPayment.seeOrderDetails'()

CustomKeywords.'com.hobby.LoginHobby.clickLogOut'('Logout')

WebUI.closeBrowser()

