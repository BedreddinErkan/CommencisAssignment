package com.assignment.step_definitions;

import com.assignment.pages.DashboardPage;
import com.assignment.utilities.BrowserUtils;
import com.assignment.utilities.ConfigurationReader;
import com.assignment.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TheLatestNewsStep_Def {

    @Given("user should able access main page")
    public void user_should_able_access_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        BrowserUtils.waitFor(1);

    }

    @Given("verify user should see {string}")
    public void verify_user_should_see(String Latest) {
        Assert.assertTrue(new DashboardPage().TheLatest.isDisplayed());
        Assert.assertEquals(Latest,new DashboardPage().TheLatest.getText());

    }

    @Then("verify each news has {string} and {string}")
    public void verify_each_news_has_and(String author, String image) {

        List<WebElement> authorsE = new DashboardPage().authors;
        List<String> authors = BrowserUtils.getElementsText(new DashboardPage().authors);

        System.out.println("authors = " + authors);

        for (WebElement element : authorsE) {
            Assert.assertTrue(element.isDisplayed());
        }

        List<WebElement> imagesE = new DashboardPage().Pictures;

        for (WebElement images : imagesE) {
            Assert.assertTrue(images.isDisplayed());
        }
    }

    @When("user click one of news from {string}")
    public void user_click_one_of_news_from(String string) {
        new DashboardPage().Article.click();
        BrowserUtils.waitFor(1);
    }

    @When("verify {string} and {string} is same")
    public void verify_and_is_same(String expectedTitle, String actualTitle) {
        expectedTitle = new DashboardPage().ArticleTitle.getText()+" | TechCrunch";
         actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("verify the {string} within the news content")
    public void verify_the_within_the_news_content(String linkText) {
        List<WebElement> ArticleLinks = new DashboardPage().ArticleLinks;

        for (WebElement articleLink : ArticleLinks) {
            Assert.assertTrue(articleLink.isEnabled());
        }
    }



}
