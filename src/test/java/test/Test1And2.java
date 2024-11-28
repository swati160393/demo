package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Test1And2 {
    public static void sample_test() {
        System.out.println("The Test starts here");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.tendable.com");
            // Test-1: Confirm accessibility of the top-level menus: About and to check of
            // 'DemoElement' is is present and active
            WebElement aboutElement = driver.findElement(By.linkText("About"));
            if (aboutElement.isDisplayed() && aboutElement.isEnabled()) {
                System.out.println("The 'About' element is visible and accessible.");
                Thread.sleep(2000);
                aboutElement.click();
                Thread.sleep(2000);
                WebElement DemoElement = driver.findElement(By.xpath("(//a[@href='/book-a-demo'])[1]"));
                if (DemoElement.isDisplayed() && DemoElement.isEnabled()) {
                    System.out.println("The 'DemoElement' ButtonButton is visible and accessible on Contact page");
                } else {
                    System.out.println("The 'DemoElement' element is not visible or accessible  on Contact page");
                }
            } else {
                System.out.println("The 'About' element is not visible and accessible.");
            }

            // Test-2: Confirm accessibility of the top-level menus: Products and to check
            // of 'DemoElement' is is present and active
            WebElement productsElement = driver.findElement(By.xpath("//a[text()='Products']"));
            if (productsElement.isDisplayed() && productsElement.isEnabled()) {
                System.out.println("The 'Products' element is visible and accessible.");
                productsElement.click();
                WebElement DemoElement = driver.findElement(By.xpath("(//a[@href='/book-a-demo'])[1]"));
                if (DemoElement.isDisplayed() && DemoElement.isEnabled()) {
                    System.out.println("The 'DemoElement' ButtonButton is visible and accessible on Products page");
                } else {
                    System.out.println("The 'DemoElement' element is not visible or accessible  on Products page");
                }
            } else {
                System.out.println("The 'Products' element is not visible or accessible.");
            }

            // Test-3: Confirm accessibility of the top-level menus: Sectors and to check of
            // 'DemoElement' is is present and active
            WebElement sectorsElement = driver.findElement(By.xpath("//a[text()='Sectors']"));
            if (sectorsElement.isDisplayed() && sectorsElement.isEnabled()) {
                System.out.println("The 'Sectors' element is visible and accessible.");
                sectorsElement.click();
                WebElement DemoElement = driver.findElement(By.xpath("(//a[@href='/book-a-demo'])[1]"));
                if (DemoElement.isDisplayed() && DemoElement.isEnabled()) {
                    System.out.println("The 'DemoElement' ButtonButton is visible and accessible on Sectors page");
                } else {
                    System.out.println("The 'DemoElement' element is not visible or accessible  on Sectors page");
                }
            } else {
                System.out.println("The 'Sectors' element is not visible or accessible.");
            }

            // Test-4: Confirm accessibility of the top-level menus: "Content Hub" and to
            // check of 'DemoElement' is is present and active
            WebElement contentHubElement = driver.findElement(By.xpath("//a[text()='Content Hub']"));
            if (contentHubElement.isDisplayed() && contentHubElement.isEnabled()) {
                System.out.println("The 'Content Hub' element is visible and accessible.");
                contentHubElement.click();
                WebElement DemoElement = driver.findElement(By.xpath("(//a[@href='/book-a-demo'])[1]"));
                if (DemoElement.isDisplayed() && DemoElement.isEnabled()) {
                    System.out.println("The 'DemoElement' ButtonButton is visible and accessible on Content Hub page");
                } else {
                    System.out.println("The 'DemoElement' element is not visible or accessible  on Content Hub page");
                }
            } else {
                System.out.println("The 'Content Hub' element is not visible or accessible.");
            }

            // Test-5: Confirm accessibility of the top-level menus: "Contact" and to check
            // of 'DemoElement' is is present and active
            WebElement contactElement = driver.findElement(By.xpath("//a[text()='Contact']"));
            if (contactElement.isDisplayed() && contactElement.isEnabled()) {
                System.out.println("The 'Contact' element is visible and accessible.");
                contactElement.click();
                WebElement DemoElement = driver.findElement(By.xpath("(//a[@href='/book-a-demo'])[1]"));
                if (DemoElement.isDisplayed() && DemoElement.isEnabled()) {
                    System.out.println("The 'DemoElement' ButtonButton is visible and accessible on Contact page");
                } else {
                    System.out.println("The 'DemoElement' element is not visible or accessible  on Contact page");
                }
            } else {
                System.out.println("The 'Contact' element is not visible or accessible.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("The Test Ends here");

            driver.close();
        }

    }
}
