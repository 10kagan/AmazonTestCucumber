package com.amazon.step_definitions;

import com.amazon.utilities.Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

 class Book {

    Pages pages = new Pages();

    @Given("Search for the book Ender's Game by Orson Scott Card")
    public void search_for_the_book_Enders_Game_by_Orson_Scott_Card(){

    }
    @And("Click on the book from the search")
    public void click_on_the_book_from_the_search(){

    }
    @Then("Add the book to your cart")
    public void add_the_book_to_your_cart(){

    }
    @Then("Navigate to your cart and verify the book is there")
    public void navigate_to_your_cart_and_verify_the_book_is_there(){

    }
    @Then("Remove the book from the cart and verify that it is no longer present")
    public void remove_the_book_from_the_cart_and_verify_that_it_is_no_longer_present(){

    }

}
