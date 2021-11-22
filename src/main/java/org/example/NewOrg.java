package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class NewOrg
{
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
        WebElement ddmenu = driver.findElement(By.xpath("//a[@class='unclickable']/span[text()='Проекты']"));
        action.moveToElement(ddmenu).build().perform();
        WebElement ddmenuProj = driver.findElement(By.xpath("//li[@data-route='crm_project_my']"));
        ddmenuProj.click();
        WebElement buttonNewProj = driver.findElement(By.cssSelector("div.btn-group > div.btn-group.icons-holder"));
        buttonNewProj.click();
        WebElement nameProj = driver.findElement(By.cssSelector("input[data-name=field__name]"));
        nameProj.sendKeys("skeklolz77881156551");
        WebElement organisation1 = driver.findElement(By.cssSelector("a.select2-choice.select2-default"));
        organisation1.click();
        WebElement organisation2 = driver.findElement(By.xpath("//div[@class='select2-result-label' and text()='«Все организации»']"));
        organisation2.click();
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/form/div[2]/div[3]/div/div[1]/div[2]/fieldset/div[4]/div[1]/div[2]/div/a/span[2]")));
        Select dropdown1 = new Select(driver.findElement(By.name("crm_project[businessUnit]")));
        dropdown1.selectByVisibleText("Research & Development");
        Select dropdown2 = new Select(driver.findElement(By.name("crm_project[curator]")));
        dropdown2.selectByVisibleText("Амелин Владимир");
        Select dropdown3 = new Select(driver.findElement(By.name("crm_project[rp]")));
        dropdown3.selectByVisibleText("Applanatest Applanatest Applanatest");
        Select dropdown4 = new Select(driver.findElement(By.name("crm_project[manager]")));
        dropdown4.selectByVisibleText("Applanatest1 Applanatest1 Applanatest1");
        WebElement btnSave = driver.findElement(By.xpath("//button[contains(text(), 'Сохранить и закрыть')]"));
        btnSave.click();

        //driver.quit();


    }


}
