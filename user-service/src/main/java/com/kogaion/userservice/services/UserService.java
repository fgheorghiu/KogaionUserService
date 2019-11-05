package com.kogaion.userservice.services;

import com.kogaion.userservice.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceContract {

    private List<User> users = new ArrayList<>();

    public UserService() {
        User user = new User();
            user.setEmail("flv@yahoo.com");
            user.setFirstName("flavian");

        users.add(user);
        user = new User();
            user.setEmail("ghe@yahoo.com");
            user.setFirstName("gheorghiu");

        users.add(user);
    }

    @Override
    public User searchUserByUsername(String username) {
        System.out.println("Username is: " + username);
        for(User u: users) {
            if(u.getFirstName().equals(username))
                return u;
        }

        return null;
    }

    @Override
    public User searchUserById(long userId) {
        return null;
    }

    @Override
    public User searchUserByEmail(String userEmail) {

        System.out.println("Email is: " + userEmail);

        for(User u: users) {
            if(u.getEmail().equals(userEmail))
                return u;
        }

        return null;
    }
}
