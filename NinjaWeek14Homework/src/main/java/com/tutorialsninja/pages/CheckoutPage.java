package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By newCustomer = By.xpath("//div[@id='collapse-checkout-option']/div/div/div[1]/h2");
    By guestCheckout = By.xpath("//div[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label/input");
    By continueTab = By.xpath("//div[@id='collapse-checkout-option']/div/div/div[1]/input");
    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.id("input-payment-email");
    By telephone = By.name("telephone");
    By address1 = By.xpath("//fieldset[@id='address']/div[2]/input");
    By city = By.name("city");
    By postCode = By.name("postcode");
    By country = By.id("input-payment-country");
    By state = By.id("input-payment-zone");
    By continueButton = By.xpath("//div[@class='pull-right']/input");
    By addComment = By.xpath("//div[@id='collapse-payment-method']/div/p[2]/textarea");
    By termsAndConditions = By.xpath("//div[@id='collapse-payment-method']/div/div[2]/div/input[1]");
    By continueButton1 = By.xpath("//div[@id='collapse-payment-method']/div/div[2]/div/input[2]");
    By warningMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
    public String getNewCustomerText(){
        return getTextFromElement(newCustomer);
    }
    public void clickOnCheckout(){
        clickOnElement(guestCheckout);
        clickOnElement(continueTab);
        sendTextToElement(firstName, "Ripti");
        sendTextToElement(lastName, "Patel");
        sendTextToElement(email, "ripti2827@gmail.com");
        sendTextToElement(telephone, "9879731846");
        sendTextToElement(address1, "15 Main Street");
        sendTextToElement(city, "Guildford");
        sendTextToElement(postCode, "GU2 9AA");
        selectByVisibleTextFromDropDown(country,"United Kingdom");
        selectByVisibleTextFromDropDown(state, "Essex");
        clickOnElement(continueButton);
        sendTextToElement(addComment, "Post Delivery");
        clickOnElement(termsAndConditions);
        clickOnElement(continueButton1);
    }
    public String verifyWarningMessage(){
        return getTextFromElement(warningMessage);
    }
}
