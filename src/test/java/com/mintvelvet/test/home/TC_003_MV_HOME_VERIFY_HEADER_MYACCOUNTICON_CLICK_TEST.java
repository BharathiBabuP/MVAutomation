package com.mintvelvet.test.home;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.pages.HomePage;
import com.mintvelvet.pages.MyAccountPage;
import com.mintvelvet.pages.SearchPage;
import com.mintvelvet.test.BaseTest;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

public class TC_003_MV_HOME_VERIFY_HEADER_MYACCOUNTICON_CLICK_TEST extends BaseTest {


    @FrameworkAnnotation(Author = "BB",Tag = "Regression")
    @Test(description = "Verify the Home Page Header display all the components")
    public void verifyHomeMyAccountIconClickOpensMyAccountLoginForm(){


        HomePage homepage=new HomePage();
        MyAccountPage myAccountPage =homepage
                .clickAcceptCookies()
                .clickMyAccountIcon();




        SoftAssertions.assertSoftly((softly->{
            softly.assertThat(myAccountPage.isMyAcountLoginFormDisplayed()).isTrue();


        }));
    }
}
