package com.mintvelvet.pages;

import com.mintvelvet.enums.WaitType;
import com.mintvelvet.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class MyAccountPage {


    private static final By MYACCOUNT_LOGIN_FORM =By.xpath("//div[@id='login-form']");

    public Boolean isMyAcountLoginFormDisplayed()
    {
        return SeleniumUtils.isDisplayed(MYACCOUNT_LOGIN_FORM, WaitType.PRESENCE,"My Account Login Form");

    }
}
