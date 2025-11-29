package com.kbo.domain.user.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String userName;
    private int age;
    private boolean sex;
    private String fandom;
    private String email;
}
