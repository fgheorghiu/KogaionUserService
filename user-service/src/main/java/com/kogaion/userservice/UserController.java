package com.kogaion.userservice;

import com.kogaion.userservice.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserControllerInterface {

    @Override
    public User createUser() {

        User result = new User();

        return result;
    }

    @Override
    public User deleteUser() {

        User result = new User();

        return result;
    }

    @RequestMapping("/users")
    @Override
    public User getUser(User user) {

        User result = new User();

        return result;
    }

    @Override
    public User updateUser(User user) {

        User result = new User();

        return result;
    }
}
