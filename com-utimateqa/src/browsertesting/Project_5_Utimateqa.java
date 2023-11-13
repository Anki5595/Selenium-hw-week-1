package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-5 - ProjectName : com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser
 */

public class Project_5_Utimateqa {

    static String browser = "Chrome";
    static String baseUrl = "https://courses.ultimateqa.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //  1. Setup Chrome browser.
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
        driver.get(baseUrl);
        driver.manage().window().maximize(); //Maximize the window

        // 3.Print the title of the page.
        System.out.println("Page title: " + driver.getTitle());

        // 4.Print the current url.
        System.out.println("Current Url: " + driver.getCurrentUrl());

        // 5.Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        // 6.Click on ‘Sign In’ link
        driver.findElement(By.linkText("Sign In")).click();

        // 7.Print the current url
        System.out.println("The current signIn Url: " + driver.getCurrentUrl());

        // 8.Enter the email to email field.
        driver.findElement(By.id("user[email]")).sendKeys("abcd1123@gmail.com");

        // 9.Enter the password to password field.
        driver.findElement(By.id("user[password]")).sendKeys("123456");

        // 10.Click on Login Button.
       // driver.findElement(By.xpath("/html/body/main/div/div/article/form/div[6]/button")).click();
        WebElement signInButton = driver.findElement(By.xpath("(//button [@type='submit'])"));
        signInButton.click();
        // 11.Navigate to baseUrl.
        driver.navigate().to(baseUrl);

        // 12.Navigate forward to Homepage.
        driver.navigate().forward();

        // 13.Navigate back to baseUrl.
        driver.navigate().back();

        // 14.Refresh the page.
        driver.navigate().refresh();

        // 15.Close the browser
        driver.quit();
    }
}

