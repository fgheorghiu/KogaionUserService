package com.kogaion.userservice.responses;

public class UserHttpResponse {

    private String message;

    private int statusCode;

    public UserHttpResponse(int statusCode) {

        if(statusCode == 201)
            this.message = StandardMessages.USER_CREATED;
    }

    public UserHttpResponse(int statusCode, String message) {

        this.statusCode = statusCode;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
