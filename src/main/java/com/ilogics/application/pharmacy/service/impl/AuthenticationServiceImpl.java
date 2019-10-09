package com.ilogics.application.pharmacy.service.impl;

import com.ilogics.application.pharmacy.config.jwt.JwtTokenProvider;
import com.ilogics.application.pharmacy.model.AuthToken;
import com.ilogics.application.pharmacy.model.UserDto;
import com.ilogics.application.pharmacy.service.AuthenticationService;
import com.ilogics.application.pharmacy.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final AuthenticationManager authenticationManager;

    private final JwtTokenProvider jwtTokenProvider;

    private final UserService userService;

    public AuthenticationServiceImpl(AuthenticationManager authenticationManager,
                                     UserService userService,
                                     JwtTokenProvider jwtTokenProvider) {
        this.authenticationManager = authenticationManager;
        this.userService = userService;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public AuthToken authenticate(UserDto loginUser) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword()));

        String token = jwtTokenProvider.createToken(loginUser.getUsername());

        return AuthToken
                .builder()
                .token(token)
                .username(loginUser.getUsername())
                .build();
    }
}
