package shubhamProject.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import shubhamProject.TestComponents.BaseTest;
import shubhamProject.tests.pageobjects.*;

import java.io.IOException;
import java.util.List;

@Test
public class SubmitOrder extends BaseTest {
    public void submitOrder() throws InterruptedException, IOException {
        // TODO Auto-generated method stub
        String productName = "ZARA COAT 3";
        ProductCatalogue productCatalogue = landingPage.loginApplication("Shubh28@gmail.com","Iamking@000");

        List<WebElement> products= productCatalogue.getProductList();
        productCatalogue.addProductToCart(productName);

        CartPage cartPage = productCatalogue.goToCartPage();
        Boolean match = cartPage.VerifyProductDisplay(productName);
        Assert.assertTrue(match);
        CheckoutPage checkoutPage = cartPage.goToCheckout();
        checkoutPage.selectCountry("india");
        ConfirmationPage confirmationpage = checkoutPage.submitOrder();

        String confirmMessage = confirmationpage.getConfirmationMessage();
        Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));


    }
}
