package com.mintvelvet.test.home;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.pages.HomePage;
import com.mintvelvet.pages.ShoppingBagPage;
import com.mintvelvet.test.BaseTest;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

public class TC_005_MV_HOME_VERIFY_HEADER_CART_CLICK_TEST extends BaseTest {


    @FrameworkAnnotation(Author = "BB",Tag = "Regression")
    @Test(description = "Verify the Home Page Header display all the components")
    public void verifyHomeCartIconClickOpensShoppingBagPage(){


        HomePage homepage=new HomePage();
        ShoppingBagPage shoppingBagPage =homepage
                .clickAcceptCookies()
                        .clickCartIcon();



        SoftAssertions.assertSoftly((softly->{
            softly.assertThat(shoppingBagPage.isShoppingBagTEXTDisplayed()).isTrue();


        }));
    }

}
