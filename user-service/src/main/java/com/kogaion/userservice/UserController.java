package com.kogaion.userservice;

import com.kogaion.userservice.entities.User;
import com.kogaion.userservice.services.UserServiceContract;
import org.keycloak.representations.AccessTokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserControllerInterface {

    @Autowired
    private UserServiceContract userService;

    public UserController() {

    }

    @RequestMapping(value = "/users", method = RequestMethod.POST, produces = "application/json")
    @Override
    public ResponseEntity<String> createUser(@RequestBody User user) {

        return userService.registerUser(user);
    }

    @RequestMapping(value = "/users", method = RequestMethod.DELETE, produces = "application/json")
    @Override
    public User deleteUser(@RequestBody User user) {

//        Keycloak keycloak = Keycloak.getInstance(serverUrl, realmName, username, password, clientId, clientSecret);
//        Response createUserResponse = keycloak.realm(realmName).users().get(user.get)
//        createUserResponse.close();
        User result = new User();

        return result;
    }

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public AccessTokenResponse login(@RequestBody User user) {

        return userService.loginUser(user);
    }

    @Override
    public User logout() {
        return null;
    }

}
