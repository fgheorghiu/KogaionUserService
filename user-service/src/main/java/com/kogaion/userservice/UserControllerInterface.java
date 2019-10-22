package com.kogaion.userservice;

import com.kogaion.userservice.entities.User;

public interface UserControllerInterface {

    User createUser();

    User deleteUser();

    User getUser(User user);

    User updateUser(User user);

}
