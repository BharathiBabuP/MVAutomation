package com.mintvelvet.testdata;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sskorol.data.Source;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Source(path = "users.yml")
@NoArgsConstructor
public class yamlUserEntity {

    @JsonProperty("username")
    private  String name;
    private  String password;
}
