package com.example.hoang.ss14;

/**
 * Created by hoang on 4/15/2018.
 */

public class Login {
    public class LoginRequest{
         public String username;
         public String password;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }};
    public class LoginResponse{
        public boolean success;
        public String message;

    }
}
