package com.ilogics.application.pharmacy.repository;

import com.ilogics.application.pharmacy.entity.UserEntity;

public interface UserRepository {

    UserEntity findByUsername(String username);

    UserEntity findById(Long id);
}
