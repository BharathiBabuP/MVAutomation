package com.mintvelvet.test;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.pages.HomePage;
import com.mintvelvet.pages.SearchPage;
import com.mintvelvet.testdata.RedirectionalSearchDataEntity;
import com.mintvelvet.testdata.TestData;
import com.mintvelvet.utils.DataProviderUtils;
import com.mintvelvet.utils.logs.Log4j;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchRedirectionTest extends BaseTest {



    @FrameworkAnnotation(Author = "BiBi",Tag = "smoke")
    @Test(dataProvider = "getRedirectionalSearchTestData",dataProviderClass = DataProviderUtils.class ,description = "To check whether the search of unique product returns the correct results")

    public void searchProductRedirectionTest(RedirectionalSearchDataEntity testData) throws InterruptedException {


        Log4j.info("start");
        Log4j.debug("Sample DEBUG message");
        Log4j.error("Sample ERROR message");
        Log4j.info("Sample INFO message");
        Log4j.fatal("Sample Fatal message");
        Log4j.warn("Sample WARN message");


        String strExpectedRedirectionalSreachTile=testData.expectedSearchPage;
        String strExpectedRedirectionalSearchDescription=testData.expectedDescription;
        HomePage homepage=new HomePage();

        SearchPage searchpage = homepage
                .clickAcceptCookies()
                .clickIconMobileSearch();

        String strActualRedirectionalSearchTitle =searchpage
                .setSearchBox(testData.searchitem)
                .clickIconSearch()
                .getRedirectionalSearchTitleHeader();

        String strActualRedirectionalSearchDescription=searchpage.
                getRedirectionalSearchHeaderDescription();

        SoftAssertions.assertSoftly((softly->{
            softly.assertThat(strActualRedirectionalSearchTitle).isEqualTo(strExpectedRedirectionalSreachTile);
            softly.assertThat(strActualRedirectionalSearchDescription).isEqualTo(strExpectedRedirectionalSearchDescription);
        }));



    }





}
