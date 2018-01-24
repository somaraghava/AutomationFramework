package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Library;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest{

	@Test
	public void testValidLogin() throws InterruptedException {
	
		
		LoginPage tl=new LoginPage(driver);
		
		
		String username=Library.getCellValue("validdata",1,0);
		String password=Library.getCellValue("validdata",1,1);
		
		tl.setUsername(username);
		Thread.sleep(2000);
		tl.setPassword(password);
		Thread.sleep(2000);
		tl.clickLog();
		
	}	
	
}


