package com.amazon.pages;

import com.amazon.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Book extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchbar;

    @FindBy(xpath = "")
    public WebElement bookName;

    @FindBy(id = "a-autoid-2-announce")
    public WebElement hardcover;

    @FindBy(id = "add-to-cart-button")
    public WebElement addCartButton;

    @FindBy(id = "//*[@id=\"nav-cart\"]/span[3]")
    public WebElement cardButton;

    @FindBy (name = "submit.delete.Cb7fb7088-08d1-45d7-a0ff-2d05f71a0ca8")
    public WebElement deleteButton;
}
