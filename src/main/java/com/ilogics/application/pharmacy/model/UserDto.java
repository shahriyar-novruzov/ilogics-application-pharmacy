package com.ilogics.application.pharmacy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserDto {

    private int id;
    private String fullName;
    private String username;
    private String password;
}
