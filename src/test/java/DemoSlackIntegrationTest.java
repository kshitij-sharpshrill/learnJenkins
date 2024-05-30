import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoSlackIntegrationTest {

    @Test
    public void demoTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        try {
            driver.wait(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement googleSearch = driver.findElement(By.xpath("(//input[@value='Google Search'])[1]"));
        Assert.assertTrue(googleSearch.isDisplayed());
    }
}
