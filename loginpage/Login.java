package loginpage;


import bsh.util.Util;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    Utils utils;

    By emailID =By.id("Email");
    By password =By.id("Password");
    By LoginButton =By.className("login-button");
    By regButton =By.className("register-button");

    public Login(WebDriver driver){
        this.driver=driver;
        utils = new Utils();

    }
    public  String getPageTitle(){
        String title =driver.getTitle();
        utils.waitForTitlePresent(title, 10);
        System.out.println("Login Page title is: "+ title);
        return title;
    }
    public boolean verifyRegisterButton(){return driver.findElement(regButton).isDisplayed();}

    public HomePage doLogin(String username, String Password){
        utils.waitForElementToBeVisible(emailID, 10);
        utils.doSendKey(emailID, username);
        utils.doSendKeys(password, Password);
        Utils.doClick(LoginButton);
        return new HomePage();
    }

}
