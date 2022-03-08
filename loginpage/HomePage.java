package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{
    WebDriver driver;
    utils utils;

    By logOut = By.className("ico-logout");
    By myAccount =By.className("ico-account");

    public HomePage (WebDriver driver){
        this.driver=driver;
        utils = new utils(driver);
    }
    public boolean isLogoutPresent(){
        return utils.isElementDisplayed(Logout);

    }
  public String getLogoutText(){
        return utils.doGetText(Logout);

  }
  public boolean isMyAccountPresent(){
        return utils.isElementDisplayed(myAccount);
  }
}
