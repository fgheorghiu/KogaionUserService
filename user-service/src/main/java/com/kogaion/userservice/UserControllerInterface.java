package com.kogaion.userservice;

import com.kogaion.userservice.entities.User;
import org.keycloak.representations.AccessTokenResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.core.Response;

public interface UserControllerInterface {

    ResponseEntity<String> createUser(@RequestBody User user);

    User deleteUser(@RequestBody User user);

    AccessTokenResponse login(@RequestBody User user);

    User logout();

}