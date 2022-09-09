package com.mintvelvet.pages;

import com.mintvelvet.enums.WaitType;
import com.mintvelvet.pages.pagecomponent.TopMenuComponent;
import com.mintvelvet.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class HomePage {

    private TopMenuComponent topMenuComponent;

    public HomePage(){

        topMenuComponent= new TopMenuComponent();
    }

    private static final By BTN_ACCEPT_COOKIES =By.xpath("//button[@id='onetrust-accept-btn-handler']");
    private static final By ICON_MOBILE_SEARCH =By.xpath("//div[@class='header-middle__right']//following-sibling::button");


    public HomePage clickAcceptCookies(){
        SeleniumUtils.click(BTN_ACCEPT_COOKIES, WaitType.PRESENCE,"btn_Accept_Cookies");
        return this;
    }

    public SearchPage clickIconMobileSearch(){
        SeleniumUtils.click(ICON_MOBILE_SEARCH, "icon_mobile_Search");
        return new SearchPage();
    }

    public Boolean isMVLogoDisplayed(){
        return topMenuComponent.isMVLOGODisplayed();
    }

    public Boolean isMenuNewINDisplayed(){
        return topMenuComponent.isMenuNewINDisplayed();
    }

    public Boolean isMenuClothingDisplayed(){
        return topMenuComponent.isMenuClothingDisplayed();
    }
    public Boolean isMenuShoesDisplayed(){
        return topMenuComponent.isMenuShoesDisplayed();
    }
    public Boolean isMenuAccessoriesDisplayed(){
        return topMenuComponent.isMenuAccessoriesDisplayed();
    }
    public Boolean isMenuKidsDisplayed(){
        return topMenuComponent.isMenuKidsDisplayed();
    }
    public Boolean isSearchButtonDisplayed(){
        return topMenuComponent.isSearchButtonDisplayed();
    }
    public Boolean isAccountIconDisplayed(){
        return topMenuComponent.isAccountIconDisplayed();
    }
    public Boolean isWishListIconDisplayed(){
        return topMenuComponent.isWishListIconDisplayed();
    }

    public Boolean isCartIconDisplayed(){
        return topMenuComponent.isCartIconDisplayed();
    }

    public SearchPage clickSearchIcon(){

        topMenuComponent.clickSearchIcon();
        return new SearchPage();
    }


    public MyAccountPage clickMyAccountIcon(){

        topMenuComponent.clickMyAccountIcon();
        return new MyAccountPage();
    }


    public WishlistPage clickWishlistIcon(){

        topMenuComponent.clickWishlistIcon();
        return new WishlistPage();
    }


    public ShoppingBagPage clickCartIcon(){

        topMenuComponent.clickCartIcon();
        return new ShoppingBagPage();
    }

}
