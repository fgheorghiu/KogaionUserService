package com.kogaion.userservice;

import com.kogaion.userservice.entities.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserControllerInterface {

    User createUser(@RequestBody User user);

    User deleteUser();

    User getUser(@RequestParam(name = "email") String email);

    User updateUser(User user);

}