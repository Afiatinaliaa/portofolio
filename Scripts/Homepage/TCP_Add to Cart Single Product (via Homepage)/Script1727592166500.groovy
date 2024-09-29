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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject

//Precondition
WebUI.callTestCase(findTestCase('Test Cases/Login/TCP_Success Login'), [:], FailureHandling.STOP_ON_FAILURE)

//Add to cart single product
WebUI.click(findTestObject('Object Repository/Homepage/Button_Add to Cart (HP the Chamber of Secrets)'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Product Detail/Cart Counter_1'), FailureHandling.STOP_ON_FAILURE)

//Expected Result
WebUI.verifyElementPresent(findTestObject('Object Repository/Product Detail/Button_Add to Cart (HP the Chamber of Secrets)'), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Cart/Text_Amount 1 Product (235.00)'), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Cart/Button_CheckOut (1 Product)'), 15)

