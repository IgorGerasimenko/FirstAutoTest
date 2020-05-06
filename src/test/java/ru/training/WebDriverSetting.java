package ru.training;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetting {
    public ChromeDriver driver;

    @Before
    public void SetUp () {
        System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");
        //путь на папку ХромДрайвера
        driver = new ChromeDriver();
        //инициализация драйвера
        System.out.println("Driver started");
    }

   // @After
   // public void close() {
     //   driver.quit();
        //команда на закрытие браузера
       // System.out.println("Driver stopped ");
   // }



}
