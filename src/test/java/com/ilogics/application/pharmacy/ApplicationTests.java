package com.ilogics.application.pharmacy;

import com.ilogics.application.pharmacy.controller.UserController;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

@Ignore
@RunWith(SpringRunner.class)
@WebMvcTest(value = UserController.class, secure = false)
public class ApplicationTests {


}

