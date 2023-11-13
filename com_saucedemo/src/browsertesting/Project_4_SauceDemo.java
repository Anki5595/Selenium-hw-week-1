package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-4 - ProjectName : com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */

public class Project_4_SauceDemo {

    static String browser = "Chrome";
    static String baseLink = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        // 1.Set up the browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver(); // Launch the Chrome browser
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver(); // Launch the Firefox browser
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver(); // Launch the Edge browser
        } else {
            System.out.println("Wrong browser name");  //Printing message if user enter any other browser
        }

        // 2.Open URL.
        driver.get(baseLink);
        driver.manage().window().maximize(); // maximize the window

        // 3.Print the title of the page.
        System.out.println("Page title: " + driver.getTitle());

        // 4.Print the current url.
        System.out.println("The current Url: " + driver.getCurrentUrl());

        // 5.Print the page source.
        System.out.println("Page source: " + driver.getPageSource());

        // 6.Enter the email to email field.
        driver.findElement(By.name("user-name")).sendKeys("performance_glitch_user");

        // 7. Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // 8.Click on Login Button.
        driver.findElement(By.id("login-button")).click();

        // 9.Print the current url.
        System.out.println("The current Url: " + driver.getCurrentUrl());

        // 10.Navigate to baseUrl
        driver.navigate().to(baseLink);

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Close the browser.
        driver.quit();
    }
}
