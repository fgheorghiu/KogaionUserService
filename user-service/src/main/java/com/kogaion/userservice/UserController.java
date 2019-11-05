package com.kogaion.userservice;

import com.kogaion.userservice.entities.User;
import com.kogaion.userservice.services.UserService;
import com.kogaion.userservice.services.UserServiceContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
public class UserController implements UserControllerInterface {

    @Autowired
    private UserServiceContract userService;

    public UserController() {

    }

    @RequestMapping(value = "/users", method = RequestMethod.POST, produces = "application/json")
    @Override
    public User createUser(@RequestBody User user) {

        return user;
    }

    @RequestMapping(value = "/users", method = RequestMethod.DELETE, produces = "application/json")
    @Override
    public User deleteUser() {

        User result = new User();

        return result;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    @Override
    public User getUser(@RequestParam(name = "email") String email) {
        return userService.searchUserByEmail(email);
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT, produces = "application/json")
    @Override
    public User updateUser(User user) {

        User result = new User();

        return result;
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public void login(Principal principal) {
        System.out.println("Principal: " + principal.getName());
    }
}
