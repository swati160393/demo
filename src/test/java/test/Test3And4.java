package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Test3And4 {
    public static void sample_test() {
        System.out.println("The Test starts here");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.tendable.com");

            // Test-6: Goto "Contact" menu ,complete the form—excluding the "Message" field.
            WebElement contactElement = driver.findElement(By.xpath("//a[text()='Contact']"));
            if (contactElement.isDisplayed() && contactElement.isEnabled()) {
                contactElement.click();
                Thread.sleep(2000);
                WebElement emailInput = driver.findElement(By.name("email"));
                emailInput.sendKeys("example@gmail.com");
                Thread.sleep(2000);
                WebElement firstnameInput = driver.findElement(By.name("firstname"));
                firstnameInput.sendKeys("swati");
                Thread.sleep(2000);
                WebElement lastnameInput = driver.findElement(By.name("lastname"));
                lastnameInput.sendKeys("jadhav");
                Thread.sleep(2000);
                WebElement companyInput = driver.findElement(By.name("company"));
                companyInput.sendKeys("Siemens");
                Thread.sleep(2000);
                WebElement dropdownElement = driver.findElement(By.name("message_type")); // Adjust selector if
                                                                                          // necessary
                Select dropdown = new Select(dropdownElement);
                dropdown.selectByVisibleText("Marketing");
                Thread.sleep(2000);
                WebElement checkbox = driver.findElement(By.name("384607520")); // Adjust selector if necessary
                checkbox.click();
                Thread.sleep(2000);
                WebElement submitElement = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
                submitElement.click();
                Thread.sleep(4000);
                WebElement aboutElement = driver
                        .findElement(By.xpath("//*[contains(text(), 'Form Submission Failed')]"));
                if (aboutElement.isDisplayed() && aboutElement.isEnabled()) {
                    System.out.println("Form Submission Failed error is visible as expected on webpage");
                } else {
                    System.out.println("Form Submission Failed error is not visible as expected on webpage");
                }

            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("The Test Ends here");
            driver.close();
        }

    }
}
