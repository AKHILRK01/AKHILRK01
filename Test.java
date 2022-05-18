import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");

        String relDatewiki = driver.findElement(By.xpath("//tbody//tr[12]")).getText();
        String languagewiki = driver.findElement(By.xpath("//tbody//tr[14]")).getText();


        driver.get("https://www.imdb.com/title/tt9389998/");
        String relDateimdb = driver.findElement(By.xpath("//a[text()='January 7, 2022 (United States)']")).getText();
        String languageimdb = driver.findElement(By.xpath("//a[text()='India']")).getText();

        if(relDatewiki.equals(relDateimdb)&&languagewiki.equals(languageimdb))
        {
            System.out.println("Both the strings from wiki and imdb are equal");
        }
        else
            System.out.println("Both the strings from wiki and imdb are not equal");

        driver.quit();
    }

}
