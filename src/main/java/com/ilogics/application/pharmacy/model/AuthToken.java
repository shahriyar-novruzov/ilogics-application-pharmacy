package com.ilogics.application.pharmacy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AuthToken {
    private String token;
    private String username;
}
