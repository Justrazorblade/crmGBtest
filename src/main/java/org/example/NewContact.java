package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class NewContact {
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://crm.geekbrains.space/user/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement login = driver.findElement(By.id("prependedInput"));
        login.sendKeys("Applanatest1");
        WebElement pass = driver.findElement(By.id("prependedInput2"));
        pass.sendKeys("Student2020!");
        WebElement buttonsubm = driver.findElement(By.id("_submit"));
        buttonsubm.click();
        Actions action = new Actions(driver);
        WebElement ddmenu = driver.findElement(By.xpath("//a[@class='unclickable']/span[text()='Контрагенты']"));
        action.moveToElement(ddmenu).build().perform();
        WebElement ddmenuCont = driver.findElement(By.xpath("//li[@data-route='crm_contact_index']"));
        ddmenuCont.click();
        WebElement newCont = driver.findElement(By.xpath("//a[@title='Создать контактное лицо']"));
        newCont.click();
        WebElement cname = driver.findElement(By.xpath("//input[@name='crm_contact[lastName]']"));
        cname.sendKeys("Oleg");
        WebElement clname = driver.findElement(By.cssSelector("input[data-name=field__first-name]"));
        clname.sendKeys("Assa");
        WebElement job = driver.findElement(By.name("crm_contact[jobTitle]"));
        job.sendKeys("boss");
        WebElement ddOrg = driver.findElement(By.xpath("//span[text()='Укажите организацию']/.."));
        ddOrg.click();
        WebElement ddOrgValue = driver.findElement(By.cssSelector("ul.select2-results > li:nth-child(3)"));
        ddOrgValue.click();
        WebElement btnSave = driver.findElement(By.xpath("//button[contains(text(), 'Сохранить и закрыть')]"));
        btnSave.click();

        //driver.quit();
    }
}
