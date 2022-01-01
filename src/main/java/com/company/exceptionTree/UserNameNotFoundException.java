package com.company.exceptionTree;

public class UserNameNotFoundException extends RuntimeException{

    public UserNameNotFoundException(String message, String userName) {
        super(message);
        System.out.println(AuthError.USER_NAME_NOT_FOUND + ":"+ userName);

    }
}
enum AuthError{
    AUTHENTICATED_ERROR("ERROR"),
    USER_NAME_NOT_FOUND("USERNAME NOT FOUND"),
    PASSWORD_INVALID("PASSWORD INVALID");

    AuthError(String s) {
    }
}