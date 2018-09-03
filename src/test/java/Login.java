import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login {

    @Step("Go to th page  <http://www.google.com>")
    public void navigateTot(String url) throws InterruptedException {
        Driver.driver.get(url);
        Thread.sleep(10000);
        System.out.println("1 Step - Google page open");
    }

    @Step("Enter query <facebook login> in the search box and submit")
    public void enterQuery(String query) throws InterruptedException {
        WebElement searchBox = Driver.driver.findElement(By.name("q"));
        searchBox.sendKeys(query);
        searchBox.submit();
        Thread.sleep(5000);
        System.out.println("3 Step - Enter in a q text -facebook login");
    }

    @Step("Go to sign up page")
    public void loginPage() throws InterruptedException {
        WebElement findElement = Driver.driver.findElement(By.linkText("Facebook - Log In or Sign Up"));
        findElement.click();
        Thread.sleep(10000);
        System.out.println("4 Step - Open login page");
    }

    @Step("Sign up customer with email and password")
    public void SingUpUser () throws InterruptedException {
        Driver.driver.findElement(By.cssSelector("#email")).sendKeys("aleks_yqsqmgx_test@tfbnw.net");
        Driver.driver.findElement(By.cssSelector("#pass")).sendKeys("12345qwert");
        Driver.driver.findElement(By.cssSelector("#loginbutton")).click();
        Thread.sleep(10000);
        System.out.println("Enter email and pass");
    }

    @Step("Verify user Name")
    public void VerifyUserName() throws InterruptedException {
        WebElement nameButton = Driver.driver.findElement(By.cssSelector("span._1vp5"));
        nameButton.isDisplayed();
        nameButton.click();
        Thread.sleep(10000);
        System.out.println("Test passed");
    }
}
