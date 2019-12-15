package com.kogaion.userservice.entities;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class User {

    private String id;

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String email;

    private List<Long> familyMembersIds;

    private List<Long> friendsIds;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getFamilyMembersIds() {
        return familyMembersIds;
    }

    public void setFamilyMembersIds(List<Long> familyMembersIds) {
        this.familyMembersIds = familyMembersIds;
    }

    public List<Long> getFriendsIds() {
        return friendsIds;
    }

    public void setFriendsIds(List<Long> friendsIds) {
        this.friendsIds = friendsIds;
    }

    @Override
    public String toString() {

        String result = this.getFirstName() + " " + this.getLastName();

        return result;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}