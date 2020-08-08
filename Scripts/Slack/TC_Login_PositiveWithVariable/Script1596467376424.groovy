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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Slack/Lnk_Sign_in'))

WebUI.verifyElementPresent(findTestObject('Slack/Ttl_Sign_in'), 0)

WebUI.verifyMatch(WebUI.getUrl(), 'https://slack.com/signin', false)

println('Url : ' + WebUI.getUrl())

WebUI.setText(findTestObject('Slack/Txt_Workspace'), Workspace)

WebUI.click(findTestObject('Slack/Btn_Continue'))

WebUI.setText(findTestObject('Slack/Txt_Email'), Email)

WebUI.setEncryptedText(findTestObject('Slack/Txt_Password'), 'TnIUuRkOiFleVCR0wLeDxA==')

WebUI.click(findTestObject('Slack/Btn_Sing_in'))

