package com.developia.application.pharmacy.controller;

import com.developia.application.pharmacy.object.User;
import com.developia.application.pharmacy.object.model.ApiResponse;
import com.developia.application.pharmacy.object.model.UserDto;
import com.developia.application.pharmacy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ApiResponse<List<User>> listUser() {
        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.", userService.findAll());
    }

    @GetMapping("/users/{username}")
    public ApiResponse<User> getOne(@PathVariable String username) {
        User user = userService.findOne(username);
        HttpStatus httpStatus = user == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return new ApiResponse<>(httpStatus.value(), httpStatus.toString(), user);
    }

    @PutMapping("/users/{id}")
    public ApiResponse<UserDto> update(@RequestBody UserDto userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.", userService.update(userDto));
    }

    @DeleteMapping("/users/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        userService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }


}
