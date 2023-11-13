package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-3 - ProjectName : com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */

public class Project_3_HeroKuApp {

    static String browser = "chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
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

        // 2.Open the URL
        driver.get(baseUrl);
        driver.manage().window().maximize(); // Maximize the browser

        // 3.Print the title of the page.
        System.out.println("The title of the page: " + driver.getTitle());

        // 4.Print the current url.
        System.out.println("The current Url: " + driver.getCurrentUrl());

        //  5.Print the page source.
        System.out.println("Page source: " + driver.getPageSource());

        // 6.Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("tomsmith");

        // 7.Enter the password to password field.
        WebElement PasswordField = driver.findElement(By.id("password"));
        PasswordField.sendKeys("SuperSecretPassword!");

        // 8.Click on Login Button.
        WebElement logIn = driver.findElement(By.tagName("button"));
        logIn.click();

        // 9.Print the current url.
        System.out.println("Current url: " + driver.getCurrentUrl());

        // 10.Refresh the page.
        driver.navigate().refresh();

        // 11.Close the browser.
        driver.quit();
    }

}
