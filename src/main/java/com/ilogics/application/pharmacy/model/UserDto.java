package com.ilogics.application.pharmacy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {

    private int id;
    private String fullName;
    private String username;
    private String password;
}
