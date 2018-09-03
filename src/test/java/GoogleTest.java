import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static org.junit.Assert.assertEquals;

public class GoogleTest {

    @Step("Navigate to <http://www.google.com>")
    public void navigateTot(String url) throws InterruptedException {
        Driver.driver.get(url);
        Thread.sleep(10000);
        System.out.println("1 Step - Google page open");

    }

    @Step("Verify search button")
    public void verifySearchButton() throws InterruptedException {
        WebElement searchButton = Driver.driver.findElement(By.name("btnK"));
        searchButton.isDisplayed();
        Thread.sleep(1000);
        System.out.println("2 Step - button found");

    }

    @Step("Enter query text <Earth> in the search box and submit")
        public void enterQuery(String query) throws InterruptedException {
            WebElement searchBox = Driver.driver.findElement(By.name("q"));
            searchBox.sendKeys(query);
            searchBox.submit();
            Thread.sleep(5000);
            System.out.println("3 Step - Open page Earth");

    }

}
