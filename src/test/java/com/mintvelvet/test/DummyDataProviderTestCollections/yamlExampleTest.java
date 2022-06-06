package com.mintvelvet.test.DummyDataProviderTestCollections;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.enums.CategoryType;
import com.mintvelvet.test.BaseTest;
import com.mintvelvet.testdata.JsonUserEntity;
import com.mintvelvet.testdata.yamlUserEntity;
import com.mintvelvet.utils.DataProviderUtils;
import org.testng.annotations.Test;

public class yamlExampleTest  extends BaseTest {

    @FrameworkAnnotation(Author = {"BiBi","Tester"} ,Category = {CategoryType.REGRESSION,CategoryType.SMOKE})
    @Test(dataProvider = "getYamlUsers", dataProviderClass = DataProviderUtils.class)
    public void yamlDataProviderTest(yamlUserEntity testData) {

        System.out.println(testData.getName());
        System.out.println(testData.getPassword());
    }
}
