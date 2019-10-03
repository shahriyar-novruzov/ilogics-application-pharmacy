package com.ilogics.application.pharmacy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthToken {

    private String token;
    private String username;
}
