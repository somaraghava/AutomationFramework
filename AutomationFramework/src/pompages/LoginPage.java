package pompages;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
    
	
    public class LoginPage  {
		//declare webelements as pom class objects using FindBy annotation
		
		@FindBy(id="username")
		WebElement unTB;

		@FindBy(name="pwd")
		WebElement pwdTB;

		@FindBy(xpath="//div[text()='Login ']")
		WebElement logBtn;



	//initialize the pom objects using initElemenets method of PageFactory class

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver,this);
		
	}

	   //utilize the pom objets using setter methods
	      public void setUsername(String un) {
	    	  unTB.sendKeys(un);
	      }
	      public void setPassword(String pwd) {
	    	  pwdTB.sendKeys(pwd);
	      }
	      public void clickLog() {
	    	  logBtn.click();
	      }

	}


