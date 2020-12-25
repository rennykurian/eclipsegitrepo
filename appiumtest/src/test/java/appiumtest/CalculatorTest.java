package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;

	public static void Opncalculator() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Moto");
		cap.setCapability("udid", "ZY32239G26");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");

		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appCapablity","com.android.calculator2.Calculator" );

		cap.setCapability("automationName", "UiAutomator2");
		URL url  =new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url, cap);
		//driver = new AppiumDriver<MobileElement>(cap);
		System.out.println("application started");
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			Opncalculator();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}

	}

}
