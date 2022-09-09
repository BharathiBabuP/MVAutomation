package com.mintvelvet.pages;

import com.mintvelvet.enums.WaitType;
import com.mintvelvet.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class WishlistPage {


    private static final By TXT_MY_WISHLIST =By.xpath("//div[normalize-space()='My Wishlist']");

    public Boolean isWishlistPageDisplayed()
    {
        return SeleniumUtils.isDisplayed(TXT_MY_WISHLIST, WaitType.PRESENCE,"My Wishlist text");

    }
}

