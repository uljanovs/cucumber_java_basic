package stepDefinitions;

import com.gargoylesoftware.htmlunit.html.DomNode;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages_sample.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StepDefsUserStory12 {
    private static WebDriverWait wait;
    static long startTime;
    private WebDriver driver;
    static pages_sample.AppleCinemaProduct AppleCinemaProduct;
    static pages_sample.IPhoneProduct IPhoneProduct;
    static pages_sample.HomePage HomePage;
    static pages_sample.Checkout Checkout;
    static Review Review;
    static LogInPage logInPage;

    public StepDefsUserStory12() {
        this.driver = Hooks.driver;
        logInPage = PageFactory.initElements(Hooks.driver, LogInPage.class);
        AppleCinemaProduct = PageFactory.initElements(Hooks.driver, AppleCinemaProduct.class);
        IPhoneProduct = PageFactory.initElements(Hooks.driver, IPhoneProduct.class);
        HomePage = PageFactory.initElements(Hooks.driver, HomePage.class);
        Checkout = PageFactory.initElements(Hooks.driver, Checkout.class);
        Review = PageFactory.initElements(Hooks.driver, Review.class);
        wait = (WebDriverWait) new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class);
        driver = new ChromeDriver();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    //scenario: open product page

    @Given("^I am on the HomePage$")
    public void i_am_on_the_home_page() throws Throwable {
        driver.get(HomePage.GetHomePage());
    }

    @And("^I click on Components tab$")
    public void i_click_on_components() throws Throwable {
        AppleCinemaProduct.clickComponents();
    }

    @And("^I select Monitors$")
    public void iSelectMonitors() throws Throwable {
        AppleCinemaProduct.clickMonitors();
    }

    @When("^I click on Apple Cinema name$")
    public void i_click_on_apple_cinema_name() throws Throwable {
        AppleCinemaProduct.clickAppleCinemaName();
    }

    @Then("^I am redirected to Apple Cinema page$")
    public void i_am_redirected_to_apple_cinema_page() throws Throwable {
        AppleCinemaProduct.GetAppleCinemaPage();
    }


    @When("^I click on Apple Cinema image$")
    public void i_click_on_apple_cinema_image() throws Throwable {
        AppleCinemaProduct.clickAppleCinemaImage();
    }

    //repeated:then i am redirected..



    //next scenario: presence of information about product


    @Then("^I am able to see product name$")
    public void iAmAbleToSeeProductName() throws Throwable {
        assertTrue(AppleCinemaProduct.nameAppleCinema.isDisplayed());
    }
    @And("^I am able to see product image$")
    public void seeProductImage() throws Throwable {
        assertTrue(AppleCinemaProduct.imageAppleCinema.isDisplayed());
    }
    @And("^I am able to see product price$")
    public void seeProductPrice() throws Throwable {
        assertTrue(AppleCinemaProduct.Price.isDisplayed());
    }
    @And("^I am able to see available options$")
    public void seeAvailableOptions() throws Throwable {
        assertTrue(AppleCinemaProduct.AvailableOptions.isDisplayed());
    }
    @And("^I am able to see description$")
    public void seeDescription() throws Throwable {
        assertTrue(AppleCinemaProduct.Description.isDisplayed());
    }
    @And("^I am able to see specification$")
    public void seeSpecification() throws Throwable {
        assertTrue(AppleCinemaProduct.Specification.isDisplayed());
    }
    @And("^I am able to see review$")
    public void seeReview() throws Throwable {
        assertTrue(AppleCinemaProduct.Review.isDisplayed());
    }
    @And("^I am able to see Compare button$")
    public void seeCompareButton() throws Throwable {
        assertTrue(AppleCinemaProduct.CompareButton.isDisplayed());
    }
    @And("^I am able to see Add to Wish list button$")
    public void seeWishListButton() throws Throwable {
        assertTrue(AppleCinemaProduct.AddToWishListButton.isDisplayed());
    }
    @And("^I am able to see Add to Cart button$")
    public void seeAddToCartButton() throws Throwable {
        assertTrue(AppleCinemaProduct.AddToCartButton.isDisplayed());
    }



    //next scenario: add to cart


    @Given("^I am on the IPhonePage$")
    public void iAmOnTheIPhonePage() {
        driver.get(IPhoneProduct.GeIPhonePage());

    }

    @When("^I click on Add to Cart Button$")
    public void iClickOnAddToCartButton() {
        IPhoneProduct.clickAddToCart();

    }

    @Then("^IPhone is added to Cart$")
    public void iphoneIsAddedToCart() {
        IPhoneProduct.clickToSeeCart();
        assertTrue(IPhoneProduct.IPhoneIsAddedToCart.isDisplayed());
    }

    //next scenario: checkout

    @When("^I click on Checkout Button$")
    public void iClickOnCheckoutButton() {
        Checkout.clickCheckout();
    }

    @Then("^I am redirected to checkout page$")
    public void iAmRedirectedToCheckoutPage() {
        driver.get(Checkout.CheckoutPage());
    }

    @When("^I select Billing Details$")
    public void iSelectBillingDetails() {
        Checkout.clickExistingAddress();
    }

    @And("^I click Continue to Delivery Details$")
    public void iClickContinueToDeliveryDetails() {
        Checkout.clickContinueOne();
    }

    @And("^I select Delivery Details$")
    public void iSelectDeliveryDetails() {
        Checkout.clickExistingDeliveryAddress();
    }

    @And("^I click Continue to Delivery Method$")
    public void iClickContinueToDeliveryMethod() {
        Checkout.clickContinueTwo();
    }

    @And("^I select Delivery Method$")
    public void iSelectDeliveryMethod() {
        Checkout.clickFlatRate();
    }

    @And("^click Continue to Payment Method$")
    public void clickContinueToPaymentMethod() {
        Checkout.clickContinueThree();
    }

    @And("^I select Cash On Delivery$")
    public void iSelectPaymentMethod() {
        Checkout.clickCash();
    }

    @And("^I click Agree$")
    public void iClickAgree() {
        Checkout.clickAgree();
    }

    @And("^I click Continue to Confirm Order$")
    public void iClickContinueToConfirmOrder() {
        Checkout.clickContinueFour();
    }

    @And("^I click Confirm Order$")
    public void iClickConfirmOrder() {
        Checkout.clickConfirm();
    }

    @Then("^I see that My Order is placed$")
    public void iSeeThatMyOrderIsPlaced() {
        assertTrue(Checkout.ConfirmationMessage.isDisplayed());
    }







   /* @And("^I see that new person (.+) is added$")
    public void i_see_that_new_person_is_added(String name) throws Throwable {
    }

    private boolean isNewNamePresent (By xpath){
        try {
            driver.findElement(By.xpath("//*[@id=\"person3\"]/span[3]"));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }*/

}