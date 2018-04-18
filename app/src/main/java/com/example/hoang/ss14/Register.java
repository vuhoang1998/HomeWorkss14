package com.example.hoang.ss14;

/**
 * Created by hoang on 4/12/2018.
 */

public class Register {
    public class RegisterRequest{
        public String username;
        public String password;
        public String role;

        public RegisterRequest(String username, String password, String role) {
            this.username = username;
            this.password = password;
            this.role = role;
        }
    }

    public class RegisterResponse{
        public boolean success;
        public String message;

    }

}
