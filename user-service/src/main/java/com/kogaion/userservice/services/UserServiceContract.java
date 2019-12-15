package com.kogaion.userservice.services;

import com.kogaion.userservice.entities.User;
import org.keycloak.representations.AccessTokenResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;

@Component
public interface UserServiceContract {

   AccessTokenResponse loginUser(User user);

   User logoutUser(User user);

   ResponseEntity<String> registerUser(User user);

   User deleteUser(User user);
}
