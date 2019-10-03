package com.ilogics.application.pharmacy.repository.postgres;

import com.ilogics.application.pharmacy.entity.UserEntity;
import com.ilogics.application.pharmacy.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryPostgres implements UserRepository {
    @Override
    public UserEntity findByUsername(String username) {
        return null;
    }
}
