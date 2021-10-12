package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class AutomationFixture extends BaseSteps {

 //   And I launch URL "https://www.google.com/"

    @Given("I launch URL {string}")
    public void iopenurl(String arg0) {
        System.out.println("URL Opened");
        driver.get(arg0);   // hit url
        driver.manage().window().maximize();

    }

    @And("I enter username {string}")
    public void iEnterUsername(String arg0) {
//        driver.findElement(By.xpath("//tagName[@Attribute='value']")).sendKeys();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(arg0);

    }

    @And("I enter password {string}")
    public void iEnterPassword(String arg0) {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg0);
    }


    @When("I verify button {string} is present")
    public void iVerifyButtonIsPresent(String arg0) {
        Boolean buttonSubmitvalue = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
//                .isEnabled();
        System.out.println("Submit button is present :" + buttonSubmitvalue);

    }

    @Then("I click on button {string}")
    public void iClickOnButton(String arg0) {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String alertMessage = driver.findElement(By.xpath("//div[@role='alert']")).getText();
        if(alertMessage.length()>0){
            System.out.println("Displayed Alert message: "+ alertMessage);
        }
    }
}
