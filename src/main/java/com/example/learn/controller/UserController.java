package com.example.learn.controller;

import com.example.learn.controller.exception.APIException;
import com.example.learn.domain.User;
import com.example.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.insertUser(user);
    }

    @GetMapping
    @ResponseBody
    public User getUser(@RequestAttribute("user_id") String userId) throws APIException {
        User user;
        try {
            user = userService.getUser(userId);
        } catch (Exception e) {
            throw new APIException(500, e.getMessage());
        }
        return user;
    }

    @PutMapping
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser() {

    }

}
