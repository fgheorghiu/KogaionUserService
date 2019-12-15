package com.kogaion.userservice.services;

import com.kogaion.userservice.entities.User;
import com.kogaion.userservice.responses.UserHttpResponse;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.authorization.client.AuthzClient;
import org.keycloak.representations.AccessTokenResponse;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.core.Response;

@Service
public class UserService implements UserServiceContract {

    private String serverUrl = "http://localhost:8080/auth";
    private String realmName = "master";
    private String username = "admin";
    private String password = "admin";
    private String clientId = "admin-cli";
    private String clientSecret = "31f1163d-665f-419e-abaf-ec4399b76887";

    private Keycloak keycloak = Keycloak.getInstance(serverUrl, realmName, username, password, clientId, clientSecret);

    @Override
    public AccessTokenResponse loginUser(User user) {

        AuthzClient authzClient = AuthzClient.create();

        AccessTokenResponse response = authzClient.obtainAccessToken(user.getUsername(), user.getPassword());

        return response;
    }

    @Override
    public User logoutUser(User user) {

        RestTemplate restTemplate = new RestTemplate();
        String url = serverUrl + "/realms/" + realmName + "/protocol/openid-connect/logout";

        String result = restTemplate.getForObject(url, String.class, "42", "21");

        http://auth-server/auth/realms/{realm-name}/protocol/openid-connect/logout?redirect_uri=encodedRedirectUri

        return null;
    }

    @Override
    public ResponseEntity<String> registerUser(User user) {

        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setUsername(user.getUsername());
        userRepresentation.setFirstName(user.getFirstName());
        userRepresentation.setLastName(user.getLastName());
        userRepresentation.setEmail(user.getEmail());
        userRepresentation.setEnabled(true);

        Response createUserResponse = keycloak.realm(realmName).users().create(userRepresentation);

        UserHttpResponse userHttpResponse = new UserHttpResponse(createUserResponse.getStatus());

        if(createUserResponse.getStatus() == 201)
            return new ResponseEntity("{\"message\":\"created\"}", HttpStatus.OK);

        return new ResponseEntity("{\"message\":\"unknown error\"}", HttpStatus.BAD_REQUEST);
    }

    @Override
    public User deleteUser(User user) {

        keycloak.realm(realmName).users().get(user.getUsername()).remove();

        return null;
    }
}
