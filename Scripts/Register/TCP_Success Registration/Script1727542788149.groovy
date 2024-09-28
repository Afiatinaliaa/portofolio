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
WebUI.openBrowser('')

WebUI.navigateToUrl('https://bookcart.azurewebsites.net/')

//Success Registration
WebUI.click(findTestObject('Object Repository/Homepage/Button_Login'))

// Simpan XPath ke dalam Test Object
TestObject Regist = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Register')]")

// Klik elemen yang mengandung teks 'Register'
WebUI.click(Regist)

WebUI.click(findTestObject('Object Repository/Register/Field_First name (Empty)'))

WebUI.setText(findTestObject('Object Repository/Register/Field_First Name (After Click)'), 'Adeline')

WebUI.click(findTestObject('Object Repository/Register/Field_Last name (Empty)'))

WebUI.setText(findTestObject('Object Repository/Register/Field_Last Name (After Click)'), 'Park')

WebUI.click(findTestObject('Object Repository/Register/Field_Username (Empty)'))

WebUI.setText(findTestObject('Object Repository/Register/Field_Username (After Click)'), 'Adeline_Park')

// Simpan XPath ke dalam Test Object
TestObject Pwd = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Password')]")

// Klik elemen yang mengandung teks 'Password'
WebUI.click(Pwd)

// Simpan XPath ke dalam Test Object
TestObject toPasswordInput = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Password')]/following::input[1]")
 
// Input text pada elemen yang mengandung teks 'Password'
WebUI.setText(toPasswordInput, 'October99')
 
// Simpan XPath ke dalam Test Object
TestObject confirmPasswordInput = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Confirm Password')]/following::input[1]")
 
// Input text pada elemen yang mengandung teks 'Confirm Password'
WebUI.setText(confirmPasswordInput, 'October99')

// Simpan XPath ke dalam Test Object
TestObject rbtn = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Female')]")

// Klik elemen yang mengandung teks 'Female'
WebUI.click(rbtn)

WebUI.click(findTestObject('Object Repository/Register/Button_Register'))

//Expected Result
WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Text_Login'), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Field_Username (Empty)'), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Field_Password (Empty)'), 15)

WebUI.verifyElementPresent(findTestObject('null'), 15)