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

//Precondition
WebUI.callTestCase(findTestCase('Test Cases/Login/TCP_Success Login'), [:], FailureHandling.STOP_ON_FAILURE)

//View product detail => Product = Harry Potter Chamber Secret
WebUI.click(findTestObject('Object Repository/Homepage/Text_HP the Chamber of Secrets'))

//Expected

WebUI.verifyElementPresent(findTestObject('Object Repository/Product Detail/Text_ Header (Book Details)'), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Product Detail/Text_Book Title (HP the Chamber of Secrets)'), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Product Detail/Text_Genre (Mystery)'), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Product Detail/Text_Amount (235.00)'), 15)

WebUI.verifyElementClickable(findTestObject('Object Repository/Product Detail/Button_Add to Cart (HP the Chamber of Secrets)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Product Detail/Button_Add to Wishlist (HP the Chamber of Secrets)'), FailureHandling.STOP_ON_FAILURE)
