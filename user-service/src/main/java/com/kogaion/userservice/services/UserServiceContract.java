package com.kogaion.userservice.services;

import com.kogaion.userservice.entities.User;
import org.springframework.stereotype.Component;

@Component
public interface UserServiceContract {

    public User searchUserByUsername(String username);

    public User searchUserById(long userId);

    public User searchUserByEmail(String userEmail);

}
