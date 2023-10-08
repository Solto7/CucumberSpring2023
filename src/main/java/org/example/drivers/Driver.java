package org.example.drivers;

import org.example.utils.ConfigReader;
import org.openqa.selenium.WebDriver;


public class Driver {

    private Driver() {
        // Singleton pattern Шаблон проектирования одиночка
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.out.println(ConfigReader.getProperty("browser"));
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeWebDriver();
                    break;
                //                case "firefox":
//                    driver = FireFoxWebDriver.loadFirefoxDriver();
//                    break;
//                case "safari":
//                    driver = SafariWebDriver.loadSafariDriver();
//                    break;
                default:
                    throw new IllegalArgumentException("You provide wrong Driver name");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            System.out.println("Error while closing");
        }
    }
}
