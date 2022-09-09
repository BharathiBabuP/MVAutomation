package com.mintvelvet.test.home;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.pages.HomePage;
import com.mintvelvet.pages.SearchPage;
import com.mintvelvet.test.BaseTest;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;


public class TC_002_MV_HOME_VERIFY_HEADER_SEARCHICON_CLICK_TEST extends BaseTest {

    @FrameworkAnnotation(Author = "BB",Tag = "Regression")
    @Test(description = "Verify the Home Page Header display all the components")
    public void verifyHomeSearchIconClickOpensSearchOverlay(){


        HomePage homepage=new HomePage();
        SearchPage searchPage =homepage.clickAcceptCookies()
                .clickSearchIcon();



        SoftAssertions.assertSoftly((softly->{
            softly.assertThat(searchPage.isSearchBoxDisplayed()).isTrue();


        }));
    }

}
