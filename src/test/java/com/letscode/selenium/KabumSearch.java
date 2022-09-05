package com.letscode.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KabumSearch extends Page{

    public KabumSearch() {
        super();
        driver.get("https://www.kabum.com.br/");
    }

    public WebElement getSearchInput() {
        return driver.findElement(By.name("query"));
    }

    public void onSaleFilter() {
        driver.findElement(By.xpath("//label[text()='Oferta']")).click();
    }

    public void cookiesAgreement() {
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    public void ramFilter() {
        driver.findElement(By.xpath("//label[text()='16 GB']")).click();
    }

    public void videoFilter() {
        driver.findElement(By.xpath("//label[text()='RTX 3070 Ti']")).click();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }
}
