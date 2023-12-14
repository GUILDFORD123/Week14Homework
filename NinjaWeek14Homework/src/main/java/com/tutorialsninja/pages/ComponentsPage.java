package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {
    By componentsText = By.xpath("//div[@id='content']/h2");
    public String getComponentsText() {
        return getTextFromElement(componentsText);
    }

}
