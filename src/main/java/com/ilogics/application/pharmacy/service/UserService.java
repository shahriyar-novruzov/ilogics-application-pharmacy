package com.ilogics.application.pharmacy.service;

import com.ilogics.application.pharmacy.model.UserDto;

public interface UserService {

    UserDto findUserById(Long id);
}
