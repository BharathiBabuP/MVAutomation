package com.mintvelvet.test.home;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.pages.HomePage;
import com.mintvelvet.test.BaseTest;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;


public class TC_001_MV_HOME_VERIFY_HEADER_TEST extends BaseTest {


    @FrameworkAnnotation(Author = "BB",Tag = "Regression")
    @Test(description = "Verify the Home Page Header display all the components")
    public void verifyHomeHeader(){

        HomePage homepage=new HomePage();
        homepage.clickAcceptCookies();

        SoftAssertions.assertSoftly((softly->{
            softly.assertThat(homepage.isMVLogoDisplayed()).isTrue();
            softly.assertThat(homepage.isMenuNewINDisplayed()).isTrue();
            softly.assertThat(homepage.isMenuClothingDisplayed()).isTrue();
            softly.assertThat(homepage.isMenuShoesDisplayed()).isTrue();
            softly.assertThat(homepage.isMenuAccessoriesDisplayed()).isTrue();
            softly.assertThat(homepage.isMenuKidsDisplayed()).isTrue();
            softly.assertThat(homepage.isSearchButtonDisplayed()).isTrue();
            softly.assertThat(homepage.isAccountIconDisplayed()).isTrue();
            softly.assertThat(homepage.isWishListIconDisplayed()).isTrue();
            softly.assertThat(homepage.isCartIconDisplayed()).isTrue();

        }));


    }

}
