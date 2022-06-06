package com.mintvelvet.test;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.pages.HomePage;
import com.mintvelvet.testdata.TestData;
import com.mintvelvet.utils.DataProviderUtils;
import com.mintvelvet.utils.logs.Log4j;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {



    @FrameworkAnnotation(Author = "BiBi",Tag = "smoke")
    @Test(dataProvider = "getData2",dataProviderClass = DataProviderUtils.class ,description = "To check whether the search returns the correct results")

    public void searchProductTest(TestData testData) throws InterruptedException {


        Log4j.info("start");
        Log4j.debug("Sample DEBUG message");
        Log4j.error("Sample ERROR message");
        Log4j.info("Sample INFO message");
        Log4j.fatal("Sample Fatal message");
        Log4j.warn("Sample WARN message");

        HomePage homepage=new HomePage();
        String strActualSearchTitle =homepage
                .clickAcceptCookies()
                .clickIconMobileSearch()
                .clickTextSearchBox()
                .setSearchBox(testData.searchItem)
                .clickIconSearch()
                .getSearchTitleHeader();

        Assert.assertEquals(strActualSearchTitle, "You searched for "+'"'+ testData.searchItem +'"' );


        Assertions.assertThat(strActualSearchTitle).isEqualTo("You searched for "+'"'+ testData.searchItem +'"' );


    }





}
