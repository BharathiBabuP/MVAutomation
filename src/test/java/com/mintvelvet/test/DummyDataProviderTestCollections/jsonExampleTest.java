package com.mintvelvet.test.DummyDataProviderTestCollections;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.enums.CategoryType;
import com.mintvelvet.test.BaseTest;
import com.mintvelvet.testdata.JsonUserEntity;
import com.mintvelvet.utils.DataProviderUtils;
import org.testng.annotations.Test;

public class jsonExampleTest extends BaseTest {

    @FrameworkAnnotation(Author = {"BiBi","Tester"} ,Category = {CategoryType.REGRESSION,CategoryType.SMOKE})
    @Test(dataProvider = "getJsonUsers", dataProviderClass = DataProviderUtils.class)
    public void jsonDataProviderTest(final JsonUserEntity testData) {

        System.out.println(testData.getName());
        System.out.println(testData.getPassword());
    }
}
