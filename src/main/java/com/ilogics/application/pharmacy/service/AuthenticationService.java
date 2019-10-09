package com.ilogics.application.pharmacy.service;

import com.ilogics.application.pharmacy.model.AuthToken;
import com.ilogics.application.pharmacy.model.UserDto;

public interface AuthenticationService {
    AuthToken authenticate(UserDto user);
}
