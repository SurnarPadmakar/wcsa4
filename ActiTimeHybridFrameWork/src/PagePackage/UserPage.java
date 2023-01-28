package PagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {
	@FindBy(xpath="//a[@class='content users']") private WebElement userTab;
	@FindBy(xpath="//*[@id=\"container\"]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/input") private WebElement creatuserbutton;
	@FindBy(xpath="//*[@id=\"container\"]/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[1]/td[3]/input")private WebElement userName;
	@FindBy(xpath="//*[@id=\"container\"]/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[4]/table/tbody/tr[1]/td[3]/input")private WebElement password;
	@FindBy(xpath="//*[@id=\"container\"]/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[4]/table/tbody/tr[2]/td[3]/input")private WebElement retypePassword;
	@FindBy(xpath="//*[@id=\"container\"]/form/table/tbody/tr[3]/td/table/tbody/tr[9]/td[2]/table/tbody/tr[1]/td[3]/input")private WebElement lastName;
	@FindBy(xpath="//*[@id=\"container\"]/form/table/tbody/tr[3]/td/table/tbody/tr[9]/td[2]/table/tbody/tr[2]/td[3]/input")private WebElement firstName;
    @FindBy(xpath="//*[@id=\"container\"]/form/table/tbody/tr[4]/td/input[1]")private WebElement creatUserButton;
    @FindBy(xpath="//*[@id=\"container\"]/form/table/tbody/tr[4]/td/input[2]")private WebElement cancleButton;
	public WebElement getUserTab() {
		return userTab;
	}
	public WebElement getCreatuserbutton() {
		return creatuserbutton;
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getRetypePassword() {
		return retypePassword;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getCreatUserButton() {
		return creatUserButton;
	}
	public WebElement getCancleButton() {
		return cancleButton;
	}


}
