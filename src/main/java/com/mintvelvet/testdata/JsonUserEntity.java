package com.mintvelvet.testdata;

import com.google.gson.annotations.SerializedName;
import io.github.sskorol.data.Source;
import lombok.Data;

@Source(path = "users.json")
@Data
public class JsonUserEntity {

    @SerializedName("username")
    private final String name;
    private final String password;
}
