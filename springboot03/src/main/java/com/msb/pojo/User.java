package com.msb.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    private Integer uid;
    private String uname;
    private String upassword;
}
