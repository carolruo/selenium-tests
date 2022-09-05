package com.letscode.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KabumTest {

    private void pesquisarPor(final String stringPesquisa) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        KabumSearch page = new KabumSearch();

        Thread.sleep(3000);
        page.cookiesAgreement();

        WebElement campoPesquisado = page.getSearchInput();
        campoPesquisado.clear();
        campoPesquisado.sendKeys(stringPesquisa);

        System.out.println("Título da página: " + page.getTitle());

        campoPesquisado.submit();

        Thread.sleep(3000);
        page.onSaleFilter();

        Thread.sleep(3000);
        page.ramFilter();

        Thread.sleep(3000);
        page.videoFilter();
    }

    @Test
    public void testPesquisarPor() throws InterruptedException {
        pesquisarPor("pc");

    }
}
