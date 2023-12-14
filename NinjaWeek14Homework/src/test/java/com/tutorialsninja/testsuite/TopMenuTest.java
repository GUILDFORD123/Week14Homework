package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ComponentsPage componentsPage = new ComponentsPage();
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnDesktopLink();
//        1.3 Verify the text ‘Desktops’
        String actualResult = desktopPage.getDesktopText();
        String expectedResult = "Desktops";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homePage.clickOnLaptopsAndNotebooksLink();
//        2.3 Verify the text ‘Laptops & Notebooks’
        String actualResult = laptopsAndNotebooksPage.getLaptopsText();
        String expectedResult = "Laptops & Notebooks";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homePage.clickOnComponentsLink();
//        3.3 Verify the text ‘Components’
        String actualResult = componentsPage.getComponentsText();
        String expectedResult = "Components";
        Assert.assertEquals(actualResult,expectedResult);
    }
}
