package com.example.caching.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.caching.entity.User;
import com.example.caching.service.IUserService;

@RestController
@RequestMapping(value = UserController.PATH, produces = { "application/json; charset=utf-8" })
public class UserController {

    protected static final String PATH = "/1.0/users";

    @Autowired
    IUserService gIUserService;

    @RequestMapping(value = "/all")
    public List<User> allUsers() {
        return gIUserService.listUser();
    }

    @RequestMapping(value = "/add")
    public Long addUser() {

        final User vUser = new User();
        vUser.setFirstName("Saahas");
        vUser.setLastName("Kulkarni");
        return gIUserService.createNewUser(vUser);
    }

}
