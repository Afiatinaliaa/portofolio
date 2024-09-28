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

//Login Using invalid username and password
WebUI.click(findTestObject('Object Repository/Homepage/Button_Login'))

WebUI.click(findTestObject('Object Repository/Login/Field_Username (Empty)'))

WebUI.setText(findTestObject('Object Repository/Login/Field_Username (After Click)'), 'Adeline_Park')

// Simpan XPath ke dalam Test Object
TestObject toPasswordInput = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Password')]/following::input[1]")
 
// Input text pada elemen yang mengandung teks 'Password'
WebUI.setText(toPasswordInput, 'October99')

WebUI.click(findTestObject('Object Repository/Login/Button_Login'))

//Expected Result
WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Text_Adeline_Park'), 15)