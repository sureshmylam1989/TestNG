package com.networkTabLogs;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestPerformace {

	public static void main(String[] args)
			throws InterruptedException, org.codehaus.jackson.JsonParseException, JsonMappingException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suresh Mylam\\git\\qa_autotest_judi\\src\\main\\resources\\drivers\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(caps());
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://udw.agmednet.net");

		Thread.sleep(3000);
		driver.findElement(By.id("user")).sendKeys("auto_udw_reviewer1");
		driver.findElement(By.id("password")).sendKeys("Sail2Fast!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		try {
			driver.findElement(By.id("more_ms")).click();
			List<WebElement> oElement = driver.findElements(
					By.xpath("//div[@class='ui-multiselect-menu ui-widget ui-widget-content ui-corner-all'][3]/ul/li"));
			boolean flagStatus = selectDropDown_Search_MoreOptions(oElement, "AEID");
			if (flagStatus) {
				driver.findElement(By.id("searchselect_aeId")).click();
			}
			driver.findElement(By.id("searchinput_aeId")).sendKeys("AEID_20190402_141431_02");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.document.getElementById('searchinput_aeId').blur();");
			js.executeScript("window.document.getElementById('searchButton').click();");
			js.executeScript("window.document.getElementById('searchinput_aeId').focus();");
			js.executeScript("window.document.getElementById('searchinput_aeId').click();");
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ESCAPE).build().perform();
			Thread.sleep(5000);
		} catch (Exception e) {

		}

		Logs logs = driver.manage().logs();
		LogEntries entries = logs.get(LogType.PERFORMANCE);

		try {
			for (LogEntry logEntry : entries) {
				ObjectMapper mapper = new ObjectMapper();
				JsonNode readValue = null;
				readValue = mapper.readValue(logEntry.getMessage(), JsonNode.class);
				if ("Network.responseReceived".equals(readValue.get("message").get("method").asText().trim())) {
					System.out.println(readValue.get("message").get("params").get("response").get("url").asText());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static DesiredCapabilities caps() {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		LoggingPreferences logPrefs = new LoggingPreferences();
		logPrefs.enable(LogType.PERFORMANCE, Level.FINEST);
		caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		// options.addArguments("-incognito");
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		return caps;
	}

	public static boolean selectDropDown_Search_MoreOptions(List<WebElement> oElement, String expectedValue) {
		boolean flag = true;
		int iListCount = oElement.size();
		for (int j = 0; j < iListCount; j++) {
			String str = oElement.get(j).findElement(By.tagName("span")).getText();
			if (str.equalsIgnoreCase(expectedValue)) {
				if (!oElement.get(j).findElement(By.tagName("input")).isSelected()) {
					if (expectedValue.equalsIgnoreCase("AEID")) {
						oElement.get(j).findElement(By.xpath("//input[@value = 'aeId']")).click();
						break;
					} else if (expectedValue.equalsIgnoreCase("Deleted")) {
						// new
						// Actions(driver).moveToElement(oElement.get(j).findElement(By.xpath("//input[@value
						// = 'deleted']"))).click().perform();
						oElement.get(j).findElement(By.xpath("//input[@value = 'deleted']")).sendKeys("");
						oElement.get(j).findElement(By.xpath("//input[@value = 'deleted']")).click();
						flag = false;
						break;
					}

				}
				break;
			}
		}
		return flag;
	}

	// private static void printLogReceived(LogEntries logEntries) throws
	// JsonParseException, JsonMappingException, IOException {
	//
	// for (LogEntry logEntry : logEntries) {
	// ObjectMapper mapper = new ObjectMapper();
	// JsonNode readValue = null;
	// readValue = mapper.readValue(logEntry.getMessage(), JsonNode.class);
	// if ("Network.responseReceived".equals(readValue.get("message")
	// .get("method").asText().trim())) {
	// System.out.print(readValue.get("message").get("params")
	// .get("timestamp").asText());
	// System.out.print(" ");
	// System.out.println(readValue.get("message").get("params")
	// .get("response").get("url").asText());
	// }
	// }
	// }

}
