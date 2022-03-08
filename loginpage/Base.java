package loginpage;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class Base {
WebDriver driver;
Properties prop;


    public Properties initialiseProperties(String browserName) {
        if (browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();

        }else{
            System.out.println(browserName + "Browser is invalid, please enter correct name");


    }

    public WebDriver initialiseDriver() {
            prop = new Properties();
            try {
                FileInputStream ip =new FileInputStream("C:\\Users\\visha\\IdeaProjects\\Registraion\\loginPage\\src\\ "+ "test\\resources\\TestData\\config.properties )
            }

        }


    }
}
