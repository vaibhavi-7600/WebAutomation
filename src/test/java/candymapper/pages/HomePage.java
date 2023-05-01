package candymapper.pages;

import Base.TestBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePage extends TestBase {

    @Test
    public void VerifyTitle() {

        String title = driver.getTitle();

        Assert.assertEquals(title, "CandyMapper.Com", "Web Title is verified");
    }

    @Test
    public void verifyPOPUP() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(By.id("popup-widget29284-close-icon")).click();
        Thread.sleep(10000);
        System.out.println("POPUp closed successfully");
    }
}
