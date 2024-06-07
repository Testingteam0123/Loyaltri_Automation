package LoginObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscoverObj {
	@FindBy (id="floating_filled_email")
	public static WebElement emailAddress;
	
	@FindBy (id="floating_filled_password")
	public static WebElement password;
	
	@FindBy (xpath="//button[@type='button']")
	public static WebElement signIn;

}
