package com.ilogics.application.pharmacy.service.impl;

import com.ilogics.application.pharmacy.auth.JwtTokenUtil;
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

    private final JwtTokenUtil jwtTokenUtil;

    private final UserService userService;

    public AuthenticationServiceImpl(AuthenticationManager authenticationManager,
                                     UserService userService,
                                     JwtTokenUtil jwtTokenUtil) {
        this.authenticationManager = authenticationManager;
        this.userService = userService;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    public AuthToken authenticate(UserDto loginUser) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword()));

        String token = jwtTokenUtil.generateToken(loginUser.getUsername());

        return AuthToken
                .builder()
                .token(token)
                .username(loginUser.getUsername())
                .build();
    }
}
