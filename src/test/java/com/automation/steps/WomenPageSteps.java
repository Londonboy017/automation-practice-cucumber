package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en_old.Ac;
import org.junit.Assert;

public class WomenPageSteps {
    @And("^I click on Women link$")
    public void iClickOnWomenLink() {
        new HomePage().clickOnWomen();
    }

    @Then("^Verify message 'WOMEN'$")
    public void verifyMessageWOMEN() {
        Assert.assertEquals("Women text not matched","WOMEN",new WomenCategoryPage().verifyWomenText());
    }

    @And("^I Change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty)  {
      new WomenCategoryPage().enterQty(qty);
    }

    @And("^I Select size \"([^\"]*)\"$")
    public void iSelectSize(String size) {
        new WomenCategoryPage().setSelectSize(size);
    }

    @And("^I  Select colour \"([^\"]*)\"$")
    public void iSelectColour(String colour) {
        new WomenCategoryPage().setSelectColour(colour);
    }

    @And("^I Click on Add To Cart Button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new WomenCategoryPage().setAddToCartButton();
        Thread.sleep(3000);
    }



    @And("^Verify the message 'Product successfully added to your shopping cart'$")
    public void verifyTheMessageProductSuccessfullyAddedToYourShoppingCart()throws InterruptedException {
            Assert.assertEquals("product is not added to cart","Product successfully added to your shopping cart",new WomenCategoryPage().setConfirmationText());
        }

    @And("^I Click on the product \"([^\"]*)\"$")
    public void iClickOnTheProduct(String product) {
        new WomenCategoryPage().setSelectProduct(product);
    }

    @Then("^Click on X button and close the popup$")
    public void clickOnXButtonAndCloseThePopup() {
        new WomenCategoryPage().setCloseWindow();
    }
}
