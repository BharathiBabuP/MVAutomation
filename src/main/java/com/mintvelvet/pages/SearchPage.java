package com.mintvelvet.pages;

import com.mintvelvet.enums.WaitType;
import com.mintvelvet.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class SearchPage {

    private static final By TXT_SEARCH_BOX =By.xpath("//div[@class='search-app__bar']//following-sibling::input");
    public static final By ICON_SEARCH =By.xpath("//div[@class='search-app__bar']//preceding-sibling::button//*[name()='svg']");
    public static final By HEADER_SEARCH_TITLE =By.xpath("//div[@class='searched-term-detail']/p");

    public static final By REDIRECTION_HEADER_SEARCH_TITLE =By.xpath("//h1[contains(@class,'title')]");

    public static final By REDIRECTION_HEADER_SEARCH_DESCRIPTION=By.xpath("//div[@class='description desktop']");

    //div[@class='search-app__cards-container']//following-sibling::div[@class='search-app__image']
    //div[@class='search-app__cards-container']//preceding-sibling::div[@class='search-app__image']

    //div[@class='search-app__cards-container']//following-sibling::div[@class='search-app__info']




    public static final String PRODUCT_ITEM_BY_NAME ="Black Bootcut Jeans";

    public SearchPage clickTextSearchBox(){

        SeleniumUtils.click(TXT_SEARCH_BOX,"txt_Search_Box");
        return this;
    }

    public Boolean isSearchBoxDisplayed()
    {
        return SeleniumUtils.isDisplayed(TXT_SEARCH_BOX, WaitType.PRESENCE,"txt_search_Box");

    }

    public SearchPage setSearchBox(String strSearchItem) throws InterruptedException {

        SeleniumUtils.sendKeys(TXT_SEARCH_BOX,strSearchItem,"txt_Search_Box");
        return this;
    }

    public SearchPage clickIconSearch() {

        SeleniumUtils.click(ICON_SEARCH,"icon_Search");
        return this;
    }

    public String getSearchTitleHeader(){

        return SeleniumUtils.getText(HEADER_SEARCH_TITLE,"header_search_tile");
    }

    public String getRedirectionalSearchTitleHeader(){

        return SeleniumUtils.getText(REDIRECTION_HEADER_SEARCH_TITLE,"redirection_header_search_tile");
    }

    public String getRedirectionalSearchHeaderDescription(){

        return SeleniumUtils.getText(REDIRECTION_HEADER_SEARCH_DESCRIPTION,"redirection_header_search_description");
    }


    public ProductDetailsPage clickProductByName(String PRODUCT_ITEM_BY_NAME) {

      //  SeleniumUtils.click(SeleniumUtils.getProductItemByName(PRODUCT_ITEM_BY_NAME),"Black Bootcut Jeans");
        return new ProductDetailsPage();
    }
}
