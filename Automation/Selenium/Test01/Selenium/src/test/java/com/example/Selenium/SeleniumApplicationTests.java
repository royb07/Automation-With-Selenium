package com.example.Selenium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

@SpringBootTest
class SeleniumApplicationTests {

	private ChromeDriver driver;

	@BeforeEach
	void getUp(){
		driver = new ChromeDriver();
		driver.get("https://www.udemy.com/join/login-popup/?locale=es_ES&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F");
	}

	@Test
	void abrirPagina() {

		driver.findElement(By.name("email")).sendKeys("Amarillo");
		WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement userNameField = waiting.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.className("ud-btn-label")).click();
		driver.close();
	}

}
