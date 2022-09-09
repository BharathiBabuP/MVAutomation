package com.mintvelvet.pages;

import com.mintvelvet.enums.WaitType;
import com.mintvelvet.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class ShoppingBagPage {

    private static final By TXT_SHOPPING_BAG =By.xpath("//h1[normalize-space()='Shopping bag' and @class='title']");

    public Boolean isShoppingBagTEXTDisplayed()
    {
        return SeleniumUtils.isDisplayed(TXT_SHOPPING_BAG, WaitType.PRESENCE,"Shopping Bag text");

    }
}
