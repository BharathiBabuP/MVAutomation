package com.mintvelvet.pages;

import com.mintvelvet.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class ProductDetailsPage {

    private static final By BTN_LENGHT_LONG =By.xpath("//div[@class='product-overlay__variants-wrapper']//label[@title='Long']");
    public static final By BTN_CHOOSE_THE_SIZE =By.xpath("(//div[contains(@role,'button')][normalize-space()='Choose your Size'])[3]");
    public static final By SELECT_DEFAULT_SIZE10 =By.xpath("//li[@role='option']//label[@for='SingleOptionSelector1-10']");
    public static final By BTN_ADD_TO_BAG =By.xpath("//div[@class='product-single__details']//following-sibling::button[@aria-label='Add to bag']");



    public ProductDetailsPage clickLengthLong(){
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).click();
        SeleniumUtils.click(BTN_LENGHT_LONG,"Button Length long");

        return this;
    }

    public ProductDetailsPage clickChooseTheSize(){
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).click();
        SeleniumUtils.click(BTN_CHOOSE_THE_SIZE,"Choose the Size combo box ");

        return this;
    }


    public ProductDetailsPage clickDefaultSize10(){
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).click();
        SeleniumUtils.click(SELECT_DEFAULT_SIZE10,"Select Size 10 as Default ");

        return this;
    }

    public CheckOutPage clickAddonBag(){
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).click();
        SeleniumUtils.click(BTN_ADD_TO_BAG,"Add to bag button ");

        return new CheckOutPage();
    }
}
