package Junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Baseclass {
     public static WebDriver driver;

    public static void browserlaunch() {

        driver = new ChromeDriver();
    }
    public static void url(String SE) {
        driver.get(SE);
        driver.manage().window().maximize();
    }
    public static  void sendkeys(WebElement w,String S){
        w.sendKeys(S);
    }

    public static void click(WebElement C){

        C.click();
    }

    public static void clear(WebElement clear){

        clear.clear();
    }
    public static  void selectByDropDown(WebElement element, String value) {
        Select dropdown = new Select(element);
        dropdown.selectByValue(value);
    }

    public  static void browserclose(){

        driver.close();



    }
    public static void quit(){
        driver.quit();
    }


    public static void m1(){
        System.out.println("hi");
    }










    }

