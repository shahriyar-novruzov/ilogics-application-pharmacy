package com.developia.application.pharmacy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by shnovruzov on 10/02/2019.
 */
@Controller
public class DashboardController {

    @RequestMapping(method = RequestMethod.GET, value = "/developia/dashboard")
    public ResponseEntity<String> dashboard() {
        return new ResponseEntity<String>("dashboard", HttpStatus.OK);
    }

}