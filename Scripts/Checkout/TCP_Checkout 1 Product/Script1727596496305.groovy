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
WebUI.callTestCase(findTestCase('Test Cases/Homepage/TCP_Add to Cart Single Product (via Homepage)'), [:], FailureHandling.STOP_ON_FAILURE)

//Checkout 1 product
WebUI.click(findTestObject('Object Repository/Cart/Button_CheckOut (1 Product)'), FailureHandling.STOP_ON_FAILURE)

//Input User Name
WebUI.click(findTestObject('Object Repository/Checkout/Field_Name (Empty)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Checkout/Field_Name (After Click)'), 'Adeline Park')

//Input Address Line 1
// Simpan XPath ke dalam Test Object
TestObject addLine1 = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Address Line 1')]")

// Klik elemen yang mengandung teks 'Password'
WebUI.click(addLine1)

// Simpan XPath ke dalam Test Object
TestObject addLine1input = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Address Line 1')]/following::input[1]")
 
// Input text pada elemen yang mengandung teks 'Address Line 1'
WebUI.setText(addLine1input, 'Botanica Aralia Residence, Blok B7 No. 10')

//Input Address Line 2
// Simpan XPath ke dalam Test Object
TestObject addLine2 = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Address Line 2')]")

// Klik elemen yang mengandung teks 'Password'
WebUI.click(addLine2)

// Simpan XPath ke dalam Test Object
TestObject addLine2input = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Address Line 2')]/following::input[1]")
 
// Input text pada elemen yang mengandung teks 'Address Line 1'
WebUI.setText(addLine2input, 'Pondok Aren, Kota Tangerang Selatan')

//Input PinCode
// Simpan XPath ke dalam Test Object
TestObject pinCode = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Pincode')]")

// Klik elemen yang mengandung teks 'Password'
WebUI.click(addLine2)

// Simpan XPath ke dalam Test Object
TestObject pincodeInput = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Pincode')]/following::input[1]")
 
// Input text pada elemen yang mengandung teks 'Address Line 1'
WebUI.setText(pincodeInput, '153221')

//Input State
// Simpan XPath ke dalam Test Object
TestObject state = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'State')]")

// Klik elemen yang mengandung teks 'Password'
WebUI.click(state)

// Simpan XPath ke dalam Test Object
TestObject stateInput = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'State')]/following::input[1]")
 
// Input text pada elemen yang mengandung teks 'Address Line 1'
WebUI.setText(stateInput, 'Indonesia')

WebUI.click(findTestObject('Object Repository/Checkout/Button_Place Order'), FailureHandling.STOP_ON_FAILURE)

//Expected Result
WebUI.verifyElementPresent(findTestObject('Object Repository/My Order/Header_My Orders'), 15)