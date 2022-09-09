package com.mintvelvet.test.home;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.pages.HomePage;
import com.mintvelvet.pages.MyAccountPage;
import com.mintvelvet.pages.WishlistPage;
import com.mintvelvet.test.BaseTest;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

public class TC_004_MV_HOME_VERIFY_HEADER_WISHLIST_CLICK_TEST extends BaseTest {


    @FrameworkAnnotation(Author = "BB",Tag = "Regression")
    @Test(description = "Verify the Home Page Header display all the components")
    public void verifyHomeWishListIconClickOpensWishListPage(){


        HomePage homepage=new HomePage();
        WishlistPage wishlistPage =homepage
                .clickAcceptCookies()
                .clickWishlistIcon();




        SoftAssertions.assertSoftly((softly->{
            softly.assertThat(wishlistPage.isWishlistPageDisplayed()).isTrue();


        }));
    }
}