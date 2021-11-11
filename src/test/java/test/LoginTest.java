package test;

import java.io.IOException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends Baseclass {
	
	@Parameters({"UserName", "Password"})
	@Test(enabled=true)
	public void NegativeLogin(String UserNameVal, String PasswordVal) {
		
		test = report.startTest("Negative Login Test");
		LoginPage login = new LoginPage();
		login.Login(UserNameVal,PasswordVal);
		login.ErrorCheck();
		report.endTest(test);
		
	}
	
	@Parameters({"UserName","CorrectPassword"})
	@Test(enabled=true)
	public void PositiveLogin(String UserNameVal, String PasswordVal) {
		
		test = report.startTest("Positive Login Test");
		LoginPage login = new LoginPage();
		login.Login(UserNameVal,PasswordVal);
		report.endTest(test);
		
		
	}
	
	@Test
	public void ExcelTest() throws IOException {
		
		
		String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordVal = sheet.getRow(1).getCell(1).getStringCellValue();
		
		
		test = report.startTest("Negative Login Test");
		LoginPage login = new LoginPage();
		login.Login(UserNameVal,PasswordVal);
		login.ErrorCheck();
		report.endTest(test);
		
	}
	
}
