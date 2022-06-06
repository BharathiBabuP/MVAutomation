package com.mintvelvet.test.DummyDataProviderTestCollections;

import com.mintvelvet.enums.CategoryType;
import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.enums.CategoryType;
import com.mintvelvet.test.BaseTest;
import com.mintvelvet.testdata.CsvUserEntity;
import com.mintvelvet.utils.DataProviderUtils;
import org.testng.annotations.Test;

public class csvExampleTest  extends BaseTest {

    @FrameworkAnnotation(Author = {"BiBi","Tester"} ,Category = {CategoryType.REGRESSION,CategoryType.SMOKE})
    @Test(dataProvider = "getCSVUsers", dataProviderClass = DataProviderUtils.class)
    public void csvDataProviderTest(CsvUserEntity testData) {

        System.out.println(testData.getUsername());
        System.out.println(testData.getPassword());

      //  System.out.println(testData.testCaseName);






    }

}


