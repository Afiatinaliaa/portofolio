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
WebUI.callTestCase(findTestCase('Test Cases/Product Detail/TCP_Add to Wishlist (via Product Detail)'), [:], FailureHandling.STOP_ON_FAILURE)

//Add product to wishlist => Product = Harry Potter Chamber Secret
// Simpan XPath ke dalam Test Object
TestObject btn_rmvWishlist = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Remove from Wishlist')]")

// Klik elemen yang mengandung teks 'Remove from Wishlist'
WebUI.click(btn_rmvWishlist)

//Expected
WebUI.verifyElementPresent(findTestObject('Object Repository/Product Detail/Popup_Item removed from your Wishlist'), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Product Detail/Button_Add to Wishlist (HP the Chamber of Secrets)'), 15)
