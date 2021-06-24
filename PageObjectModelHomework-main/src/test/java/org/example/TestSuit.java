package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    // object of each class
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    NikeProducts nikeProducts = new NikeProducts();
    ComputerPage computerPage = new ComputerPage();
    SoftwarePage softwarePage = new SoftwarePage();
    NewOnlinePage newOnlinePage = new NewOnlinePage();
    ResultVerificationPage resultVerificationPage = new ResultVerificationPage();

    @Test
    public void userShouldBeAbleToRegisterSuccessfully(){
        homePage.clickOnRegisterButton();
        registerPage.enterRegisterationDetails();

    }
    @Test
    public void userShouldBeAbleToChangeCurrency()
    {
   homePage.verifyCurrencySymbolInEachPrice();
    homePage.changeCurrency();
    homePage.verifyCurrencySymbolInEachPrice();

    }
    @Test
    public void userShouldBeAbleToSearchProductsSuccessfully()
    {
    homePage.nikeProductsSearch();
    nikeProducts.nikeProductsDisplayed();

    }
    @Test
    public void userShouldBeAbleToSeeAddToCartButtonForAllProducts()
    {
    homePage.addToCartButton();
    computerPage.clickOnSoftware();
    softwarePage.verifyAddtoCardButtonPresent();

    }
    @Test
    public void userShouldBeAbleToAddAndSeeNewComments()
    {
       // navigate to  news online detail page
        homePage.commentForNewOnlineStore();

        //fill comments details
        newOnlinePage.fillCommentDetails();


        //verify comment added success message
        newOnlinePage.verifyCommentAddedSuccessMessage();

        //verify comment present in comment list
        newOnlinePage.verifyCommentPresentInCommentList();

        //verify added comment is at last in comment list
        newOnlinePage.verifyAddedCommentsAtLastInTheList();

    }
}
