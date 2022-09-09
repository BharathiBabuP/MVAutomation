package com.mintvelvet.pages.pagecomponent;

import com.mintvelvet.enums.WaitType;
import com.mintvelvet.pages.HomePage;
import com.mintvelvet.pages.MyAccountPage;
import com.mintvelvet.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class TopMenuComponent {

    private static final By LOGO_MV=By.xpath("//a[@aria-label='logo']");
    private static final By MENU_NEWIN =By.xpath("//a[@class='link_megamenu desktop_link'][normalize-space()='New In']");
    private static final By MENU_CLOTHING =By.xpath("//a[@class='link_megamenu desktop_link'][normalize-space()='Clothing']");
    private static final By MENU_SHOES =By.xpath("//a[@class='link_megamenu desktop_link'][normalize-space()='Shoes']");
    private static final By MENU_ACCESSORIES =By.xpath("//a[@class='link_megamenu desktop_link'][normalize-space()='Accessories']");
    private static final By MENU_KIDS =By.xpath("//a[@class='link_megamenu desktop_link'][normalize-space()='Kids']");

    private static final By LINK_SEARCH_ICON =By.xpath("//div[@class='header-middle__item header-middle__item--quickSearch']//following-sibling::button");

    private static final By LINK_ACCOUNT_ICON =By.xpath("//div[@class='header-middle__item header-middle__item--account']//following-sibling::a[@aria-label='link']");

    private static final By LINK_WISHLIST_ICON =By.xpath("//div[@class='header-middle__item header-middle__item--wishlist']//following-sibling::a[@aria-label='link']");

    private static final By LINK_CART_ICON =By.xpath("(//div[@class='header-middle__item header-middle__item--cart']//following-sibling::a[@aria-label='cart'])[1]");


    public Boolean isMVLOGODisplayed()
    {
        return SeleniumUtils.isDisplayed(LOGO_MV, WaitType.PRESENCE,"Mintvelvet Logo");

    }

    public Boolean isMenuNewINDisplayed()
    {
        return SeleniumUtils.isDisplayed(MENU_NEWIN, WaitType.PRESENCE,"Menu NewIN ");

    }

    public Boolean isMenuClothingDisplayed()
    {
        return SeleniumUtils.isDisplayed(MENU_CLOTHING, WaitType.PRESENCE,"Menu Clothing");

    }

    public Boolean isMenuShoesDisplayed()
    {
        return SeleniumUtils.isDisplayed(MENU_SHOES, WaitType.PRESENCE,"New Shoes ");

    }

    public Boolean isMenuAccessoriesDisplayed()
    {
        return SeleniumUtils.isDisplayed(MENU_ACCESSORIES, WaitType.PRESENCE,"Menu Accessories");

    }

    public Boolean isMenuKidsDisplayed()
    {
        return SeleniumUtils.isDisplayed(MENU_KIDS, WaitType.PRESENCE,"Menu Kids");

    }

    public Boolean isSearchButtonDisplayed()
    {
        return SeleniumUtils.isDisplayed(LINK_SEARCH_ICON, WaitType.PRESENCE,"Search Button ");

    }

    public Boolean isAccountIconDisplayed()
    {
        return SeleniumUtils.isDisplayed(LINK_ACCOUNT_ICON, WaitType.PRESENCE,"Account Icon ");

    }

    public Boolean isWishListIconDisplayed()
    {
        return SeleniumUtils.isDisplayed(LINK_WISHLIST_ICON, WaitType.PRESENCE,"WishLost icon");

    }

    public Boolean isCartIconDisplayed()
    {
        return SeleniumUtils.isDisplayed(LINK_CART_ICON, WaitType.PRESENCE,"Cart Icon");

    }


    public void clickSearchIcon()
    {
         SeleniumUtils.click(LINK_SEARCH_ICON, WaitType.PRESENCE,"Search Button ");

    }


    public void clickMyAccountIcon(){

        SeleniumUtils.click(LINK_ACCOUNT_ICON, WaitType.PRESENCE,"My Account Icon ");
    }

    public void clickWishlistIcon(){

        SeleniumUtils.click(LINK_WISHLIST_ICON, WaitType.PRESENCE,"Wishlist Icon ");
    }


    public void clickCartIcon(){

        SeleniumUtils.click(LINK_CART_ICON, WaitType.PRESENCE,"Cart Icon ");
    }











}
