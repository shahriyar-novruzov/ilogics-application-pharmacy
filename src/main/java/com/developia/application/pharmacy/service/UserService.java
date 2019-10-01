package com.developia.application.pharmacy.service;

import com.developia.application.pharmacy.object.User;
import com.developia.application.pharmacy.object.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);

    User findOne(String username);

    User findById(long id);

    UserDto update(UserDto userDto);
}
