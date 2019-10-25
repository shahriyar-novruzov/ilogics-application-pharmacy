package com.ilogics.application.pharmacy.service.impl;

import com.ilogics.application.pharmacy.entity.UserEntity;
import com.ilogics.application.pharmacy.model.UserDto;
import com.ilogics.application.pharmacy.repository.UserRepository;
import com.ilogics.application.pharmacy.repository.mapper.UserMapper;
import com.ilogics.application.pharmacy.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserRepository userRepository;
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username);

        logger.debug("loadUser {}", user);

        if (user == null) throw new UsernameNotFoundException("Username " + username + " not found");

        return user;
    }

    @Override
    public UserDto findUserById(Long id) {

        UserEntity user = userRepository.findById(id);

        logger.debug("findUser {}", user);

        if (user == null) throw new UsernameNotFoundException("Id " + id + " not found");

        return UserMapper.INSTANCE.userEntityToUserDto(user);
    }
}
