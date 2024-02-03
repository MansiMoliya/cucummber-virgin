package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    @CacheLookup
    @FindBy(className = "dialog_button")
    WebElement cookies;

    @CacheLookup
    @FindBy(id = "dialog_accept_all")
    WebElement acceptCookie;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='StyledNavigationMenuList-sc-v46bks-1 ctndtu nav-bar']/li")
    List<WebElement> topMenu;
    public void clickOnAcceptBtn(){
        clickOnElement(cookies);
    }
    public void clickOnAcceptCookie(){
        clickOnElement(acceptCookie);
    }
    public void selectMenu(String menu) {
        try {
            for (WebElement element : topMenu) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                    log.info("Selecting menu " + menu);
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }
}
