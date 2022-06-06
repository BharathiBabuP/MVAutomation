package com.mintvelvet.testdata;
import io.github.sskorol.converters.BooleanConverter;
import io.github.sskorol.converters.IntegerConverter;
import io.github.sskorol.converters.LocalDateConverter;
import io.github.sskorol.data.Column;
import io.github.sskorol.data.Sheet;
import io.github.sskorol.data.Source;
import lombok.Data;

import java.time.LocalDate;


@Source(path = "testdata.xlsx")
@Sheet(name = "exampleSheet")
@Data
public class ExcelUserEntity {


    @Column(name="testcasename")
    public String testCaseName;
    @Column(name="Username")
    public String userName;
    @Column(name="Password")
    public String password;

   @Column(name="age", converter = IntegerConverter.class)
    public int age;

    @Column(name="date", converter = LocalDateConverter.class)
   public LocalDate date;

   @Column(name="returnType" , converter = BooleanConverter.class)
   public boolean returnType;



}
