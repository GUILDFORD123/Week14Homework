package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebooksPage extends Utility {
    By laptopsText = By.xpath("//div[@id='content']/h2");
    By sortByHighToLow = By.id("input-sort");
    By macBook = By.xpath("//div[@id='content']/div[4]/div[4]/div/div[2]/div[1]/h4/a");
    public String getLaptopsText() {
        return getTextFromElement(laptopsText);
    }
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
        selectByIndexFromDropDown(sortByHighToLow, 4);
    }
    public void verifyThatUserPlaceOrderSuccessfully(){
        selectByIndexFromDropDown(sortByHighToLow, 4);
        clickOnElement(macBook);
    }
}
