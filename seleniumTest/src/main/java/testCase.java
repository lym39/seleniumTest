
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testCase {

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://xxxx");

        //定位搜索框元素
        WebElement ele = driver.findElement(By.id("loginid"));
        ele.sendKeys("xxxx");

        //定位搜索框元素
        ele = driver.findElement(By.id("userpassword"));
        //输入需查询内容
        ele.sendKeys("xxxx");
//        ele.submit();

        driver.findElement(By.id("login")).click();

        //获取页面标题
        System.out.println("Page title is :" + driver.getTitle());
        //获取页面url
        System.out.println("Page url is :" + driver.getCurrentUrl());
        //关闭driver
//        driver.close();

    }

}
