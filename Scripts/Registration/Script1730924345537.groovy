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

WebUI.openBrowser('https://www.executeautomation.com/sign-in')

WebUI.click(findTestObject('Page_ExecuteAutomation/li_Start Learning'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_ExecuteAutomation/First_name'), 'Sahurasayar')

WebUI.setText(findTestObject('Page_ExecuteAutomation/Last_name'), 'sadddp')

WebUI.setText(findTestObject('Page_ExecuteAutomation/Email'), 'dedaya@gmail.com')

WebUI.setText(findTestObject('Page_ExecuteAutomation/Password'), '1234567')

WebUI.setText(findTestObject('Page_ExecuteAutomation/Password_confirmation'), '1234567')

WebUI.selectOptionByValue(findTestObject('Page_ExecuteAutomation/Country'), 'Indonesia', true)

WebUI.selectOptionByValue(findTestObject('Page_ExecuteAutomation/input_Im a_designation'), '1', true)

WebUI.click(findTestObject('Page_ExecuteAutomation/button_Create Account'))

