package com.mintvelvet.testdata;

import io.github.sskorol.data.FieldName;
import io.github.sskorol.data.Source;
import lombok.Data;

@Source(path = "user.csv")
@Data
public class CsvUserEntity {

    @FieldName("username")
    private final  String username;
    @FieldName("password")
    private final  String password;
}



