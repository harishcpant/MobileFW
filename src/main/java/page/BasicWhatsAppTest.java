package page;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BasicWhatsAppTest {
	public static void main(String[] args) throws MalformedURLException {
		System.out.println("first step under test..1....test2...");
	    File app=new File("C:\\Harish\\Study\\Java\\EclipseWS\\MobileFW\\WhatsApp.apk");
	    System.out.println("first step under test..2");
	    DesiredCapabilities dc=new DesiredCapabilities();
	    dc.setCapability(CapabilityType.BROWSER_NAME,"");
	    dc.setCapability("deviceName", "Lenovo");
	    dc.setCapability("plateformVersion", "4.4.4");
	    dc.setCapability("platformName", "Android");
	    dc.setCapability("app", app.getAbsolutePath());     
	    dc.setCapability("appPackage", "com.whatsapp");
	    dc.setCapability("appActivity", "com.whatsapp.Main");
	    URL url=new URL("http://127.0.0.1:4723/wd/hub");
	    System.out.println("first step under test.3");
//	    WebDriver wd=new AndroidDriver<MobileDriver>(url, dc);
	    //Thread.sleep(6000);	
	    //wd.manage().timeouts().pageLoadTimeout(90L, TimeUnit.SECONDS);
		//wd.manage().timeouts().implicitlyWait(90L, TimeUnit.SECONDS);
	    //System.out.println("first step under test.4");

	}

}
