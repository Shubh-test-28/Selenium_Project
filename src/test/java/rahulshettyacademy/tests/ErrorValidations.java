package rahulshettyacademy.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.tests.pageobjects.CartPage;
import rahulshettyacademy.tests.pageobjects.CheckoutPage;
import rahulshettyacademy.tests.pageobjects.ConfirmationPage;
import rahulshettyacademy.tests.pageobjects.ProductCatalogue;

import java.io.IOException;
import java.util.List;

@Test
public class ErrorValidations extends BaseTest {
    public void submitOrder() throws InterruptedException, IOException {
        // TODO Auto-generated method stub
        String productName = "ZARA COAT 3";
        landingPage.loginApplication("Shubh28@gmail.com","Iamking@009");
        Assert.assertEquals("Incorrect email or password.",landingPage.getErrorMessage());

    }
}
