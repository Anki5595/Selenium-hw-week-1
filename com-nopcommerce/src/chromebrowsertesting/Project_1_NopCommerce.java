package chromebrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demo.nopcommerce.com/login?returnUrl=%2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */

public class Project_1_NopCommerce {

    //Initializing variable
    static String browser = "chrome";
    static String baseUrl = "https://demo.nopcommerce.com/";
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
        System.out.println("The current URL: " + driver.getCurrentUrl());

        // 5.Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        // 6.Navigate to Url.
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);

        // 7.Print the current url.
        System.out.println("Get the current URL: " + driver.getCurrentUrl());

        // 8.Navigate back to the home page.
        driver.navigate().back();

        // 9.Navigate to the login page.
        driver.navigate().to(loginUrl);

        // 10.Print the current url.
        System.out.println("the login URL: " + driver.getCurrentUrl());

        // 11.Refresh the page.
        driver.navigate().refresh();

        // 12.Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abcd123@gmail.com");

        //13.Enter the password to password field.
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("123456");

        // 14.Click on Login Button.
        WebElement loginLink = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
        loginLink.click();

        // 15.Close the browser.
        driver.quit();
    }

}
