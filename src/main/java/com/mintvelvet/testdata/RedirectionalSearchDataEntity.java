package com.mintvelvet.testdata;

import io.github.sskorol.data.Column;
import io.github.sskorol.data.Sheet;
import io.github.sskorol.data.Source;
import lombok.Data;

@Source(path = "testdata.xlsx")
@Sheet(name = "RedirectionalSearch")
@Data
public class RedirectionalSearchDataEntity {

    @Column(name="testcasename")
    public String testCaseName;

    @Column(name="searchitem")
    public String searchitem;

    @Column(name="expectedSearchPage")
    public String expectedSearchPage;

    @Column(name="expectedDescription")
    public String expectedDescription;
}
