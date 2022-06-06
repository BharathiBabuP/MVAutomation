package com.mintvelvet.testdata;


import io.github.sskorol.converters.IntegerConverter;
import io.github.sskorol.data.Column;
import io.github.sskorol.data.Sheet;

@Sheet(name = "Regression")
public class TestData {

    @Column(name="testcasename")
    public String testCaseName;
    @Column(name="searchitem")
    public String searchItem;
    @Column(name="testnumber", converter = IntegerConverter.class)
    public int testNumber;


}
