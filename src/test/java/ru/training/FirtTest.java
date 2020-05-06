package ru.training;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;

public class FirtTest extends WebDriverSetting {
    //унаследовались от WebDriverSetting

    @Test
       public void FirtsTest() {
        //Открыть страницу, проверить имя страницы
            driver.get("https://www.training.ru");
        //команда "ГЕТ" для открытия страницы
        String title = driver.getTitle();
        //запросили тайтл
        Assert.assertTrue(title.equals("Тренинг-центр EPAM в России - программы обучения для студентов, а также тех, кто хочет начать карьеру в IT | training.ru"));
        //Асерт-проверка предположения, в данном случае, что имя страницы соответсвует значению

    }

    @Test
    public void FirstTest2() {
        //Залогинится (позитивный тест)
        driver.get("https://www.training.ru");
        driver.manage().window().maximize();
        //команда на раскрытие окна браузера в полный экран
        driver.findElement(By.cssSelector("#header > div > div.header-controls > div.header-control.header-auth > p")).click();
        //открыли окно "залогиниться"
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //инициализация WebDriverWait, таймаут 10 секунд
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInForm")));
        //Ждем загрузки элементов на странице, в данном случае кнопки "епам логин"
        driver.findElement(By.id("signInEmail")).sendKeys("shprotagera@yandex.ru");
        //ищем поле "логин", заполняем
        driver.findElement(By.id("signInPassword")).sendKeys("TestTestTest");
        //ищем поле "пароль", заполняем
        driver.findElement(By.xpath("//*[@id=\"signInForm\"]/input")).click();
        //ищем кнопку "войти", кликаем

    }

    @Test
    public void FirstTest3() {
        //Залогиниться (негативный тест-неверный емейл)"
        driver.get("https://www.training.ru");
        driver.manage().window().maximize();
        //команда на раскрите окна браузера в полный экран
        driver.findElement(By.cssSelector("#header > div > div.header-controls > div.header-control.header-auth > p")).click();
        //открыли окно "залогиниться"
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //инициализация WebDriverWait, таймаут 10 секунд
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInForm")));
        //Ждем загрузки элементов на странице, в данном случае кнопки "епам логин"
        driver.findElement(By.id("signInEmail")).sendKeys("shprotagera@yanx.ru");
        //ищем поле "логин", заполняем
        driver.findElement(By.id("signInPassword")).sendKeys("TestTestTest");
        //ищем поле "пароль", заполняем
        driver.findElement(By.xpath("//*[@id=\"signInForm\"]/input")).click();
        //ищем кнопку "войти", кликаем
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#signInForm > div.popup__error-message.ng-binding")));
        //Ждем появления сообщения об ошибке

    }

}