package com.assignment.pages;

import com.assignment.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

   @FindBy(css = ".river-byline__authors>span")
  public List<WebElement> authors;

    @FindBy( className= "post-block__media")
    public List<WebElement> Pictures;

    @FindBy(xpath = "//h2[@class='river__title river__title--home']")
    public WebElement TheLatest;

    @FindBy(css = ".post-block__content")
    public WebElement Article;

    @FindBy(css = ".article__title")
    public WebElement ArticleTitle;

    @FindBy(css = ".article-content>p>a")
    public List<WebElement> ArticleLinks;

}
