package com.agmednet.rwd;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.remote.http.W3CHttpCommandCodec;
import org.openqa.selenium.remote.http.W3CHttpResponseCodec;
import org.testng.annotations.Test;

public class TestRDW {
	public static RemoteWebDriver createDriverFromSession(final SessionId sessionId, URL command_executor) {
		CommandExecutor executor = new HttpCommandExecutor(command_executor) {
			@Override
			public Response execute(Command command) throws IOException {
				Response response = null;
				if (command.getName() == "newSession") {
					response = new Response();
					response.setSessionId(sessionId.toString());
					response.setStatus(0);
					response.setValue(Collections.<String, String>emptyMap());
					try {
						Field commandCodec = null;
						commandCodec = this.getClass().getSuperclass().getDeclaredField("commandCodec");
						commandCodec.setAccessible(true);
						commandCodec.set(this, new W3CHttpCommandCodec());
						Field responseCodec = null;
						responseCodec = this.getClass().getSuperclass().getDeclaredField("responseCodec");
						responseCodec.setAccessible(true);
						responseCodec.set(this, new W3CHttpResponseCodec()); // JsonHttpCommandCodec --> firefox and
																				// W3CHttpResponseCodec ---> chrome
					} catch (NoSuchFieldException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				} else {
					response = super.execute(command);
				}
				return response;
			}
		};
		return new RemoteWebDriver(executor, new DesiredCapabilities());
	}
	
	public void selectRadioButton(List<WebElement> oElement, String option) {
		int radioCount = oElement.size();
		for (int i = 0; i < radioCount; i++) {
			String radioValue = oElement.get(i).getAttribute("value");
			if (radioValue.equalsIgnoreCase(option)) {				
					oElement.get(i).click();				
				break;
			}
		}
	}

	@Test
	public void Test1() throws MalformedURLException, AWTException {// throws MalformedURLException, AWTException
		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Suresh Mylam\\eclipse-workspace\\Testing\\src\\main\\resources\\exe\\chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();

		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Suresh Mylam\\git\\qa_autotest_judi\\src\\main\\resources\\drivers\\exe\\geckodriver.exe");
		 driver = new FirefoxDriver();

		HttpCommandExecutor executor = (HttpCommandExecutor) ((RemoteWebDriver) driver).getCommandExecutor();
		 URL url = executor.getAddressOfRemoteServer();
		 System.out.println(url);
		 SessionId session_id = ((RemoteWebDriver) driver).getSessionId();
		 System.out.println(session_id);
		 System.out.println("Done");
		
//		 http://localhost:16412
//			 069d3981-e39f-421e-994f-70edff7b0834
		 

//				 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
////		    RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:7055/hub"), "41ad3bed-53af-4fdf-a2d1-f3f428e7d071", capabilities);
		 
		 URL url3 = new URL("http://localhost:16412");
		 SessionId session_id3 = new SessionId("069d3981-e39f-421e-994f-70edff7b0834");
		 RemoteWebDriver driver2 = createDriverFromSession(session_id3, url3);




	}

}