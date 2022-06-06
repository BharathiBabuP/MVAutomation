package com.mintvelvet.test.DummyDataProviderTestCollections;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.enums.CategoryType;
import com.mintvelvet.test.BaseTest;
import com.mintvelvet.testdata.ExcelUserEntity;
import com.mintvelvet.utils.DataProviderUtils;
import org.testng.annotations.Test;

public class excelExampleTest extends BaseTest {
    @FrameworkAnnotation(Author = {"BiBi","Tester"} ,Category = {CategoryType.REGRESSION,CategoryType.SMOKE})
    @Test(dataProvider = "getExcelData", dataProviderClass = DataProviderUtils.class)
    public void excelDataProviderTest(ExcelUserEntity testData) {

        System.out.println(testData.testCaseName);
        System.out.println(testData.age);
      System.out.println(testData.returnType);
        System.out.println(testData.date);
        System.out.println(testData.password);
        System.out.println(testData.userName);


    }

}
