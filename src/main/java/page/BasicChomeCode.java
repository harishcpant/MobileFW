package page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BasicChomeCode {
    public static void main(String[] args) throws Exception {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 30");
        dc.setCapability("appPackage","com.android.chrome");
        dc.setCapability("appActivity","com.google.android.apps.chrome.Main");
        URL url=new URL("http://0.0.0.0:4723/wd/hub");
        AndroidDriver wd=new AndroidDriver(url, dc);
        Thread.sleep(10000);
        wd.get("https://www.amazon.in");
        Thread.sleep(3000);
        wd.findElement(By.className("android.widget.EditText")).sendKeys("samsung mobile");
        wd.findElement(By.className("android.view.View")).click();
    }
}
