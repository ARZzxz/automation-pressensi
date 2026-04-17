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

Mobile.startApplication('X:/Katalon/Automation_Mobile_Pressensi/com.folkatech.pressensi.apk', false)

String appPath = 'X:/Katalon/Automation_Mobile_Pressensi/com.folkatech.pressensi.apk'
int timeout = 10

String nik = '123123'
String password = 'password'

TestObject btnPengajuan = findTestObject('Lembur/android.widget.ImageButton - Pengajuan')
TestObject fieldNIK = findTestObject('android.widget.EditText - NIK (Nomor Induk Karyawan)')
TestObject fieldPassword = findTestObject('android.widget.EditText - Kata Sandi')
TestObject btnLogin = findTestObject('android.widget.Button - LOGIN')

Mobile.waitForElementPresent(fieldNIK, timeout)

Mobile.setText(fieldNIK, nik, 0)
Mobile.setText(fieldPassword, password, 0)

// handle keyboard nutup tombol login
if (!Mobile.verifyElementVisible(btnLogin, 3, FailureHandling.OPTIONAL)) {
	Mobile.hideKeyboard()
}

Mobile.tap(btnLogin, 0)

Mobile.tap(findTestObject('Lembur/android.widget.ImageButton - Pengajuan'), 0)

Mobile.tap(findTestObject('Lembur/android.widget.TextView - drop down'), 0)

Mobile.tap(findTestObject('Lembur/android.widget.CheckedTextView - Lembur'), 1)

// Tanggal
Mobile.tap(findTestObject('Lembur/Kalender/android.widget.EditText - Dari Tanggal'), 1)

Mobile.tap(findTestObject('Lembur/Kalender/android.view.View - tgl 29'), 1)

Mobile.tap(findTestObject('Lembur/Kalender/android.widget.Button - OKE'), 1)

// Jam Mulai
Mobile.tap(findTestObject('Lembur/Jam Mulai/android.widget.EditText - Jam Mulai'), 1)

Mobile.tap(findTestObject('Lembur/Jam Mulai/android.widget.RadialTimePickerViewRadialPickerTouchHelper - Jam 17'), 1)

Mobile.tap(findTestObject('Lembur/Jam Mulai/android.widget.RadialTimePickerViewRadialPickerTouchHelper - menit 30'), 1)

Mobile.tap(findTestObject('Lembur/Jam Mulai/android.widget.Button - OKE'), 1)

// Jam Selesai
Mobile.tap(findTestObject('Lembur/Jam Selesai/android.widget.EditText - Jam Selesai'), 1)

Mobile.tap(findTestObject('Lembur/Jam Selesai/android.widget.RadialTimePickerViewRadialPickerTouchHelper - Jam 19'), 1)

Mobile.tap(findTestObject('Lembur/Jam Selesai/android.widget.RadialTimePickerViewRadialPickerTouchHelper - menit 30'), 1)

Mobile.tap(findTestObject('Lembur/Jam Selesai/android.widget.Button - OKE'), 1)

// Deskripsi
Mobile.setText(findTestObject('Lembur/android.widget.EditText - Deskripsi'), 'Testing', 1)

if (Mobile.verifyElementVisible(findTestObject('Lembur/android.widget.Button - Ajukan'), 3, FailureHandling.OPTIONAL) == false) {
	Mobile.hideKeyboard()
}

Mobile.tap(findTestObject('Lembur/android.widget.Button - Ajukan'), 1)

Mobile.tap(findTestObject('Lembur/android.widget.Button - Ya'), 1)
