package com.mintvelvet.utils;

import com.mintvelvet.testdata.*;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.*;
import one.util.streamex.StreamEx;

import java.lang.reflect.Method;

public class DataProviderUtils {


    @DataSupplier(runInParallel = false)
    public StreamEx<ExcelUserEntity> getExcelData(Method method){


        return TestDataReader.use(XlsxReader.class)
                .withTarget(ExcelUserEntity.class)
                //.withSource("testdata.xlsx")
                .read();
              //  .filter(testdata->testdata.testCaseName.equalsIgnoreCase(method.getName()));
    }

    @DataSupplier(runInParallel = false)
    public StreamEx<TestData> getData2(Method method){


        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testdata.xlsx")
                .read()
          .filter(testdata->testdata.testCaseName.equalsIgnoreCase(method.getName()));
    }

    @DataSupplier(runInParallel = false)
    public StreamEx<CsvUserEntity> getCSVUsers(){

        return TestDataReader.use(CsvReader.class)
                .withTarget(CsvUserEntity.class)
                .read() ;
    }


    @DataSupplier
    public StreamEx<JsonUserEntity> getJsonUsers() {
        return TestDataReader.use(JsonReader.class).withTarget(JsonUserEntity.class).read();
    }


    @DataSupplier
    public StreamEx<yamlUserEntity> getYamlUsers() {
        return TestDataReader.use(YamlReader.class).withTarget(yamlUserEntity.class).read();
    }
}
