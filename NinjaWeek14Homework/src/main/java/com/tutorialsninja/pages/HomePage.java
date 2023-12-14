package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By desktoplink = By.xpath("//ul[@class='nav navbar-nav']/li[1]/a");
    By showAllDesktopsLink = By.xpath("//ul[@class='nav navbar-nav']/li[1]/div/a");
    By laptopsAndNotebooksLink = By.xpath("//ul[@class='nav navbar-nav']/li[2]/a");
    By showAllLaptopsAndNotebooks = By.xpath("//ul[@class='nav navbar-nav']/li[2]/div/a");
    By componentsLink = By.xpath("//ul[@class='nav navbar-nav']/li[3]/a");
    By showAllComponents = By.xpath("//ul[@class='nav navbar-nav']/li[3]/div/a");
    public void clickOnDesktopLink() {
        mouseHoverToElementAndClick(desktoplink);
        clickOnElement(showAllDesktopsLink);
    }
    public void clickOnLaptopsAndNotebooksLink(){
        mouseHoverToElementAndClick(laptopsAndNotebooksLink);
        clickOnElement(showAllLaptopsAndNotebooks);
    }
    public void clickOnComponentsLink(){
        mouseHoverToElementAndClick(componentsLink);
        clickOnElement(showAllComponents);
    }


}
