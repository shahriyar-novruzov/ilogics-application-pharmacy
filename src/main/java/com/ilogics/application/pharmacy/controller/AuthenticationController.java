package com.ilogics.application.pharmacy.controller;

import com.ilogics.application.pharmacy.model.AuthToken;
import com.ilogics.application.pharmacy.model.UserDto;
import com.ilogics.application.pharmacy.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path = "${root.url}")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public ResponseEntity<AuthToken> register(@RequestBody @NotNull UserDto loginUser) {
        return ResponseEntity.ok(authenticationService.authenticate(loginUser));
    }
}
