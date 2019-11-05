package com.kogaion.userservice;

import com.kogaion.userservice.entities.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserControllerInterface {

    User createUser(@RequestBody User user);

    User deleteUser();

    User getUser(User user);

    User updateUser(User user);

}